### <a name="intro">Intro</a>
Filesystems are all around us they permeate our computing lives, almost always invisible. Like all hidden infrastructure they are essential to the modern functioning of society. Although filesystems play such an important role they are often bundled up with conversations about Operating Systems(OS). Filesystems *are* tightly coupled with operating systems, often in diagrams they are [shown](http://www.tldp.org/LDP/sag/html/overview-kernel.png) as part of the Kernel along with things like the Process, Network and Memory Managers, however filesystems are(on most systems) interchangeable. 

Due to the modular nature of many OSs the filesystem can be swapped out depending on the users need and wants. For instance some filesystems are fast others are reliable and other are highly compatible with other systems. This means that you may need to make a choice of filesystem to suit some specialized need, I hope to give you enough information so that you can know which features you need, and also a passing familiarity with some of the major filesystems.  

### <a name="what_is">What is a Filesystem?</a>
Most users never know that the filesystem exists, this is partially by design the average user has no need to interact with the filesystem and the complexities contained within would cause more confusion. However most standard computers users have used the [GUI](https://techterms.com/definition/gui) to interact with the filesystem, on Windows - File Explorer, and on macOS - Finder. The GUI provides an easy way to interact with the filesystem, the application can handle much of the formating and hide many of the complexities. 
##### <a name="trend">The progression of the filesystem</a>
There is a trend worth noting of hiding direct file access in newer OSs. For example early OSs were tightly coupled with the file hierarchy mostly out of necessity due to the limited computing power. With the advent of the GUI OS the file hierarchy was still visible but was constrained by preordained GUI actions. But with some of the most recent mobile OSs, notably iOS, the filesystem has all but disappeared. Android takes a more measured approach and still has a file viewer but files are clearly second class citizens. This was done so as to avoid many/all of the complexities of filesystems, however there were different complexities introduced as a byproduct of this shift away from the file system. Whether this shift is for better or worse still remains to be seen, more likely than not one devil has been traded for another. Regardless the filesystem will remain important in the internals and technical people will still need to interact with it. 

So at a macro scale a filesystem is something the user interacts with to manage files, directly or indirectly. But for an audience of the technical this is not sufficient or interesting. So as literally as possible what is(or perhaps more accurately) what composes an filesystem? Let's start at the bottom and work our way up. 
##### <a name="hardware">Hardware</a>
At the bottom is bits,(as hopefully you know) everything in a computer is made of bits. Information can be [stored](https://www.w3.org/International/questions/qa-what-is-encoding) in bits, for instance a file is a collection of bits.

But where are the bits, things don't **just** exist?
The bits exist in long term storage on the disk, also in [RAM](https://techterms.com/definition/ram) but since filesystems primarily deal with the disk we will only cover that. A Hard Drive Disk uses [magnetic storage](http://ffden-2.phys.uaf.edu/211.fall2000.web.projects/J%20Kugler/magnetic.html) to store information, the disk is divided up into:

- **Platters** - Platters are the actual disks that are on the are in the drive, there may be more than one per drive casing 
- **[Tracks](http://www.ntfs.com/hard-disk-basics.htm#MakingTracks)** - Tracks are rings on the disks where data is stored, there are thousands of tracks on a platter.
- **[Clusters](http://www.ntfs.com/hard-disk-basics.htm#SectorsandClusters)** - Clusters are simply a collection of Sectors, because sectors are small Clusters allow us to talk about larger chunks of data.
- **[Sectors](http://www.ntfs.com/hard-disk-basics.htm#SectorsandClusters)** - Sectors are the smallest unit of data that can be dealt with on the disk, they are usually 512 bytes.

![alt text](https://spectressite.files.wordpress.com/2015/12/disk-structure.png?w=616)

All these different constructs of size help the disk software stack manage the disk.

**So a Filesystem is a way for the user and system idea of a file to be translated down into the hardware reality of Sectors and Clusters; It is a mapping from software to hardware.**

### <a name="FAT">FAT</a>

FAT or **F**ile **A**llocation **T**able was [developed](https://staff.washington.edu/dittrich/misc/fatgen103.pdf#page=1) by Microsoft in the 1970, and although it is not the [oldest](https://softwareengineering.stackexchange.com/questions/103487/what-was-the-first-hierarchical-file-system) file system, it is by far the one of the most used especially for its age. FAT was originally used in Windows/DOS for many years and is still used today as the default filesystem on [SD cards](http://read.pudn.com/downloads77/ebook/294884/FAT32%20Spec%20%28SDA%20Contribution%29.pdf#page=1) and most USB flash drives. We will use FAT to talk about filesystem basics. 
##### <a name="fat_versions">Versions of FAT</a>
There are many different versions of FAT, the first published version of FAT, FAT12, the 12 [denoting](http://www.dfists.ua.es/~gil/FAT12Description.pdf#page=1) the use of 12 bit entries. Later other versions of FAT were released, FAT16, FAT32 and exFAT. Each of these successive versions increased the features and abilities of the FAT file system. The bit size often limits thing like max file size, max file name length and max disk size. exFAT would eventually practically solve most of these problems, but constant throughout is the file allocation table which is the basic data structure that filesystem is based and named after. 
##### <a name="fat_datastructure">File Allocation Table</a>
The file allocation table(will be referred to  as 'fat' **not** 'FAT' indicating the filesystem) is a simple data structure that is relatively easily mapped to the disk hardware reality, although other filesystems do not use the fat model directly, the data structures that are used are based on similar principles and understanding fat's will you to understand the concepts without having to know many of the implementation specific structures.

Before we can dig into how fats work let's briefly talk about pointers. Pointers are a incredibly common structure that often directly interact with control software. If we think about computers as series of ones and zeros([they actually are](https://en.wikipedia.org/wiki/Turing_machine)) all a pointer does is point at a to a place in that series, tying together the name of the pointer and a location.

![alt text](https://upload.wikimedia.org/wikipedia/commons/b/b4/Pointers.svg)

So a fat is a bunch of named pointers; a name of a file or a directory *points* to a place on the disk. Or more accurately in the case of a file it points to a cluster remember a cluster is a usable chunk of data made up of 512 byte sectors.

What if the file is 2KB? No problem just point at beginning of the file cluster and just read the sectors sequentially until we fill up to the known file size and hopefully at the same time find a special marker at the end that confirms the end of the file. 

But what if we want to edit a file? Well if you want to make the file smaller no problem just change your size and update the end marker. However if you want to make a file larger things get tricky. You see when you first wrote your file the next file that was written was placed immediately after it for performance reasons. So we could move that file to new territory and just rewrite it in its full length and this isn't a bad idea it is slow because you have to rewrite the whole file in this new location which could take a while depending on the length of the file. So something clever is done, the file is broken into chunks that are [linked](https://staff.washington.edu/dittrich/misc/fatgen103.pdf#page=13) together via pointers. Although it will still take the disk a while to find the next cluster when reading, it is faster when the disk needs to read and write often. However if you use this model for to long then even small files can be fragmented over large section of the disk, it is then necessary to [defragment](https://en.wikipedia.org/wiki/Defragmentation) the drive by rewriting file files to be in continuous clusters.

![alt text](http://www.ntfs.com/images/recover-FAT-structure.gif)

##### <a name="fat_problems">Problems with FAT</a>

FAT is old and relatively simple, there number of things that are lacking in the feature department. Many of the things that are now considered normal filesystem features were not even considered in the initial design of FAT, such as compression or encryption. Later many of these features were added in, but most were dirty hacks because the filesystem was never designed for it and backward compatibility was a goal. For instance name length may be the best example of this, when the filesystem was first introduced the name size was very small, but was expanded in later versions. However in later versions to keep backward compatibility this feature was implemented as a [hack](https://staff.washington.edu/dittrich/misc/fatgen103.pdf#page=28). 

Another example of a missing features is [**Data Integrity**](#data_integrity), many filesystems may take steps to insure that your data is safe often at the cost of speed or space efficiency. FAT at first didn't do anything, but eventually implemented a feature where copy of the fat would be made occasionally and stored. So that at the very least if the fat was corrupted, an unlikely but potentially causing complete data loss, the filesystem could be restored to that point in time and only some files would be lost. As you can imagine this is not a great system, what if data was corrupted but didn't cause problems for a long time, causing the backups to be corrupted too. Or what if it had been a while since a copy of the fat had been made all that new work is gone. And this doesn't help at all is the integrity of the file contents, arguably the more important stuff. 

##### <a name="fat_relevancy"> FAT's Relevancy Today </a>
Although Fat lacks many features that doesn't make it bad or even useless filesystem. As all filesystems do, FAT makes trade offs. Trade offs for speed and storage size at the cost of many features. These trade offs made more sense in a time of much more limited computing power and storage space. But today with our [GHz](https://techterms.com/definition/gigahertz) processors and [TB](https://techterms.com/definition/terabyte) hard drives, the trade offs that FAT made make far less sense today. However FAT is sill used today in some low power computing environments because the trade offs it make are worth it. It is also worth noting that the backward compatible nature of FAT make is at popular file interchange format between other filesystems.

### <a name="ZFS">ZFS</a>

ZFS is a filesystem [developed](http://open-zfs.org/wiki/History) in the early 2000's by Sun Microsystems it original use was in the Solaris OS. But it has taken on life of it's own on the open source community under the [OpenZFS project](http://open-zfs.org/). In every way FAT is simple and lacking features ZFS is not. ZFS is often considered the gold standard for filesystems and although best is a deeply subjective measure, few would disagree that ZFS is an interesting and featureful filesystem.

ZFS has very different [goals](http://queue.acm.org/detail.cfm?id=1317400): 

1. [**Simple Storage Management**](#pools)
2. [**Data Integrity**](#data_integrity) 
3. Performance

At scale.

##### <a name="pools">ZFS Storage Pools</a>

A more traditional filesystem has clear boundary especially down toward the hardware stack, usually they reach a point and then just hand over to the hardware stack. But ZFS in it effort to simplify storage management creates [pools](http://docs.oracle.com/cd/E26505_01/html/E37384/zfsover-2.html#gaypk) of disks. A pool is just a collection of disk that are manage by the system inse    
