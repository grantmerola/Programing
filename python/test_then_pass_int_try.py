#program assigns a letter grade to a score
#
"""
def grade():
	x = "Please enter grade"
	z = int(numberchecker(x))
	print(z)
	type(z)
	if 100 >= z and z >= 0:
			#assign
			print("y")
	else:
		print("n")
"""
def numberchecker(askwhat):
	print (askwhat)
	user_input = input(">")	
	try:
		return int(user_input)
	except ValueError:
		numberchecker("Please input answer correctly")
	#return numyes

m = numberchecker("?")
print (m)
if m > 1:
	print("Y")
else:
	pass
#grade()