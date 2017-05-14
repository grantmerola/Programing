echo "-s"
start-process powershell "C:\Users\Student\Downloads\powershell\find_script_v4.ps1 -s 24" -RedirectStandardOutput .\testlog.txt
echo "-t"
start-process powershell "C:\Users\Student\Downloads\powershell\find_script_v4.ps1 -t .ps1" -RedirectStandardOutput .\testlog.txt
echo "-c"
start-process powershell "C:\Users\Student\Downloads\powershell\find_script_v4.ps1 -c hello" -RedirectStandardOutput .\testlog.txt
echo "-h"
start-process powershell "C:\Users\Student\Downloads\powershell\find_script_v4.ps1 -h" -RedirectStandardOutput .\testlog.txt
echo "-l"
start-process powershell "C:\Users\Student\Downloads\powershell\find_script_v4.ps1 -l" -RedirectStandardOutput .\testlog.txt
echo "-sl"
start-process powershell "C:\Users\Student\Downloads\powershell\find_script_v4.ps1 -sl 24" -RedirectStandardOutput .\testlog.txt
echo "-tl"
start-process powershell "C:\Users\Student\Downloads\powershell\find_script_v4.ps1 -tl .ps1" -RedirectStandardOutput .\testlog.txt
echo "-cl"
start-process powershell "C:\Users\Student\Downloads\powershell\find_script_v4.ps1 -cl hello" -RedirectStandardOutput .\testlog.txt
echo "-ls"
start-process powershell "C:\Users\Student\Downloads\powershell\find_script_v4.ps1 -ls 24" -RedirectStandardOutput .\testlog.txt
echo "-lt"
start-process powershell "C:\Users\Student\Downloads\powershell\find_script_v4.ps1 -lt .ps1" -RedirectStandardOutput .\testlog.txt
echo "-lc"
start-process powershell "C:\Users\Student\Downloads\powershell\find_script_v4.ps1 -lc hello" -RedirectStandardOutput .\testlog.txt
echo "no args"
start-process powershell "C:\Users\Student\Downloads\powershell\find_script_v4.ps1"
echo "-d"
start-process powershell "C:\Users\Student\Downloads\powershell\find_script_v4.ps1 -d hello_world.ps1 " -RedirectStandardOutput .\testlog.txt
echo "-dl"
start-process powershell "C:\Users\Student\Downloads\powershell\find_script_v4.ps1 -dl dupfile.txt "
echo "-ld"
start-process powershell "C:\Users\Student\Downloads\powershell\find_script_v4.ps1 -ld find_script.ps1 " -RedirectStandardOutput .\testlog.txt
echo "-mv"
start-process powershell "C:\Users\Student\Downloads\powershell\find_script_v4.ps1 -mv movefile.txt ./movetodir/" -RedirectStandardOutput .\testlog.txt
echo "-lmv"
start-process powershell "C:\Users\Student\Downloads\powershell\find_script_v4.ps1 -lmv movefile1.txt ./movetodir/" -RedirectStandardOutput .\testlog.txt
echo "-mvl"
start-process powershell "C:\Users\Student\Downloads\powershell\find_script_v4.ps1 -mvl movefile2.txt ./movetodir/" -RedirectStandardOutput .\testlog.txt

echo "logs"
get-content logfile.txt
echo ".\movetodir"
dir .\movetodir\
echo "current dir"
dir 

echo "repairing file scheme "
rm "logfile.txt"
rm "hello_world.ps1 copy"
rm "dupfile.txt copy"
rm "find_script.ps1 copy"

mv .\movetodir\movefile1.txt .\
mv .\movetodir\movefile2.txt .\
mv .\movetodir\movefile.txt .\
