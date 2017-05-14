#average

def average():
	user_input1 = int(input("Input the first number of the three you what to calcualte the average of.\n"))
	user_input2 = int(input("The second\n"))
	user_input3 = int(input("The third\n"))
	
	added = user_input1 + user_input2 + user_input3 
	answ = added/3
	print("The answer is\n")
	print(answ)
average()