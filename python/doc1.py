# ex1
#print "Hello World!"
#print "Hello Again"
#print "I like typing this."
#print "This is fun."
#print 'Yay! Printing.'
# print "I'd much rather you 'not'."
#print 'I "said do not touch this.'
#print "This line"

# ex2
# A comment, this is so you can read you program later.
# Anything after the # is ignored by python.

#print "I could have code like this." # and the comment after is ignored

# You can also use a comment to "disable" or comment out a piece of code:
# print "This won't run."

#print "This will run."

# ex3
# + plus
# - minus
# / slash
# * asterisk
# % percent
# < less than
# > greater than
# <= less than equal to
# >= greater than equal to

# printing
#print "I will now count my chickens:"

# printing then 30 divided by 6 equals 5 plus 25
#print "Hens", 25 + 30 / 6
# printing 25 time 3 = 75 /4 =3 ,100 -3 
#print "Roosters", 100.0 - 25.0 * 3.0 % 4.0

# printing
#print "Now I will count the eggs:"

# 4 % 2=0 -1/4= -0.25 ++++=1+6+0=7 + -0.25 cant be done
#print 3.0 + 2.0 + 1.0 - 5.0 + 4.0 % 2.0 - 1.0 /4.0 + 6.0

# printing
#print "Is it true that 3 + 2 < 5 - 7?"

# 5 < -2 is large so false 
#print 3 + 2 < 5 -7

# printing 5
#print "What is 3 + 2?", 3 + 2
# printing -2
#print "What is 5 - 7?", 5 -7

# printing
#print "oh, that's why it's False."

# printing
#print "How about some more."

# printing five larger so true
#print "Is it greater?", 5 > -2
# printing five still larger so true
#print "Is it greater or equal?", 5 >= -2
# printing five larger so false
#print "Is it less or equal?", 5 <= -2

# ex4
#cars = 100
#space_in_a_car = 4.0
#drivers = 30
#passengers =90
#cars_not_driven = cars - drivers
#cars_driven = drivers
#carpool_capacity = cars_driven * space_in_a_car
#average_passengers_per_car = passengers / cars_driven
#print "There are",cars, "cars available."
#print "There are only", drivers, "drivers available."
#print "There will be", cars_not_driven, "empty cars today."
#print "We can transport", carpool_capacity, "people today."
#print "We have", passengers, "to carpool today."
#print "We need to put about", average_passengers_per_car, "in each car."

# ex5
#my_name = 'Zed A. Shaw'
#my_age = 35
#my_height = 74 #in
#my_weight = 180 #lbs
#my_eyes = 'Blue'
#my_teeth = 'White'
#my_hair = 'Brown'

#print "Let's talk about %s." % my_name
#print "He's %d inches tall." % my_height
#print "He's %d pounds heavy." % my_weight
#print "Actually that's not too heavy."
#print "He's got %s eyes and %s hair." % (my_eyes, my_hair)
#print "His teeth are usually %s depending on the coffee." % my_teeth

#print "If I add %d, %d, and %d, I get %d." % (my_age, my_height, my_weight, my_age + my_height + my_weight)

# ex6
#x = "There are %d types of people." % 10
#binary = "binary"
#do_not = "don't"
#y = "Those who know %s and those who %s." % (binary, do_not)

#print x
#print y

#print "I said: %r." % x
#print "I also said: '%s'." % y

#hilarious = False
#joke_evaluation = "Isn't that joke so funny?! %r"

#print joke_evaluation % hilarious

#w = "This is the left side of..."
#e = "a string with a right side."

#print w + e

# ex7

#print "Mary had a little lamb."
#print "It's fleece was white as %s." % 'snow'
#print "And everywhere that Mary went."
#print "." * 10

#end1 = "C"
#end2 = "h"
#end3 = "e"
#end4 = "e"
#end5 = "s"
#end6 = "e"
#end7 = "B"
#end8 = "u"
#end9 = "r"
#end10 = "g"
#end11 = "e"
#end12 = "r"

#print end1 + end2 + end3 + end4 + end5 + end6
#print end7 + end8 + end9 + end10 + end11 + end12

# ex8

#formatter = "%r %r %r %r"

#print formatter % (1, 2, 3, 4)
#print formatter % ("one", "two", "three", "four")
#print formatter % (True, False, False, True)
#print formatter % (formatter, formatter, formatter, formatter)
#print formatter % (
#	"I had this thing.",
#	"That you could type up right.",
#	"But it did't sing.",
#	"So I said goodnight." 
#)

