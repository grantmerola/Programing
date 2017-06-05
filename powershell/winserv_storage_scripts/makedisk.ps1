Import-Module Storage
$drivename = "mainstorage"
$NonNativepPool = (Get-StoragePool -IsPrimordial $False).friendlyname

New-VirtualDisk -StoragePoolFriendlyName $NonNativepPool -Friendlyname $drivename -UseMaximumSize -ProvisioningType Fixed -ResiliencySettingName "Parity" -PhysicalDiskRedundancy 1 

$drivenumber = (Get-VirtualDisk -FriendlyName $drivename | Get-Disk).Number

Initialize-Disk -Number $drivenumber
New-Partition -DiskNumber $drivenumber -UseMaximumSize -AssignDriveLetter | 
Format-Volume -FileSystem ReFS 