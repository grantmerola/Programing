# Adventure 1

#functions used to make life easy

# the check it does may be redundant, do to the need to supply variables to the function
# also cut function size and create special exception for the one 3 choice string in stead of burdening the other bits
def options(keyw1, keyw2, keyw3):
	print "Options"
	
	if len(keyw1) > 0 :
		print "Enter 1 for %s" % keyw1
	
	else:
		pass
	
	if len(keyw2) > 0 :
		print "Enter 2 for %s" % keyw2
	
	else:
		pass
	
	if len(keyw3) > 0 :
		print "Enter 3 for %s" % keyw3
	
	else:
		pass
		

def wrong():
	print "Please enter your choice correctly"
	 
def dead(deadreason,comment):
	print "Oh no you are dead! You died of %s. You were a %s." % (deadreason, comment)

# first split 
def meadowsplit(): 	
	
	options("forward", "right", "left")
	
	user_input = raw_input("-")
	
	if user_input == "1":
		meadowpath()
	
	elif user_input == "2":
		holepath()
		
	
	elif user_input == "3":
		shrinepath()
	
	else:
		wrong()
		meadowsplit()

#Meadow path or Forward path
def meadowpath():

	print "You start walking across the meadow, you start to lose track of time the day seems endless. Time is has for the first time ever stopped, but still you slog on."
	
	options("continue going forward","wander aimlessly into the woods","")
	
	user_input = raw_input("-")

	if user_input == "1":
		print "As you go the forest on either side of you becomes older and denser, you see vines and palm trees. "
		print "In the distance you see a gray speck and as you get closer to it grows in size until it starts to fill a large part of the horizon."
		print "You now realize that that it is an enormous pyramid with a temple on top of it. It looks old and overgrown."
		print "You reach the pyramid base and it is enormous"
		endbegin()
	elif user_input == "2":
		dead("starvation","fool")
	
	else:
		wrong()
		meadowpath()

#hole path or right path				
def holepath():
	print "You walk into the woods to your right as you do deeper it becomes harder to see and you trip and fall to a hole."
	print "As you get up you realize that you fell quite aways into a rather large hole that seems to open up in to a cave farther down, you don't see any way out."
	options("searching the area around you for a way out","going deeper","")
	
	user_input = raw_input("-")
	
	if user_input == "1":
		print "You begin to search all around the edges of the hole for a way out, you don\'t find one but you do stumble upon a small alcove with a pocket watch inside"
		print "You open it up a scrap of paper falls out. You pick it up and read what it says."
		print "\n\"The fruit of the green man is life.\"\n"
		print "You are confused by the meaning of this poem."
		print "With a lack of options you decide you have no choice but to go deeper into the cave"
		mushroomdare()
	elif user_input == "2":
		print"You decide to go deeper into the cave without bothering to search around."
		dead("dehydration","idiot")
			
	else:
		wrong()
		holepath()

def mushroomdare():
	print "You have become lost in the cave, you are suffering from dehydration and hunger."
	print "You scour the cave for something to help you, all you find is some mushrooms."
	
	options("try mushrooms","keep going","")
	
	user_input = raw_input("-")
	
	if user_input == "1":
		greenbrown()
	elif user_input == "2":
		print "You decide not to try the mushrooms in favor of going on and hoping to find a way out."
		dead("starvation","unlucky")
	else:
		wrong()
		mushroomdare()
		
def greenbrown():
	print "You choose to try the mushrooms, but there are two types which do you try."
	
	options("try the green mushroom","try the brown mushroom","just go to town and try both")
	
	user_input = raw_input("-")
	
	if user_input == "1":
		print "You try the green mushroom, you find it to be delicious, juicy and filling."
		print "You gather what other mushrooms you find around you and head off deeper into the cave."
		print "You crawl around the cave for what seem like an eternity surviving off the mushrooms."
		print "You eventually see light in the cave opens up to what seems to be an ancient city, at the center of the city is an enormous pyramid with a temple on top, you walk till you get to the base of it."
		endbegin()
	elif user_input == "2":
		print "You decided to try the brown mushroom."
		dead("poison","not a good listener")
		
	elif user_input == "3":
		print "You decided to just go to town on those mushrooms."
		dead("poison","brilliant but unlucky soul")
		
	else:
		wrong()
		greenbrown()
		
