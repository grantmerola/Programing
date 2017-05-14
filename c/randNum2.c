#include <stdio.h>
#include <stdlib.h>
#include <time.h>

int main(int argc, char const *argv[])
{

	//http://stackoverflow.com/questions/11279767/how-do-i-make-sure-that-strtol-have-returned-successfully
	char *lowendptr;

	long low = strtol(argv[1], &lowendptr, 10);
	
	if (lowendptr == argv[1])
	{
	return 1;
	}
	
	char *highendptr;

	long high = strtol(argv[2], &highendptr, 10);
	
	if (highendptr == argv[2])
	{
	return 1;
	}
	


	//http://stackoverflow.com/questions/822323/how-to-generate-a-random-number-in-c
	srand(time(NULL));
	
	long randnum;

	for (int i = 0; i < 100; ++i)
	{
		long num = rand() % (high + 1);
		if (num >= low){
			randnum = num;
		}
		printf("Random number in range %ld - %ld: %ld\n", low, high, randnum );
	}
}