#include <stdio.h>
#include <stdlib.h>

double intrest(double seed, double rate, int years);
int main(int argc, char const *argv[]){
	
	printf("%f\n", intrest( strtod(argv[1], NULL), strtod(argv[2], NULL), strtol(argv[3], NULL,10) ) );
	return 0;
}
double intrest(double seed, double rate, int years){
	
	if(0 == years){
		return seed;
	}
	else{
		// do math and count down until no more years left
		return intrest( seed + (seed * (rate/100) )  , rate ,years - 1);
	
	}
}