# ex9

#days = "Mon Tue Wed Thu Fri Sat Sun"
#months = "Jan\nFeb\nMar\nApr\nMay\nJun\nJul\nAug"

#print "Here are the days:", days
#print "Here are the months: ", months

#print """
#There's something going on here.
#With the three double-quotes.
#We'll be able to type as much as we like.
#Even 4 lines if we want, or 5, or 6.
#"""

# ex10

#tabby_cat = "\t I'm tabbed in."
#persian_cat = "I'm split\non a line."
#backslash_cat = "I'm \\ a \\ cat."

#fat_cat = """
#I'll do a list:
#\t* Cat food
#\t* Fishies
#\t* Catnip \n\t* Grass
#"""

#print tabby_cat
#print persian_cat
#print backslash_cat
#print fat_cat

# ex11

#print "How old are you?",
#age = raw_input()
#print "How tall are you?",
#height = raw_input()
#print "How much do you weigh?"
#weight = raw_input()

#print "So, you're %r old, %r tall and %r heavy." % (age, height, weight)

# ex12

#age = raw_input("How old are you?")
#height = raw_input("How tall are you?")
#weight = raw_input("How much do you weigh?")

#print "So, you're %r old, %r tall and %r heavy." % (age, height, weight)

# ex13

#from sys import argv

#script, first, second, third, fourth = argv
#print "The script is called:", script
#print "Your first variable is:", first
#print "Your second varibale is:", second
#print "Your third variable is:", third
#print "Your fourth variable is called %s" % fourth

#print "input 3 numbers"
#from sys import argv

#script, first, second, third = argv

#number = first + second + third + raw_input("pick a fourth number") 

#print number

# ex14

#from sys import argv

#script, user_name = argv
#prompt = '>'

#print "Hi %s, I'm the %s script." % (user_name, script)
#print "I'd like to ask you a few questions."
#print "Do you like me %s" % user_name
#likes = raw_input(prompt)

#print "Where do you live %s?" % user_name
#lives = raw_input(prompt)

#print "What kind of computer do you have?"
#computer = raw_input(prompt)

#print """
#Alright, so you said %r about liking me.
#You live in %r. Not sure where that is.
#And you have a %r computer. Nice.
#""" % (likes, lives, computer)

# ex15

# taking from the system the module argv and telling the script to use it 
#from sys import argv

# telling the argv that the first var is the script name and that the second var is the file name
#script, filename = argv

#filename = raw_input("put file name here")

# creating var txt that is opening the file provided by the argv defintion
#txt = open(filename)

# printing using the file name variable
#print "Here's your file %r:" % filename
# this is reading the open file
#print txt.read()
#print txt.close()

# printing
#print "Type the filename again:"
# asking the user for the file name again (why argv already got the info?) 
#file_again = raw_input(">")

# opening the file again (Is it not already open)
#txt_again = open(file_again)
# reading the open file again (same Q)
# Answer to my q is de be trolling us
#print txt_again.read()

# ex16

#from sys import argv

#script, filename = argv

#print "We're going to erase %r." % filename
#print "If you don't want that, hit CTRL-C (^C)."
#print "If you do want that, hit RETURN."

#raw_input("?")

#print "opening the file..."
#target = open(filename, 'w')

#print "Truncating the file. Goodbye!"
#target.truncate()

#print "Now I'm going to ask you for three lines."

#line1 = raw_input("line 1:")
#line2 = raw_input("line 2:")
#line3 = raw_input("line 3:")

#print "I'm going to write these to the file."


#target.write(line1 + "\n" + line2 + "\n" + line3 + "\n")
#target.write("\n")
#target.write(line2)
#target.write("\n")
#target.write(line3)
#target.write("\n")

#print "And finally, we close it."
#target.close()

#test = open(filename)

#print test.read()

# ex17

#from sys import argv;from os.path import exists;script, from_file, to_file = argv;"""print "Copying from %s to %s" % (from_file, to_file)""";in_file = open(from_file).read();"""indata = in_file.read()#print "The input file is %d bytes long" % len(indata)#print "Does the output file exist? %r" % exists(to_file)""";print "Ready, hit RETURN to continue, CTRL-C to abort.";raw_input();out_file = open(to_file, 'w');"""out_file.write(indata)""";out_file.write(in_file);print "Alright, all done.";out_file.close()#in_file.close()

# ex18

