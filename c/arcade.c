#include <stdio.h>
#include <stdlib.h>

int main(int argc, char const *argv[])
{
	//get int from args
	int ticket_num = atoi(argv[1]);
	
	//can we get whole candy bars out ?
	if(ticket_num % 10 == 0){
		//yes, so find out how many and return
		int candy_bars = (ticket_num/10);
		printf("You can get %d candy bars.\n",candy_bars);
		return 0;
	}
	else{
		//otherwise find out how many more than an evenly divisable candy bars we have 
		int non_bar_tickets = ticket_num % 10;
		//and take thouse off and fiugure out how many whole candy bars we can get
		int candy_bars =(ticket_num - non_bar_tickets)/10;
		//we have now taken up all the candy bars we will be able to get so lets find out how many gumballs we can get
		//can we get whole gum balls
		if(non_bar_tickets % 3 == 0){
			//yes, then find out how many and return that with the number of candy bars
			int gumballs = (non_bar_tickets/3);
			printf("You can get %d candy bars and %d gumballs.\n",candy_bars,gumballs);
			return 0;
		}
		else{
			//other wise repeat the same proccess to find out the number of extra tickets and return all three ammounts 
			int extra_tickets = non_bar_tickets % 3;
			int gumballs =(non_bar_tickets - extra_tickets)/3;
			printf("You can get %d candy bars and %d gumballs and have %d extra tickets.\n",candy_bars, gumballs, extra_tickets);
		}

	}
}