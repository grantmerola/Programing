Import-Module Storage
mv #somefile
$orghash = Get-FileHash .\test.txt
write-host $orghash
pause
gcloud compute instances detach-disk test1 --zone us-west1-a --disk d4
Get-VirtualDisk

Get-PhysicalDisk
Get-PhysicalDisk | Where-Object { $_.OperationalStatus -eq 'Lost Communication' } | Set-PhysicalDisk -Usage Retired
if($orghash -eq (Get-FileHash .\test.txt)){
write-host "hash is the same"
}
else{
write-host "hash changed"
}
gcloud compute instances attach-disk test1 --disk d5 --zone us-west1-a
pause
shutdown -r