#Shrine path or Left path
#choice#1
def shrinepath():
	print "You head off into the woods on your left, after some time you see a shrine with water bubbling out of it. Now that you think about it you are very thirsty."
	options("drink","dont drink any thing and keep going","")
	
	user_input = raw_input("-")

	if user_input == "1":
		print "You have drank from a sacred spring the natives are not happy they emerge out of the woods and tie you up!"
		esacpe()
	elif user_input == "2":
		print "You decide not to drink and to keep walking forward into the forest."
		dead("dehydration","dumbass")
	
	else:	
		wrong()
		shrinepath()
#choice#2
def esacpe():
	print  "It is night the natives have carried you a long ways during the day and you have notice that the jungle is changing."
	print "You see a sharp rock not to far away you might be able to get over it and use it to cut your bonds."
	
	options("try to escape","stay put","")
	
	user_input = raw_input("-")		
	
	if user_input == "1":
		print "You shimmy over to the rock and cut your bonds and stagger off into the woods in the middle of the night no one see you go."
		print "You walk through the night and morning you feel like you're about to collapse, when you come to a clearing in the woods."
		print "You see structures beyond the trees it looks like an old abandoned city in the city there is an enormous pyramid with a temple on top in the middle of the city."
		print "You walk to the base of the pyramid." 
		endbegin()
	elif user_input == "2":
		print "You decide to wait out the night and see where the natives take you."
		print "You spend most of the next day in the company of the natives you make friends and you find out that they are taking you to a lost city where there god lives."
		print "They carry you to the edge of the city and let you go. They say that you must go to the enormous pyramid because the only source of water is at the top. "
		print "You stand at the base of the pyramid."
		endbegin()
	else:
		wrong()
		esacpe()

#beginning the merge for the end and one pos end		
def endbegin():
	print "You stand at the base of this enormous pyramid looking up at it in awe at its size. Seem as if you were drawn here for some reason, as you gaze up to the temple that adorns the pyramid you feel an irresistible pull."
	print "You decide you must climb to the top of the pyramid."
	print "You start the arduous climb up to the top."
	print "As you get closer it seems only to become more alluring."
	print "When you reach the top there is a small pool where you sate your thirst, as you drink you see some stones that seem miss aligned you go to examin" 
	print "You pry at the stones and they come loose revealing a passage way down into the pyramid, being the adventurous type you venture down"
	print "Layed out before you are riches so great they boggle the mind. Among these piles of gold you see a structure rising out of the treasure."
	
	options("take what gold you see close at hand and get the hell out","Venture toward the structure in the middle","")
	
	user_input = raw_input("-")
	
	if user_input == "1":
		print  "Grab a bunch of treasure and head for the exit after getting out you head off into the forest after several harrowing days and nights you find city where you sell you riches, and retire in style and wealth."
	elif user_input == "2":
		print "You venture to the pillar among the riches, you climb up to the top. At the top there is a throne with a masked figure sitting on it. You figure some long dead king buried with his riches"
		print "YOU ARE MY SALVATION!!"
		print "You jump the figure has risen and is speaking to you."
		print "YOU HAVE RELIEVED MY BURDEN I AM FREE AND YOU WILL BE TRAPPED HERE FOR ETERNITY."
		print "You back away but the figure springs at you and pressed his hand against your forehead. Your forehead explodes in pain and there is a brilliant flash of light."
		print "The figure cackles and screams \" NOW I GIVE YOU THE CURSE OF ETERNAL LIFE \" and then crumbles to dust."  			
		print "As you lay there stunned the pyramid shakes and the opening you came through collapses."
		print "You are alone trapped forever." 
	else:
		wrong()
		endbegin()
#start path
def start():
	print "You wake up, you are groggy and disoriented."
	print "You get up and look around, you are standing in a beautiful meadow with trees on either side but clear in front."   
	meadowsplit()

#start
start()