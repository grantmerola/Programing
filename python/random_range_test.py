#random range
#import random
#for x in range(0,20,1):
	#print (random.randrange(1,100))

import random 
def dice():
	 dice1 = random.randrange(1,6)
	 dice2 = random.randrange(1,6)
	 print(dice1,dice2)
dice()