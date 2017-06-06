Import-Module Storage
$addeddisk = get-disk -Number 4
Initialize-Disk -Number 4

$disks = Get-PhysicalDisk -CanPool $True
Add-PhysicalDisk -PhysicalDisks $disks -StoragePoolFriendlyName auto_pool
Repair-VirtualDisk -FriendlyName mainstorage
Get-FileHash .\test.txt