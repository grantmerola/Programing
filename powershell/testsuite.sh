#!/bin/bash
echo "-s 24"
powershell ./find_script_v3.ps1 -s 24
echo "-t .ps1"
powershell ./find_script_v3.ps1 -t .ps1
echo "-c hello"
powershell ./find_script_v3.ps1 -c hello
echo "-h"
powershell ./find_script_v3.ps1 -h
echo "-l"
powershell ./find_script_v3.ps1 -l
echo "-sl 24"
powershell ./find_script_v3.ps1 -sl 24
echo "-tl .ps1"
powershell ./find_script_v3.ps1 -tl .ps1
echo "-cl hello"
powershell ./find_script_v3.ps1 -cl hello
echo "-ls 24"
powershell ./find_script_v3.ps1 -ls 24
echo "-lt .ps1"
powershell ./find_script_v3.ps1 -lt .ps1
echo "-lc hello"
powershell ./find_script_v3.ps1 -lc hello
echo "no arguments"
powershell ./find_script_v3.ps1 
echo "-d"
powershell ./find_script_v3.ps1 -d hello_world.ps1
echo "-dl"
powershell ./find_script_v3.ps1 -dl dupfile.txt
echo "-ld"
powershell ./find_script_v3.ps1 -ld find_script.ps1
echo "-mv"
powershell ./find_script_v3.ps1 -mv movefile.txt ./movetodir/
echo "-lmv"
powershell ./find_script_v3.ps1 -lmv movefile1.txt ./movetodir/
echo "-mvl"
powershell ./find_script_v3.ps1 -mvl movefile2.txt ./movetodir/

#for seeing if the test worked once the folder is reset
echo "logs"
cat logfile.txt
echo "./movetodir"
ls ./movetodir/
echo "current dir"
ls 

#reset
echo "repairing file scheme "
rm "logfile.txt"
rm "hello_world.ps1 copy"
rm "dupfile.txt copy"
rm "find_script.ps1 copy"

mv ./movetodir/movefile1.txt ./
mv ./movetodir/movefile2.txt ./
mv ./movetodir/movefile.txt ./