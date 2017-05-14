#include <stdio.h>

int main(void){
	
	//input char holder
	char ch;
	

	//how to use requires previous comp knowlege 
	printf("input charcters, finish input with \'#\'\n");
	
	//get from input wait for end charcter
	while((ch = getchar()) != '#'){
		if (ch == '\n')
			continue;
		printf("Step 1\n");
		if (ch == 'c')
			continue;
		else if (ch == 'b')
			break;
		else if (ch == 'g')
			goto laststep;
		printf("Step 2\n");
	laststep: printf("Step 3\n");
	}
	printf("Done\n");

}