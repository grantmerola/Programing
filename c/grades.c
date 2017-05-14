#include <stdio.h>
#include <strings.h>
#include <stdlib.h>

struct Str{
	char* str;
	int len;
};


//a function to ask and trim a string
void ask(struct Str* word){
	//give a large block of memory to put things in
	word->str = malloc(sizeof(char) * 10000);
	//get input and store in str memblock

	//use fget to get 250 of input problems will arize if that limit is approached 
	fgets(word->str,250,stdin);
	//get the length and store in string struct
	
	//we blindly remove the last char so as to get hopefully get rid of \n
	word->len = (strlen(word->str)-1);

	word->str[strlen(word->str) - 1] = '\0';
	
	//shorten very big mem block to size needed block
	word->str = realloc(word->str, word->len);
	

}
//test string
//2,3,5,0,9,8,4,0,8,5,7,0,3,4,5,0,2,9,5,0,2,0,2,3,7,5,9,8,2,7,5,0,2,9,8,5,2,8,3,0,9,2,8,0,4,9,2,3,0,7,9,5,8,0,2,9,3,8,4,0,9,5,9,8,3,4,7,5,9,3,4,7,10,7,5,2,4,5,9,8,3,3,8,5,7,1,9,2,3,1,2,2,0,10,2,0,10,1,7,5,7,5,1,9,7,5,9,9,5,7,1,3,7,
int main(int argc, char const *argv[])
{
	
	struct Str some_str;
	
	struct Str* str;
	
	str = &some_str;



	printf("Please enter grades as comma sperated list i.e.(2,3,5...)\n");
	ask(str);
	str->len = strlen(str->str);
	int distr[11];
	//empty array
	memset(distr,0,sizeof(int)*11);
	for (int i = 0; i < str->len; ++i){
		
		if(str->str[i] >= '0' && str->str[i] <= '9'){
			//test for sepcial case 10	
			if(str->str[i] == '1' && str->str[i+1] == '0'){
				++distr[10];
			}
			else{
				++distr[ (str->str[i])-'0' ];
			}
		}
	}
	for (int i = 0; i <= 10; ++i){
		printf("%d: ",i );
		for (int z = 0; z < distr[i]; ++z){
		 	printf("#");
		}
		printf(" : %d\n", distr[i]); 
	}
	
	return 0;
}
