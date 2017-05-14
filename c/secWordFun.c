//to do make spaces not count
#include <stdio.h>
#include <stdlib.h>
#include <strings.h>
#include <ctype.h>


struct Str{
	char* str;
	int len;
};
//specific
void ask_secret(struct Str* word);
int ask_for_guess(struct Str* sec_word, struct Str* word, struct Str* guess_history);
//semi generic
int tryamount(struct Str* word);
int correctletters(int * postions, char letter, struct Str* constructed_word);
//generic 
void clear();
int validword(struct Str* word);
void ask(struct Str* word);
void makesmall(struct Str* word);
int* contains(struct Str* word, struct Str* letter);


int main(int argc, char const *argv[]){	
	
	//make a secret word struct name is mostly not important
	struct Str sec_str;
	// secret word pointer, actully used
	struct Str* secret_word;
	//make the pointer point to the empty struct
	secret_word = &sec_str;

	//repeat process fort temp guess word
	struct Str guess_str;
	struct Str* guess;
	guess = &guess_str;

	//declareing string to print
	struct Str guess_history;
	struct Str* constructed_word;
	constructed_word = &guess_history;


	//function to ask secret word it also validates input and clears screen
	ask_secret(secret_word);	
	//we now have the secret word

	//intilze the string that will be printed
	int stringsize = (sizeof(char) * secret_word->len)+ 1;
	constructed_word->str = malloc(stringsize);
	constructed_word->len = ((sizeof(char) * secret_word->len)+ 1);
	//intilize with underscores
	for (int i = 0; i < constructed_word->len; ++i){
		constructed_word->str[i] = '_';
	}
	//add null terminator 
	constructed_word->str[stringsize - 1] = '\0';

	int trys = tryamount(secret_word);
	printf("Player 1 has entered a word for you to guess, you have %d trys.\n",trys);
	// loop for how many trys you have
	for (int i = 0; i < trys; ++i){
		if(ask_for_guess(secret_word,guess, constructed_word) == 0){
			//win
			printf("You guess word %s right, you win!\n",secret_word->str );
			return 0;
		}
	}
	printf("You could not guess the word in %d trys. The word was: %s\n", trys, secret_word->str );
	return 0;
}
void ask_secret(struct Str* word){
	//a flag that is used to tell weather is is the first time through the loop and weather we need to prompt the user
	int wrongflag = 0;
	
	do{
		//prompt user for secret
		printf("Player 1 please enter a prase or word for Player 2 to guess. Make sure they aren't looking!\n");
		ask(word);
		// if this is not the first time throught the loop ask for better input
		if(wrongflag == 1){
			printf("Please enter a valid word, only letters.\n");
		}
		//changed on first time through
		wrongflag = 1;
		//test weather the input is valid
	}while(validword(word) != 0);
	//convert to lower case for
	makesmall(word);
	clear();
	
}

int ask_for_guess(struct Str* sec_word, struct Str* word, struct Str* guess_history){
	//recalc trys for print should be same value as one used to controll the trys loop
	int trys = tryamount(sec_word);
	//a flag that is used to tell weather is is the first time through the loop and weather we need to prompt the user
	int wrongflag = 0;
	
	do{
		
		printf("Guess letter or word.\n");
		ask(word);
		// if this is not the first time throught the loop ask for better input
		if(wrongflag == 1){
			printf("Please enter a valid word, only letters.\n");
		}
		//changed on first time through
		wrongflag = 1;
		//test weather the input is valid
	}while(validword(word) != 0);
	//convert to lower case for
	makesmall(word);

	int * postions;
	if(word->len == 1){
		postions = contains(sec_word,word);
		if(correctletters(postions, word->str[0], guess_history) == 1){
			return 0;
		}
		return 1;
	}
	//test if guess word is the secret word if so win
	else if (strcmp(sec_word->str,word->str) == 0){
			return 0;
	}
	else{
		return 1;
	}
	free(word);

}

