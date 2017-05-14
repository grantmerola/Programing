#include <stdio.h>
#include <stdlib.h>
#include <time.h>
#include <strings.h>

/*
computer
1 = X

0 = empty

player
-1 = O
*/

int isfull(int * board, int postion);
int iswin(int * board);
int playmove(int * board, int postion, int player);
void printboard(int * board);
int askplayer(int * board);
int computermove(int * board);

int main(int argc, char const *argv[])
{
	int board[9];
	memset(board,0,sizeof(int)*9);
	printf("Lets play Tic-Tac-Toe!\n");
	printf("Enter the place you want to play by entering the number it reprsents on the board\n");
	printf("1 | 2 | 3 \n");
	printf("4 | 5 | 6 \n");
	printf("7 | 8 | 9 \n");
	for (int i = 0; i < 9 ; ++i){
		askplayer(board);
		computermove(board);
		printboard(board);
		if(iswin(board) == 0){
			printf("Game Over!!\n");
			return 0;
		}	
	}


	return 0;
}
int askplayer(int * board){
	
	do{
	int playermove = 0;
	//ask for num 
	scanf("%d",&playermove);
	//convert to board postion number
	playermove = playermove - 1;
	//test if valid game number and valid move
	if(playermove > 0 && playermove < 10 && isfull(board,playermove) == 0){
		playmove(board, playermove, -1);
		return 0;
	}
	printf("Please enter just a number to indcate postion on the board\n");
	}while(0 == 0);
}

int computermove(int * board){
	srand(time(NULL));
	//number for counting number of trys to get a good move
	int countgoodplaytrys = 0;
	do{

	//picks move
	int randmove = (rand() % 9);
	//checks if valid move
	if(isfull(board,randmove) == 0){
		//test if good move
		if(board[randmove + 1] == 1 || board[randmove - 1] == 1){
			// play move
			playmove(board,randmove, 1);
			return 0;
		}
		//incress the count of trys for a good play
		countgoodplaytrys++;
		//if we have tryed to find a good play 15 time we give up and just play some thing
		if (countgoodplaytrys > 15){
			// play move
			playmove(board,randmove, 1);
			return 0;
		}
	}
	}while(0== 0);

}

int isfull(int * board, int postion){
	//is there something where you want to place your piace 
	if(board[postion] == 0 ){
		//no
		return 0;
	}
	else{
		//yes
		return 1;
	}

}
int iswin(int * board){
	//itreate by rows
	for (int i = 0; i < 9; i = i + 3){
		//check win condition by adding three locations, due to x & o being 1 and -1 we only have to check those 
		if( (board[i] + board[i + 1] + board[i + 2]) == 3 || (board[i] + board[i + 1] + board[i + 2]) == -3 ){
			//return 0 for win condtion
			return 0;
		}
	}
	//iterate by colums
	for (int i = 0; i < 3; ++i){	
		//check colum wun
		if ( (board[i] + board[i + 3] + board[i + 6]) == 3 || (board[i] + board[i + 3] + board[i + 6]) == -3 ){
			//return 0 for win condtion
			return 0;
		}
	}
	//diagonal win condtions 
	if(board[0] + board[4] + board[8] == 3 || board[0] + board[4] + board[8] == -3){
		//return 0 for win condtion
		return 0;
	}
	if(board[2] + board[4] + board[6] == 3 || board[2] + board[4] + board[6] == -3){
		//return 0 for win condtion
		return 0;
	}
	//othewise no win
	return 1;	
	
}
int playmove(int * board, int postion, int player){
	if(isfull(board, postion) == 0){
		board[postion] = player;
		return 0;
	}
	else{
		return 1;
	}
}
void printboard(int * board){
	char prettyboard[9];
	for (int i = 0; i < 9; ++i){
		if(board[i] == 1){
			prettyboard[i] = 'X';
		}
		else if(board[i] == -1){
			prettyboard[i] = 'O';
		}
		else{
			prettyboard[i] = ' ';
		}
	}
	printf("%c | %c | %c \n",prettyboard[0],prettyboard[1], prettyboard[2]);
	printf("%c | %c | %c \n",prettyboard[3],prettyboard[4], prettyboard[5]);
	printf("%c | %c | %c \n",prettyboard[6],prettyboard[7], prettyboard[8]);
}