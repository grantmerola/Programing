#Grade assignment

def grade():
	user_input = int(input("-"))
	if user_input >= 90:
		print("A")
	elif user_input >= 80 and user_input <=89:
		print("B")
	elif user_input >= 70 and user_input <=79:
		print("C")
	elif user_input >= 60 and user_input <=69:
		print("D")
	elif user_input <= 59:
		print("F")
	else:
		print("Sorry diden't work check that number is correct")
		grade()
		
grade()