//semi generic funcs
	int tryamount(struct Str* word){
		//a very simple huristic for generateing the number of trys for a given word length
		if(word->len <= 5){
			return 3;
		}
		else if(word->len == 6 || word->len == 7 ){
			return (word->len / 2) + 1;
		}
		else if(word->len >= 8){
			return (word->len / 2);
		}
		return 10;
	}
	//print string with missing letters and returns word
	int correctletters(int * postions, char letter, struct Str* constructed_word){

		int count_of_correct = 0;

		for (int i = 0; i < constructed_word->len; ++i){
			// the letter was correct
			if(postions[i] == 1){
				//store the letter in the correct place 
				constructed_word->str[i] = letter;
				//count that we go one correct
				count_of_correct++;
			}
		}
		//this is for the speical case where one would guess all the letters but not the word
		int test_for_underscore = 0;
		for (int i = 0; i < constructed_word->len; ++i){
			//it test to see if there is any more charcters to be filled in
			if(constructed_word->str[i] != '_'){
				test_for_underscore++;
			}
		}
		if(test_for_underscore == constructed_word->len){
			//return rare win scinero 
			return 1;
		}

		printf("You got %d right.\n", count_of_correct);
		printf("%s\n", constructed_word->str);
		printf("Guess again\n");

		return 0;
	}



//generic funcs

	//do our best to hide the input
	void clear(){
		
		//ways to try to clear the screen
		char clear[6] = "clear";
		char cls[4] = "cls";
		//unix
		system(clear);
		//dos
		system(cls);
		//hopefully both
		printf("\033[2J");
		
	}
	// A function that checks whether a string is made up of letters and spaces
	int validword(struct Str* word){
		//a counter that totals valid chars
		int total_valid = 0;
		//a loop that runs the strings length
		for (int i = 0; i < word->len; ++i){
			//is a char from the str a letter or space
			if ( (word->str[i] >= 'A' && word->str[i] <= 'Z') || (word->str[i] >= 'a' && word->str[i] <= 'z') || word->str[i] == ' ' ){
				//if it is make sure we add it to our total of valid chars
				total_valid++;
			}
		}
		//if the total number of chars is equale to the length then the string must be made up only of letters or spaces
		if(total_valid == word->len){
			//return a success to the question if this word is made up of letters or spaces
			return 0;
		}
		//this means that the word has numbers or other chars in it  or some thing has gone wrong
		return 1;
	}
	//a function to ask and trim a string
	void ask(struct Str* word){
		//give a large block of memory to put things in
		word->str = malloc(sizeof(char) * 250);
		//get input and store in str memblock
		//scanf("%[^\n]s",*&word->str);//bad----------------------------
		//use fget to get 250 of input problems will arize if that limit is approached 
		fgets(word->str,250,stdin);
		//get the length and store in string struct
		
		//we blindly remove the last char so as to get hopefully get rid of \n
		word->len = (strlen(word->str)-1);

		word->str[strlen(word->str) - 1] = '\0';
		//word->str[(word->len - 1)] = '\0'; //why not
		//shorten very big mem block to size needed block
		word->str = realloc(word->str, word->len);
		//word->str = realloc(word->str, (word->len - 1)); //why not

	}
	// convets to lower case
	void makesmall(struct Str* word){
		for (int i = 0; i < word->len; ++i){
			//uses typec func tolower for magic
			word->str[i] = tolower(word->str[i]);
		}
	}
	int* contains(struct Str* word, struct Str* letter){
		// array of size of word
		int* postions = (int *)malloc(sizeof(int) * word->len);
		for (int i = 0; i < word->len; ++i){
			//if the letter in the secret word equles the guess letter
			if (word->str[i] == letter->str[0]){
				//record a one in the array to indicate that the guess letter was found
				*(postions + i) = 1;
			}
		}
		//returns array with 1's for matches
		return postions;
	}

