#include <stdio.h>
#include <stdlib.h>
#include <time.h>

int main(int argc, char const *argv[])
{
	//http://stackoverflow.com/questions/822323/how-to-generate-a-random-number-in-c
	srand(time(NULL));
	for (int i = 0; i < 10; ++i)
	{
		printf("%d\n", rand());
	}
}