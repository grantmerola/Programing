#include <stdio.h>

int main(int argc, char const *argv[])
{
	int count = 0;
	
	while((argv[1])[count] == (argv[2])[count]){
		
		if((argv[1])[count] == '\0'){
			printf("equals\n");
			return 0;
		}
		else{
			count++;
		}
	}
	printf("not equals\n");
	return 0;
}