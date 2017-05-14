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
//can not detect tie games and will get stuck when there is tie


int isfull(int board[3][3], int postion);
int iswin(int board[3][3]);
int playmove(int board[3][3], int postion, int player);
void printboard(int board[3][3]);
int askplayer(int board[3][3]);
int computermove(int board[3][3]);

int * translate(int board[3][3], int postion);

int main(int argc, char const *argv[])
{
	int board[3][3] ={
		{0,0,0},
		{0,0,0},
		{0,0,0}
	};
	//memset(board,0,sizeof(int)*9);
	printf("Lets play Tic-Tac-Toe!\n");
	printf("Enter the place you want to play by entering the number it reprsents on the board\n");
	printf("1 | 2 | 3 \n");
	printf("4 | 5 | 6 \n");
	printf("7 | 8 | 9 \n");
	

	
	for (int i = 0; i < 9 ; ++i){
		
		printf("Your move\n");
		askplayer(board);
		printboard(board);

		if(iswin(board) == 0){
			printf("Game Over!!\n");
			return 0;
		}
		printf("Computer move\n");	
		computermove(board);
		printboard(board);
	}
	//*/


	return 0;
}
int askplayer(int board[3][3]){
	
	do{
	int playermove = 0;
	//ask for num 
	scanf("%d",&playermove);
	//convert to board postion number
	playermove = playermove - 1;
	//test if valid game number and valid move
	if(playermove >= 0 && playermove < 10 && isfull(board,playermove) == 0){
		playmove(board, playermove, -1);
		return 0;
	}
	printf("Please enter just a number to indcate postion on the board\n");
	}while(0 == 0);
}

int computermove(int board[3][3]){
	srand(time(NULL));
	//number for counting number of trys to get a good move
	int countgoodplaytrys = 0;
	do{

	//picks move
	int randmove = (rand() % 9);
	//checks if valid move
	if(isfull(board,randmove) == 0){
		//test if good move
		if(randmove != 0 && randmove != 8){
			if( *(translate(board,randmove + 1)) == 1 || *(translate(board,randmove - 1)) == 1){
				// play move
				playmove(board,randmove, 1);
				return 0;
			}
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
//*/
int * translate(int board[3][3], int postion){
	int* ptr;
	ptr = malloc(sizeof(int *));
	switch(postion){
		case 0 :
			ptr = &board[0][0];
			return ptr;
			break;
		case 1 :
			ptr = &board[0][1];
			return ptr;
			break;
		case 2 :
			ptr = &board[0][2];
			return ptr;
			break;
		case 3 :
			ptr = &board[1][0];
			return ptr;
			break;
		case 4 :
			ptr = &board[1][1];
			return ptr;
			break;
		case 5 :
			ptr = &board[1][2];
			return ptr;
			break;
		case 6 :
			ptr = &board[2][0];
			return ptr;
			break;
		case 7 :
			ptr = &board[2][1];
			return ptr;
			break;
		case 8 :
			ptr = &board[2][2];
			return ptr;
			break;



	}
}
int isfull(int board[3][3], int postion){
	//is there something where you want to place your piace 
	if(*(translate(board,postion)) == 0 ){
		//no
		return 0;
	}
	else{
		//yes
		return 1;
	}

}

int iswin(int board[3][3]){
	//itreate by rows
	for (int i = 0; i < 9; i = i + 3){
		//check win condition by adding three locations, due to x & o being 1 and -1 we only have to check those 
		if( (*(translate(board,i)) + *(translate(board,i + 1)) + *(translate(board,i + 2)) ) == 3 || (*(translate(board,i)) + *(translate(board,i + 1)) + *(translate(board,i + 2))) == -3 ){
			//return 0 for win condtion
			return 0;
		}
	}
	//iterate by colums
	for (int i = 0; i < 3; ++i){	
		//check colum wun
		if ( ( *(translate(board,i)) + *(translate(board,i + 3)) + *(translate(board,i + 6)) ) == 3 || *(translate(board,i)) + *(translate(board,i + 3)) + *(translate(board,i + 6)) == -3 ){
			//return 0 for win condtion
			return 0;
		}
	}
	//diagonal win condtions 
	if(*(translate(board,0)) + *(translate(board,4)) + *(translate(board,8)) == 3 || *(translate(board,0)) + *(translate(board,4)) + *(translate(board,8)) == -3){
		//return 0 for win condtion
		return 0;
	}
	if(*(translate(board,2)) + *(translate(board,4)) + *(translate(board,6)) == 3 || *(translate(board,2)) + *(translate(board,4)) + *(translate(board,6)) == -3){
		//return 0 for win condtion
		return 0;
	}
	//othewise no win
	return 1;	
	
}
//*/
int playmove(int board[3][3], int postion, int player){
	if(isfull(board, postion) == 0){
		*(translate(board,postion)) = player;
		return 0;
	}
	else{
		return 1;
	}
}

void printboard(int board[3][3]){
	char prettyboard[9];
	for (int i = 0; i < 9; ++i){
		if(*(translate(board,i)) == 1){
			prettyboard[i] = 'X';
		}
		else if(*(translate(board,i)) == -1){
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
//*/