$disks = Get-PhysicalDisk -CanPool $True
Add-PhysicalDisk -PhysicalDisks $disks -StoragePoolFriendlyName auto_pool
Repair-VirtualDisk -FriendlyName mainstorage
Get-FileHash .\test.txt