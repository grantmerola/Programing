#include <stdio.h>
#include <stdlib.h>
#include <time.h>

int main(int argc, char const *argv[])
{
	int winners[4];
	srand(time(NULL));
	for (int i = 0; i < 4; ++i)
	{
		int winner = (rand() % 25) + 1;
		if(winner != winners[0] && winner != winners[1] && winner != winners[2] && winner != winners[3] ){
			winners[i] = winner;
			printf("winners:%d\n",winners[i]);
		}
	}
	return 0;
}