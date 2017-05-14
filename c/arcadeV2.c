#include <stdio.h>
#include <stdlib.h>


int main(int argc, char const *argv[])
{
	//get int from args
	int ticket_num = atoi(argv[1]);

	// cost of various items in order from most to least (order is important)
	//in this case cand bars, gumballs and base unit tickets
	int cost[] = {10,3,1};
	//this could be modifyed so as to accept input values for item cost prefrence 

	//where we store the max value of every item in this case 3 items candy bars, gumballs, tickets
	int count[3];
	
	//go through the array cost
	for (int i = 0; i < sizeof(cost); ++i)
	{
		// devide to get the max number of items you could buy in your buy prefrence order and store
		count[i] = ticket_num / cost[i];
		//find out if you still have more tickets and can buy any thing with the tickets you do have
		ticket_num = ticket_num % cost[i];
		//if you cant buy any more things get out
		if (ticket_num == 0)
			break;

	}
	//what you are able to buy 
	printf("You can get %d candy bars and %d gumballs and have %d extra tickets.\n", count[0],count[1],count[2]);
}
//in whole this program could be made generic to find out the max of every thing in an array given a number