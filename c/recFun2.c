#include <stdio.h>
#include <stdlib.h>

int pins(int n, int i);
int main(int argc, char const *argv[]){
	
	printf("%d\n", pins( strtol(argv[1], NULL, 10),0 ) );
	return 0;
}
//this took way to long to figure out
//honestly i just tryed things till some thing worked, i had no expectaions for this to
int pins(int n, int i){
	
	if(0 == n){
		return i;
	}
	else{
		i = i + n;
		return pins(n - 1, i) ;
	
	}
}