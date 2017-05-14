#define stringlibdomlinecount 2
#include "stringslib.c"

int trivialrecursion(int start, int stop);

int main(int argc, char const *argv[]){	
	//make file pointer and set to null for error checking
	FILE * fileptr = NULL;
	
	//var fro file name and ease of validation
	const char * filename = argv[1];
	
	//validate good args
	if(filename == NULL){
		//otherwise throw error and tell what up
		printf("Please provide file path\n");
		return -1;
	}
	
	//buffer of file IO trys
	int countfiletry = 0;
	do{
		//try to open file
		fileptr = fopen(filename, "r");
		
		//buffer of bad file IO trys
		countfiletry++;
		if (countfiletry > 5){
			//give up and throw 
			printf("Failed to open file %s\n", filename);
			return -1;
		}
	//way to check fail over does not acount for bad data
	}while(fileptr == NULL);
	

	char filechar = 0;
	
	struct Str * filestr = createstring("");
	
	while( (filechar = (char)fgetc(fileptr) ) != EOF){
	
		appendchar(filestr,filechar);
	}
	//make some strings
	struct Str * word = createstring("this is a string");
	struct Str * wordtwo = createstring("this is a makes up a file");
	struct Str * wordthree = createstring("another string");
	struct Str * wordfour = createstring("but another string");
	//make a document
	struct Document* filething = createdocument();
	filething->lines[0] = *word;
	filething->lines[1] = *wordtwo;
	//2-d array
	struct Str dtwo[2][2];
	dtwo[0][0] = *word;
	dtwo[0][1] = *wordthree;
	dtwo[1][0] = *wordfour;
	dtwo[1][1] = *wordtwo;

	int recurseint = trivialrecursion(0, 10);
	//cleanup
	fclose(fileptr);
	destroystring(word);
	destroystring(wordtwo);
	destroydocument(filething);
	
}

int trivialrecursion(int start, int stop){
	if (start < stop){
		trivialrecursion(start, stop - 1);
	}
	else{
		return start;
	}
}
//*/
/*

C features: 

√	macro: stringsmain.c:1
√	IO: stringsmain.c:22
	recursion
√	2-d array of pointer: stringsmain.c:
√	array of string : Multiple places stringslib.c
√	dynamic array : Multiple places stringslib.c
√	nested struct: stringslib.c:29 

*/