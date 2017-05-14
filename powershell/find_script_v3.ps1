# try powershell ./findscript.ps1 -h

#if your here for other reasons
#each arg has func and there are a few common use funcs
#main code path determination at bottom 
# passing log var through every func is a very js thing that i dont partiulary like, but only it worked for me



function help{
write-host(
"
find_script.ps1

How to use:
find_script look in all the files in the current directory. Note it does not look recursively in folders in the directory.
-h for help.
:run powershell : specify the script to be run : argument :         value      :   value
   powershell         ./find_script.ps1             -s            24
   											|	: size	  :       bytes
   											|	
   											|	:  -t     :       .ps1
   											|	: type    :     file extention 
   											|
   											|	:  -c     :     hello
   											|	: content :  string to serch for
   											|
   											|	:  -d     :     dupfile.txt
   											|	: duplicate:  file to duplicate
   											|
   											|	:  -mv     :     movefile.txt   :  ./movetodir/
   											|	: move file:  move this file to :  this directory 
   											|
   											|	:  -l c/s/t/d/mv:     
   											|	: logging :   	Note. Logging can not be run by its self it requries other argument										
Examples:
powershell ./find_script.ps1 -s 24

powershell ./find_script.ps1 -t .ps1

powershell ./find_script.ps1 -c hello

powershell ./find_script.ps1 -d dupfile.txt

powershell ./find_script.ps1 -mv movefile.txt ./movetodir/

powershell ./find_script.ps1 -sl 24

powershell ./find_script.ps1 -tl .ps1

powershell ./find_script.ps1 -cl hello

powershell ./find_script.ps1 -dl dupfile.txt

powershell ./find_script.ps1 -mvl movefile.txt ./movetodir/

powershell ./find_script.ps1 -h
")
}


function logtofile{
	param($argarray, $loggingbit)
	if($loggingbit)	{
		
		$argarray += "----results----"

		#search for log file
		$istherelogfile = get-childitem -name | select-string "logfile.txt"

		#if there is a log file add to it, if not make one
		if( $istherelogfile.length -gt 0){
			add-content -path logfile.txt -value $argarray
		}
		else{
			$argarray > logfile.txt
		}
	}
}
# function that is used to evaluate answer and decide what to do with it
function outputfunc{
	param($answerarray, $log)	
	#check to see if there were any matches and return the answers if there was if there wasen't say so
	if($answerarray.count -gt 0){
		
		#loging results 
		logtofile $answerarray $log
	
		# return the answer array 
		return $answerarray
	}
	else{
		return "No matches"
	}	
}


function contentfunc{
	param($arg, $log)
	
	#content we are looking for
	$content = $arg

	#check that there is valid content
	if($content -gt 0){

		#answer array
		$answerarray = @()

		#get the files and store them in an array
		$names = get-childitem -name
		
		#go through the array	
		foreach ($name in $namearray){
			$file = get-item $name
			
			#get text, search for string, store
			$search_results = select-string $content $names
			

			#check that string has content 
			if ($search_results.length -gt 0){
				
				# if string has content add to answer
				$answerarray += $search_results
			}
		}
		return outputfunc $answerarray $log
	
	}
	else{
	
	# return $error if there is not vaild content
	return $error
	
	}
}

function sizefunc{
	param($arg, $log)
	
	#size we are looking for
	$size = $arg

	#check that there is a valid size
	if($size -ge 0){
		
		#answer array
		$answerarray = @()

		#get the files and store them in an array
		$namearray = get-childitem -name
		
		#go through the array	
		foreach ($name in $namearray){
			$file = get-item $name
			
			#check the current files size and see if it matches the size we are looking for
			if ($file.length -eq $size){
				
				# add the name of the current file to the list of answers
				$answerarray += $file
			}
		}
		return outputfunc $answerarray $log
	}
	else{
	
	# return $error if there is not a valid size
	return $error
	
	}
}

function typefunc{
	param($arg, $log)

	#type we are looking for
	$type = $arg

	#check that there is a valid type
	if($type -like ".*"){
		
		#answer array
		$answerarray = @()

		#get the files and store them in an array
		$namearray = get-childitem -name
		
		#go through the array	
		foreach ($name in $namearray){
			$file = get-item $name
			
			#check the current files type and see if it matches the type we are looking for
			if ([System.IO.Path]::GetExtension("$file") -eq $type){
				
				# add the name of the current file to the list of answers
				$answerarray += $file
			}
		}
		return outputfunc $answerarray $log
	}
	else{
	
	# return $error if there is not a valid type
	return $error
	
	}
}

function movefunc {
	param($file,$pathto, $log)

	# to host info
	$answerarray = @()
	$answerarray += "file being moved:"
	$answerarray += $file
	$answerarray += "destination:"
	$answerarray += $pathto
	
	#moveing item
	move-item -path $file -destination $pathto


	return outputfunc $answerarray  $log
}
function dupfunc {
	param($file, $log)

	$answerarray = @()

	$answerarray += "duplicated file:"
	$answerarray += $file
	
	#make new name
	$newfile = $file +" copy"
	
	#make new item with file name
	new-item -name $newfile
	
	#get content of file and move it to new file
	get-content $file | set-content $newfile
	

	$answerarray += "new file name:"
	$answerarray += $newfile

	return outputfunc $answerarray  $log


}

#general error message something someware went wrong
$error = "This syntax is incorrect or incorrect value please try again"

# surpressing all user faceing errors remove to debug
$ErrorActionPreference= 'silentlycontinue'

# use arguments to determine code path
switch ($args[0]){

"-cl"{return contentfunc $args[1] $true ;break }
"-lc"{return contentfunc $args[1] $true ;break}
"-c" { return contentfunc $args[1] ;break }

"-sl"{return sizefunc $args[1] $true ;break }
"-ls"{return sizefunc $args[1] $true ;break }
"-s" {return sizefunc $args[1] ;break}

"-tl"{return typefunc $args[1] $true ;break}
"-lt"{return typefunc $args[1] $true ;break}
"-t" {return typefunc $args[1] ;break}

"-lmv"{return movefunc $args[1] $args[2] $true;break}
"-mvl"{return movefunc $args[1] $args[2] $true;break}
"-mv"{return movefunc $args[1] $args[2];break}

"-dl"{return dupfunc $args[1] $true ;break}
"-ld"{return dupfunc $args[1] $true ;break}
"-d"{return dupfunc $args[1] ;break}

"-l"{help;break}
"-h"{help;break}
default {help;break}
}
