#include <stdio.h>
#include <stdlib.h>

int fibfunc(int n);
int main(int argc, char const *argv[])
{
	/*for (int i = 0; i < 10; ++i){
		printf("n:%d, fib:%d\n", i, fibfunc(i));
	}*/
	printf("n:%s, fib:%d\n", argv[1], fibfunc( (int)strtol(argv[1], NULL, 10) ) );
	
	return 0;
}
//i dont like math problems
int fibfunc(int n){
	//he
	if(n == 0){
		return 0;
	}
	//hehehe
	n = n - 2;
	
	int num1 = 0;
	int num2 = 1;
	int tempvar = 0;
	for (int i = 0; i <= n; ++i){
		tempvar = num2;
		num2 = num1+num2;
		num1 = tempvar;
	}
	return num2;
}