#def print_two(*args):
#	arg1, arg2 = args
#	print "arg1; %r, arg2: %r" % (arg1, arg2)
	
#def print_two_again(arg1, arg2):
#	print "arg1: %r, arg2: %r" % (arg1, arg2)
	
#def print_one(arg1):
#	print "arg1: %r" %arg1
		
#def print_none():
#	print "I got nothin"
	
#print_two("Zed","Shaw")
#print_two_again("Zed","Shaw")
#print_one("First!")
#print_none()

# ex19

#def cheese_and_crackers(cheese_count, boxes_of_crackers):
#	print "You have %d cheeses!" % cheese_count
#	print "You have %d boxes of crackers!" % boxes_of_crackers
#	print "Man that's enough for a party!"
#	print "Get a blanket.\n"
	

#print "We can just give the function numbers directly:"
#cheese_and_crackers(20, 30)

#print "Or, we can use variables from our script:"
#amount_of_cheese = 10
#amount_of_crackers = 50

#cheese_and_crackers(amount_of_cheese, amount_of_crackers)

#print "We can even do math inside too:"
#cheese_and_crackers(10 + 20, 5 + 6)

#print "And we can combine the two, variables and math:"
#cheese_and_crackers(amount_of_cheese + 100, amount_of_crackers + 1000)

# def function_what(pe1, pe2):
# 	print "What happens when pe1 aproches pe2?"
# 	result = pe1 + pe2
# 	print result
	
# print "Trial 1 = %s" % (function_what(0 , 0))
# print "Trial 2 = %s" % (function_what(0 , 1))
# print "Trial 3 + time = %s" % (function_what(2 , 1))

# ex20

# calls sys for argv module 
#from sys import argv

# specifies argv inputs 
#script, input_file = argv

# create command print_all that reads any given file as f

#def print_all(f):
#	print f.read()

# creates command rewind that puts you at bit data 0	
#def rewind(f):
#	f.seek(0)

# tricky one print a line take two variables it parrots back the first one then the second takes a file and prints the current line out as a string	
#def print_a_line(line_count, f):
#	print line_count, f.readline()

# assigning and opening chosen file	
#current_file = open(input_file)

# p
#print "First let's print the whole file:\n"

# calling the print all command on the now opened original file 
#print_all(current_file)

# p
#print "Now let's rewind, kind of like a tape."

# calling the rewind command for current file
#rewind(current_file)

#p
#print "Let's print three lines:"

# Hard part: start at bit data one due to rewind then take current line being the first line of the doc then prints the first line of the doc due to the other half of the print a line Conclusion: started at bit data 0, printed out that this is the first line, then reads out that line
#current_line = 1
#print_a_line(current_line, current_file)

# second time little different first we take current line that indicated that it was the first line and add a modifier that makes it indicate that it is the second line (note: this seems like this is a bad way to do this and would not work well on any sort of scale and is painful even here [python loops?]) prints current line then reads and prints the second line of the document
#current_line = current_line + 1 # = 2
#current_line += 1
#print_a_line(current_line, current_file)

# once agin stupid incrementisum then print third line 
#current_line = current_line + 1 # = 3
#current_line += 1
#print_a_line(current_line, current_file)

# ex21

#def add(a, b):
#	print "ADDING %d + %d" % (a, b)
#	return a + b
	
#def subtract(a, b):
#	print "SUBTRACTING %d - %d" % (a, b)
#	return a - b
	
#def multiply(a, b):
#	print "MULTIPLYlING %d * %d" % (a, b)
#	return a * b
	
#def divide(a, b):
#	print "DIVIDING %d / %d" % (a, b)
#	return a / b
	

#print "Let's do some math with just functions!"

#age = add (30, 5) 
#height = subtract(78, 4)
#weight = multiply(90, 2)
#iq = divide(100, 2)

#print "Age: %d, Height: %d, Weight: %d, IQ: %d" % (age, height, weight, iq)

#print "Here is a puzzle."

#what = add(age, subtract(height, multiply(weight, divide(iq, 2))))

#print "That becomes:", what, "Can you do it by hand?"

#TRY thing not ex
# from sys import argv

# script, x, y = argv

#print "Put word to be s'ifyed below" 
#x = raw_input()

#print "Put the s's you want added"
#y = raw_input() 

#def add_ss(word, num_ss):
	 
	#together = word + num_ss
	#return together
	
#	return word + num_ss
	
#new_ss = add_ss(x, y)

