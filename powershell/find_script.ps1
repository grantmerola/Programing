<#
find_script.ps1

How to use:
find_script look in all the files in the current directory. Note it does not look recursively in folders in the directory.
-h for help.
:run powershell : sepcify the script to be run : argument : search pattern :
   powershell         ./find_script.ps1             -s            24
   											|	: size	  :       bytes
   											|	
   											|	:  -t     :       .ps1
   											|	: type    :     file extention 
   											|
   											|	:  -c     :     
   											|	: content :  string to serch for
Examples:
powershell ./find_script.ps1 -s 24

powershell ./find_script.ps1 -t .ps1

powershell ./find_script.ps1 -c hello

powershell ./find_script.ps1 -h

#>

function logtofile{
	param($argarray)
	
	$istherelogfile = get-childitem -name | select-string "logfile.txt"

	if( $istherelogfile.length -gt 0){
		add-content -path logfile.txt -value $argarray
	}
	else{
		$argarray > logfile.txt
	}
}


#general error message something someware went wrong
$error = "This syntax is incorrect or incorrect value please try again"

#if this is a content look up then follow this code path
if($args[0] -eq "-c"){
	
	#content we are looking for
	$content = $args[1]

	#check that there is valid content
	if($content -gt 0){
		
		#answer array
		$answerarray = @()

		#get the files and store them in an array
		$namearray = get-childitem -name
		
		#go through the array	
		foreach ($name in $namearray){
			$file = get-item $name
			
			#get text, search for string, store
			$search_results = get-content $file | select-string $content
			
			#check that string has content 
			if ($search_results.length -gt 0){
				
				# if string has content add to answer
				$answerarray += $search_results
			}
		}
		#check to see if there were any matches and return the answers if there was if there wasen't say so
		if($answerarray.count -gt 0){
			
			#loging results 
			logtofile($answerarray)
			
			# return the answer array 
			return $answerarray
		}
		else{
			return "No matches"
		}
	}
	else{
	
	# return $error if there is not a valid type
	return $error
	
	}

}
#else if this is a size look up follow this code path
elseif($args[0] -eq "-s"){
	
	#size we are looking for
	$size = $args[1]

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
		#check to see if there were any matches and return the answers if there was if there wasen't say so
		if($answerarray.count -gt 0){
			
			#loging results 
			logtofile($answerarray)
			
			# return the answer array 
			return $answerarray
		}
		else{
			return "No matches"
		}
	}
	else{
	
	# return $error if there is not a valid size
	return $error
	
	}	
}
#else if this is a type look up follow this code path
elseif($args[0] -eq "-t"){
	
	#type we are looking for
	$type = $args[1]

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
				# this weird path bit i dont really understand but it looks like a .net modual/class/package/.etc function. :: is odd syntax but it works
			if ([System.IO.Path]::GetExtension("$file") -eq $type){
				
				# add the name of the current file to the list of answers
				$answerarray += $file
			}
		}
		#check to see if there were any matches and return the answers if there was if there wasen't say so
		if($answerarray.count -gt 0){
			
			#loging results 
			logtofile($answerarray)

			# return the answer array 
			return $answerarray
		}
		else{
			return "No matches"
		}
	}
	else{
	
	# return $error if there is not a valid type
	return $error
	
	}
}
elseif($args[0] -eq "-h"){
	write-host("
find_script.ps1

How to use:
find_script look in all the files in the current directory. Note it does not look recursively in folders in the directory.
-h for help. 
:run powershell : sepcify the script to be run : argument : search pattern :
   powershell         ./find_script.ps1             -s            24
   											|	: size	  :       bytes
   											|	
   											|	:  -t     :       .ps1
   											|	: type    :     file extention 
   											|
   											|	:  -c     :     
   											|	: content :  string to serch for
Examples:
powershell ./find_script.ps1 -s 24

powershell ./find_script.ps1 -t .ps1

powershell ./find_script.ps1 -c hello

powershell ./find_script.ps1 -h

")
}
#else just give up and fallback on get-childitem as default behavior 
else{
	write-host("No arguments specifyed")
	return get-childitem -name 
}
