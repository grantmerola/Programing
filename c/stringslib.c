#include <stdio.h>
#include <stdlib.h>
#include <strings.h>
#include <ctype.h>

#ifndef stringlibdomlinecount
#define stringlibdomlinecount 0
#endif

struct Str * createstring(char * instring);
void destroystring(struct Str* instring);

struct Document * createdocument();

int isalphachar(struct Str* instring);
int isalphasentence(struct Str* instring);
void tolowercase(struct Str* instring);
int* contains(struct Str* instring, struct Str* letter);
int equals(struct Str * instring, struct Str * instringtwo);
int indexof(struct Str * instring, struct Str* letter);
char * startat(struct Str * instring, int postion);
int appendchar(struct Str * instring, char letter);
int appendstring(struct Str * instring, struct Str * strtoappend);

struct Str{
	char* str;
	int len;
};

struct Document{
	struct Str lines[stringlibdomlinecount];
	int linecount;

};

//string factory

//creates and returns a pointer to a string object
struct Str * createstring(char * instring){
	
	//create pointer that will survive the function and point it at object
	struct Str* stringptr = malloc(sizeof(struct Str *));//freed in destructor 	
	
	//give memory for intial string we malloc to garenty ability to free later 
	stringptr->str = malloc(sizeof(char) * strlen(instring));//freed in destructor 	
	//move instring to new home
	strcpy(stringptr->str, instring);
	//set length
	stringptr->len = strlen(instring);

	//return pointer
	return stringptr;
}

//destroys a string object
void destroystring(struct Str* instring){
	//frees string memory 
	//note even may be valid and accessable after free because C (ノಠ益ಠ)ノ彡┻━┻
	free(instring->str);
	free(instring);
}

//document factory
struct Document * createdocument(){

	//create pointer that will survive the function and point it at object
	struct Document* documentptr = malloc(sizeof(struct Document *));//freed in destructor 
	
	//give me memory to store the length  
	documentptr->linecount = stringlibdomlinecount;

	//return pointer
	return documentptr;
}
void destroydocument(struct Document* inDocument){
	//frees string memory 
	//note even may be valid and accessable after free because C (ノಠ益ಠ)ノ彡┻━┻
	free(inDocument);
}


//lib

// checks if string is made up of alpha returns 0 on success
int isalphachar(struct Str* instring){
	//a counter that totals valid chars
	int total_valid = 0;
	//a loop that runs the strings length
	for (int i = 0; i < instring->len; ++i){
		//is a char from the str a letter or space
		if ((instring->str[i] >= 'A' && instring->str[i] <= 'Z') || 
			(instring->str[i] >= 'a' && instring->str[i] <= 'z')){
			//if it is make sure we add it to our total of valid chars
			total_valid++;
		}
	}
	//if the total number of chars is equale to the length then the string must be made up only of letters or spaces
	if(total_valid == instring->len){
		//return a success to the question if this word is made up of letters or spaces
		return 0;
	}
	//this means that the word has numbers or other chars in it  or some thing has gone wrong
	return 1;
}

// checks if string is made up of alpha and spaces returns 0 on success
int isalphasentence(struct Str* instring){
	//a counter that totals valid chars
	int total_valid = 0;
	//a loop that runs the strings length
	for (int i = 0; i < instring->len; ++i){
		//is a char from the str a letter or space
		if ((instring->str[i] >= 'A' && instring->str[i] <= 'Z') || 
			(instring->str[i] >= 'a' && instring->str[i] <= 'z') || 
			instring->str[i] == ' ' ){

			//if it is make sure we add it to our total of valid chars
			total_valid++;
		}
	}
	//if the total number of chars is equale to the length then the string must be made up only of letters or spaces
	if(total_valid == instring->len){
		//return a success to the question if this word is made up of letters or spaces
		return 0;
	}
	//this means that the word has numbers or other chars in it  or some thing has gone wrong
	return 1;
}

// convets to lower case
void tolowercase(struct Str* instring){

	for (int i = 0; i < instring->len; ++i){
		//uses typec func tolower for magic
		instring->str[i] = tolower(instring->str[i]);
	}
}

//searches string for char and returns int array of the postions of the letter in the string
int* contains(struct Str* instring, struct Str* letter){
	// array of size of word
	int* postions = (int *)malloc(sizeof(int) * instring->len);
	for (int i = 0; i < instring->len; ++i){
		//if the letter in the instring equles the guess letter
		if (instring->str[i] == letter->str[0]){
			//record a one in the array to indicate that the guess letter was found
			*(postions + i) = 1;
		}
	}
	//returns array with 1's for matches
	return postions;
}

//compares two string objects returns 0 if equale
int equals(struct Str * instring, struct Str * instringtwo){
	//are the strings equle in length if not get out now
	if(instring->len == instringtwo->len){
		int count = 0;
		//othwise count the number of similar charcters
		for (int i = 0; i < instring->len; ++i){
			if(instring->str[i] == instringtwo->str[i]){
				count++;
			}
		}
		//if the count of the same charters is same of the length then they must be the same 
		if (count == instring->len){
			return 0;
		}
		else{
			return 1;
		}
	}
	else{
		return 1;
	}
}
/*
//finds the first index of the letter passed
int indexof(struct Str * instring, struct Str* letter){
	return 0;
}

//
char * startat(struct Str * instring, int postion){
	char * ptrstart;
	return ptrstart;
}
//*/

int appendchar(struct Str * instring, char letter){	
	//give more room to add char
	instring->str = realloc(instring->str,sizeof(char) * instring->len + 1 );
	//add letter to -1 new end
	instring->str[instring->len] = letter;
	//remake null
	instring->str[instring->len +1] = '\0';
	//update length
	instring->len = instring->len + 1;
	return 0;
}
int appendstring(struct Str * instring, struct Str * strtoappend){
	
	int combinedlen = instring->len + strtoappend->len;
	
	instring->str = realloc(instring->str,sizeof(char) * combinedlen);
	
	strcat(instring->str, strtoappend->str);

	instring->len = combinedlen;
	
	return 0;
}