#print "Boom s'ifyed: %s" % new_ss


# ex22

# see dicdoc

# ex23

# ex24

#print "Let's practice everything."
#print 'You\'d need to know \'bout escapes with \\ that do \n newlines and \t tabs.'

#poem = """
#\tThe lovely world
#with logic so firmly planted
#cannot discern \n the needs of love
#nor comprehend passion from intuition
#and requires an explanation
#\n\t\twhere there is none.
#"""

#print "______________"
#print poem
#print "______________"


#five = 10 - 2 + 3 - 6
#print "This should be five: %s" % five

#def secret_formula(started):
	#jelly_beans = started * 500
	#jars = jelly_beans / 1000
	#crates = jars / 100
	#return jelly_beans, jars, crates
	

#start_point = 10000
#beans, jars, crates = secret_formula(start_point)

#print "With a starting point of: %d" % start_point
#print "We'd have %d beans, %d jars, and %d crates." % (beans, jars, crates)

#start_point = start_point / 10

#print "We can also do that this way:"
#print "We'd have %d beans, %d jars, and %d crates." % secret_formula(start_point) 

# ex25

#def break_words(stuff):
	#"""This function will break up words for us."""
	#words = stuff.split(' ')
	#return words
	
#def sort_words(words):
	#"""Sorts the words."""
	#return sorted(words)
	
#def print_first_word(words):
	#"""Prints the first word after popping it off."""
	#word = words.pop(0)
	#print word
	
#def print_last_word(words):
	#"""prints the last word after popping it off."""
	#word = words.pop(-1)
	#print word
	
#def sort_sentence(sentence):
	#"""Takes in a full sentence and returns the sorted words."""
	#words = break_words(sentence)
	#return sort_words(words)
	
#def print_first_and_last(sentence):
	#"""Prints the first and last words of the sentence."""
	#words = break_words(sentence)
	#print_first_word(words)
	#print_last_word(words)
	
#def print_first_and_last_sorted(sentence):
	#"""Sorts the words then prints the first and last one."""
	#words = sort_sentence(sentence)
	#print_first_word(words)
	#print_last_word(words)
	
# ex26
#def break_words(stuff):
    #"""This function will break up words for us."""
    #words = stuff.split(' ')
    #return words

#def sort_words(words):
    #"""Sorts the words."""
    #return sorted(words)

#def print_first_word(words):
    #"""Prints the first word after popping it off."""
    #word = words.pop(0)
    #print word

#def print_last_word(words):
    #"""Prints the last word after popping it off."""
    #word = words.pop(-1)
    #print word

#def sort_sentence(sentence):
    #"""Takes in a full sentence and returns the sorted words."""
    #words = break_words(sentence)
    #return sort_words(words)

#def print_first_and_last(sentence):
    #"""Prints the first and last words of the sentence."""
    #words = break_words(sentence)
    #print_first_word(words)
    #print_last_word(words)

#def print_first_and_last_sorted(sentence):
    #"""Sorts the words then prints the first and last one."""
    #words = sort_sentence(sentence)
    #print_first_word(words)
    #print_last_word(words)


#print "Let's practice everything."
#print 'You\'d need to know \'bout escapes with \\ that do \n newlines and \t tabs.'

#poem = """
#\tThe lovely world
#with logic so firmly planted
#cannot discern \n the needs of love
#nor comprehend passion from intuition
#and requires an explantion
#\n\t\twhere there is none.
#"""


#print "--------------"
#print poem
#print "--------------"

#five = 10 - 2 + 3 - 6
#print "This should be five: %s" % five

#def secret_formula(started):
    #jelly_beans = started * 500
    #jars = jelly_beans / 1000
    #crates = jars / 100
    #return jelly_beans, jars, crates


#start_point = 10000
#beans, jars, crates = secret_formula(start_point)

#print "With a starting point of: %d" % start_point
#print "We'd have %d jeans, %d jars, and %d crates." % (beans, jars, crates)

#start_point = start_point / 10

#print "We can also do that this way:"
#print "We'd have %d beans, %d jars, and %d crates." % secret_formula(start_point)


#sentence = "All good things come to those who weight."

#words = break_words(sentence)
#sorted_words = sort_words(words)

#print_first_word(words)
#print_last_word(words)
#print_first_word(sorted_words)
#print_last_word(sorted_words)
#sorted_words = sort_sentence(sentence)
#sorted_words

#print_first_and_last(sentence)

