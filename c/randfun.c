#include <stdio.h>
#include <stdlib.h>
#include <time.h>

int rand_int(int min, int max);

int main(int argc, char const *argv[])
{
	long low = strtol(argv[1], NULL, 10);

	long high = strtol(argv[2], NULL, 10);

	rand_int(low, high);
	return 0;
}

int rand_int(int min, int max){
	
	//http://stackoverflow.com/questions/822323/how-to-generate-a-random-number-in-c
	srand(time(NULL));
	
	long randnum;

	for (int i = 0; i < 100; ++i)
	{
		long num = rand() % (max + 1);
		if (num >= min){
			randnum = num;
		}
		printf("Random number in range %d - %d: %ld\n", min, max, randnum );
		return randnum;
	}
	return -1;
}