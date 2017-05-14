import json
from random import shuffle
from nested_lookup import nested_lookup # requies six lib
import os

def isint(str):
	try:
		x = int(nextc)
	except ValueError:
		return False
	
	return x


bookmarkfile = json.load( open("/Users/gm/Library/Application Support/Google/Chrome/Default/Bookmarks.bak", 'r') )

#select all the values for the key 'url'
url_list = nested_lookup('url',bookmarkfile);

shuffle(url_list)

multi = 0

for url in url_list:
	os.system("open {}".format(url))
	
	if multi == 0:
		nextc = input()
	elif multi > 0:
		multi -= 1

	
	if nextc == "exit":
		break
	elif isint(nextc) and multi == 0: 
		if isint(nextc) > 0 and isint(nextc) < 20:
			multi = isint(nextc) - 1
			nextc = "none"
			
			


			 