#print_first_and_last_sorted(sentence)

# ex27

# ex28

# ex29

#people = 20
#cats = 30
#dogs = 15


#if people < cats:
	#print "Too many cats! The world is doomed!"

#if people > cats:
	#print "Not many cats! The world is saved!"
	
#if people < dogs:
	#print "The world is drooled on!"
	
#if people > dogs:
	#print "The world is dry!"
	
	
#dogs += 5

#if people >= dogs:
	#print "People are greater than or equal to dogs."
	
#if people <= dogs:
	#print "People are less than or equal to dogs."
	
#if people == dogs:
	#print "People are dogs."
	
# ex30

#people = 30
#cars = 40
#trucks = 15

#if cars > people:
	#print "We should take the cars."
#elif cars < people:
	#print "We should not take the cars."
#else:
	#print "We can't decide."
	
#if trucks > cars:
	#print "That's too many trucks."
#elif trucks < cars:
	#print "Maybe we could take the trucks."
#else:
	#print "We still can't decide."
	
#if people > trucks:
	#print "Alright, lets just take the trucks."
#else:
	#print "Fine, let's stay home then."
	
# ex31

#print "You enter a dark room with two doors. Do you go through door #1 or door #2?"

#door = raw_input(">")

#if door == "1":
	#print "There's a giant bear here eating a cheese cake. What do you do?"
	#print "1. Take the cake."
	#print "2. Scream at the bear."
	
	#bear = raw_input(">")
	
	#if bear == "1":
		#print "The bear eats your face off. Good job!"
	#elif bear == "2":
		#print "The bear eats your legs off. Good job!"
	#else: 
		#print "Well, doing %s is probably better. Bear runs away." % bear
		
#elif door == "2":
	#print "You stare into the endless abyss at Cthulhu's retina."
	#print "1. Blueberries."
	#print "2. Yellow jacket clothespins."
	#print "3. Understanding revolvers yelling melodies."
	
	#insanity = raw_input(">")
	
	#if insanity == "1" or insanity == "2":
		#print "Your body survives powered by a mind of jello. Good job!"
	#else:
		#print "The insanity rots your eyes into a pool of muck. Good job!"
		
#else:
	#print "You stumble around and fall on a knife and die. Good job!"
	
# ex32

#the_count = [1, 2, 3, 4, 5]
#fruits = ['apples', 'oranges', 'pears', 'apricots']
#change = [1, 'pennies', 2, 'dimes', 3, 'quarters']

#for number in the_count:
	#print "This is count %d" %number

#for fruit in fruits:
	#print "A fruit of type: %s" % fruit

#for i in change:
	#print "I got %r" % i

#elements = []#range(0,6)

#for i in range(0,6):
	#print "Adding %d to the list." % i
#elements.append(range(0,6))#(i)
	
#for i in elements:
	#print "Element was: %r" % i
	

# ex33

#i = 0
#numbers = []
#x = 7
#inc = 1
#while i < x:
#for i in range(0,10):
	#print "At the top i is %d" % i
	#numbers.append(i)
	
	#i = i + inc
	#print "Numbers now: ", numbers
	#print "At the bottom i is %d" % i
	
#print "The numbers: "

#for num in numbers:
	#print num
	
# ex34

# ex35

#from sys import exit

#def x():
	#global choice
	#choice = raw_input(">")

#def gold_room():
	#print "This room is full of gold. How much do you take?"
	
	#choice = raw_input(">")
	#if "0" in choice or "1" in choice:
	#if range(0,9) in choice:
		#how_much = int(choice)
	#else:
		#dead("Man, learn to type a number.")
	
	#if how_much < 50:
		#print "Nice, you're not greedy, you win!"
		#exit(0)
	#else:
		#dead("You greedy bastard!")
		
#def bear_room():
	#print "There is a bear here."
	#print "The bear has a bunch of honey."
	#print "The fat bear is in front of another door."
	#print "How are you going to move the bear?"
	#bear_moved = False
	
	#while True:
		#choice = raw_input(">")
		
		#if choice == "take honey":
			#dead("The bear looks at you then slaps your face off.")
		#elif choice == "taunt bear" and not bear_moved:
			#print "The bear has moved from the door. You can go through it now."
			#bear_moved = True
		#elif choice == "taunt bear" and bear_moved:
			#dead("The bear gets pissed off and chews your leg off.")
		#elif choice == "open door" and bear_moved:
			#gold_room()
		#else:
			#print"I got no idea what that means."
				

