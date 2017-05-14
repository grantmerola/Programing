#include <stdio.h>

int main(void)
{
		//some avalible in {short, long, long long} {signed, unsigned} versions
		
		//char not really a type~
		char thisisachar = 'c';//{signed unsigned}
		int thisisaint = 200;//{short, long, long long} {signed, unsigned}
		float thisisafloat = 34.34;
		double thisisadouble = 3235245.234234252;//{long}



		printf("this is a char: %c\n",thisisachar);
		printf("this is a int: %i\n",thisisaint);
		printf("this is a float: %f\n",thisisafloat);
		printf("this is a double: %f\n",thisisadouble);

}