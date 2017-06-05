Import-Module Storage
$disks = Get-PhysicalDisk -CanPool $True
$substoragename = (Get-StorageSubSystem -FriendlyName "*").FriendlyName
New-StoragePool `
-FriendlyName "auto-pool" `
-StorageSubsystemFriendlyName $substoragename `
-PhysicalDisks $disks 