#def cthulhu_room():
	#print "Here you see the great evil Cthilhu."
	#print "He, it, whatever stares at you and you go insane."
	#print "Do you flee for your life or eat your head?"
	
	#choice = raw_input(">")
	
	#if "flee" in choice:
		#start()
	#elif "head" in choice:
		#dead("Well that was tasty!")
	#else:
		#cthulhu_room()
		

#def dead(why):
	#print why, "Good job!"
	#exit(0)

#def start():
	#print "You are in a dark room."
	#print "There is a door to your right and left."
	#print "Which one do you take?"
	
	#choice = raw_input(">")
	
	#if choice == "left":
		#bear_room()
	#elif choice == "right":
		#cthulhu_room()
	#else:
		#dead("You stumble around the room until you starve.")

#start()

# ex 36
# ex 37
# ex 38
#ten_things = "Apples Oranges Crows Telephone Light Sugar"

#print "Wait there are not 10 things in that list. Let's fix that."

#stuff = ten_things.split(' ')
#more_stuff = ["Day", "Night", "Song", "Frisbee", "Corn", "Banana", "Girl", "Boy"]

#while len(stuff) != 10:
	#next_one = more_stuff.pop()
	#print "Adding: ", next_one
	#stuff.append(next_one)
	#print "There are %d items now." % len(stuff)
	
#print "There we go: ", stuff

#print "Let's do some things with stuff."

#print stuff[1]
#print stuff[-1]
#print stuff.pop()
#print ' '.join(stuff)
#print '#'.join(stuff[3:5])

# ex 39
'''
states = {
	'Oregon': 'OR',
	'Florida': 'FL',
	'California': 'CA',
	'New York': 'NY',
	'Michigan': 'MI'
}

cities = {
	'CA': 'San Francisco',
	'MI': 'Detroit',
	'FL': 'Jacksonville'
}

cities['NY'] = 'New York'
cities['OR'] = 'Portland'

print '-' * 10
print "NY State has: ", cities['NY']
print "OR State has: ", cities['OR']

print '-' * 10
print "Michigan's abbreviation is: ", states['Michigan']
print "Florida's abbreviation is: ", states['Florida']

print '-' * 10
print "Michigan has: ", cities[states['Michigan']]
print "Florida has: ", cities[states['Florida']]

print '-' * 10
for state, abbrev in states.items():
	print "%s is abbreviated %s" % (state, abbrev)
	
print '_' * 10
for abbrev, city in cities.items():
	print "%s has the city %s" % (abbrev, city)

print '-' * 10
for state, abbrev in states.items():
	print " %s state is abbreviated %s and has city %s" % (state, abbrev, cities[abbrev])
	
print '-' * 10

state = states.get('Texas')

if not state:
	print "Sorry, no Texas."

city = cities.get('TX', 'Does Not Exist')
print "The city for the state 'TX' is: %s" % city
'''
###

import hashmap

states = hashmap.new()
hashmap.set(states, 'Oregon', 'OR')
hashmap.set(states, 'Florida', 'FL')
hashmap.set(states, 'California', 'CA')
hashmap.set(states, 'New York', 'NY')
hashmap.set(states, 'Michigan', 'MI')

cities = hashmap.new()
hashmap.set(cities, 'CA', 'San Francisco')
hashmap.set(cities, 'MI', 'Detroit')
hashmap.set(cities, 'FL', 'Jacksonville')

hashmap.set(cities, 'NY', 'New York')
hashmap.set(cities, 'OR', 'Portland')

print '-' * 10
print "NY State has: %s" % hashmap.get(cities, 'NY')
print "OR State has: %s" % hashmap.get(cities, 'OR')

print '-' * 10
print "Michigan's abbreviation is: %s" % hashmap.get(states, 'Michigan')
print "Florida's abbreviation is: %s" % hashmap.get(states, 'Florida')

print '-' * 10
print "Michigan has: %s" % hashmap.get(cities, hashmap.get(states, 'Michigan'))
print "Florida has: %s" % hashmap.get(cities, hashmap.get(states, 'Florida'))

print '-' * 10
hashmap.list(states)

print '-' * 10
hashmap.list(cities)

print '-' * 10
state = hashmap.get(states, 'Texas')

if not state:
	print "Sorry, no Texas."
	
city = hashmap.get(cities, 'TX', 'Does Not Exist')
print "The city for the state 'TX' is: %s" % city


	