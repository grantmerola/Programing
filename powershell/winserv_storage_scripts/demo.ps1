Import-Module Storage
cp ~\Downloads\GitHubDesktopSetup.exe D:\
$orghash = Get-FileHash .\GitHubDesktopSetup.exe
Write-Host "copy github desktop installer to new drive and get hash"
write-host $orghash
pause
Write-Host "disconect disk 4"
gcloud compute instances detach-disk test2 --zone us-west1-a --disk d4
pause
Get-VirtualDisk

Get-PhysicalDisk
Get-PhysicalDisk | Where-Object { $_.OperationalStatus -eq 'Lost Communication' } | Set-PhysicalDisk -Usage Retired
$comphash =(Get-FileHash .\GitHubDesktopSetup.exe)
Write-Host $comphash
if($orghash -eq $comphash ){
write-host "hash is the same"
}
else{
write-host "hash changed"
}
write-host "add new drive"
gcloud compute instances attach-disk test2 --disk d5 --zone us-west1-a
pause
shutdown -s
