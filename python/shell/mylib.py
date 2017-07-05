""" The contents of this file are imported in to IPython on start up. It is a collection of aliases and ease of use functions."""
import yaml
import os
def sh(str):
	"""Alias for shell command """
	os.system(str)

def lookforbadchar(str):
	""" Looks for non A-Z and 0-9 chars """
	strarr = list(str)
	for char, i in enumerate(strarr):
		# gets the ascii value 
		charcode = ord(char)
		#65-90 A-Z,97-122 a-z,48-57 0-9, 32 = space: in ASCII 
		if(charcode not in range(65,91) 
			and charcode not in range(97,123)
			and charcode not in range(48,58) 
			and charcode != 32 ):

			print(f"Character:{char}, Character ASCII Code:{charcode}, Position in string:{i}")

def loadyamldoc(path):
	""" returns contents of given yaml file"""
	with open(path) as file:
		fcontents = file.read()

	fcyaml = yaml.load(fcontents)
	return fcyaml
