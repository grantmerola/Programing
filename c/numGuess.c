#include <stdio.h>
#include <stdlib.h>
#include <time.h>


int main(void){
	
	//muhhhhaahahaha you know what this means 
	jump:

	//http://stackoverflow.com/questions/822323/how-to-generate-a-random-number-in-c
	srand(time(NULL));

	//make up a number to guess
	int hidden_num = rand() % 100;
	

	int guess;
	int high = 100; 
	int low = 0;

	printf("I'm thinking of a number between 0 and 100 can you guess it?\n");

	//player has 10 tries to guess the number
	for (int i = 0; i < 5; ++i){
		
		
		//pull a number from the cli
		scanf("%d", &guess);
		
		//is it right
		if (guess == hidden_num){
			printf("You guessed correctly the number was: %d\n",hidden_num );
			printf("It took you %d trys.\n", i);	
			return 1;
		}
		//is it greater
		else if (guess < hidden_num){
			//store the most recent lowest guess vunerable to dumb user 
			low = guess;
			printf("Nope try again the number I was thinking of is greater than that in the range of %d to %d. You have %d trys left.\n",low,high, 5-i);
			


		}
		//is it lesser
		else if (guess > hidden_num){
			//store the most recent highest guess vunerable to dumb user 
			high = guess;
			printf("Nope try again the number I was thinking of is smaller than thatin the range of %d to %d. You have %d trys left.\n",low,high, 5-i);
			

		}
		else{
			printf("dont fail silently \n");
			return -0;
		}
		
	}
	//try again 
	printf("You couldent think of the number. The number was %d You were %d away from the number. Try again? Y/N\n", hidden_num, abs(guess - hidden_num));
	char keepgoing;
	//http://stackoverflow.com/questions/7898215/how-to-clear-input-buffer-in-c
	fseek(stdin,0,SEEK_END);
	
	//ask for yes no on trying again
	scanf("%1c", &keepgoing);
	
	//keep going	
	if (keepgoing == 'y' || keepgoing == 'Y'){
		//just as dirty
		goto jump;
		//recreisvely call main a dirty dirty thing to do  
		//main();
	}
	//dont keep going 
	else if (keepgoing == 'n' || keepgoing == 'N'){
		return 0;
	}
	//colicy user
	else{
		printf("quiting\n");
		return 0;
	}
}


