#include <stdio.h>
//no comments becuase just bad math

float hat(int weight, int height);
float jacket(int weight, int height, int age);
float waist(int weight, int age);

int main(int argc, char const *argv[]){
	int height, weight, age;
	printf("Please enter your height in inches\n");
	scanf("%d", &height);
	printf("Please enter your weight in pounds\n");
	scanf("%d", &weight);
	printf("Please enter your age in years\n");
	scanf("%d", &age);

	//printf("%d,%d,%d\n", height, weight, age);
	
	float hatsize = hat(weight, height);
	printf("hatsize: %f\n", hatsize );
	float jacketsize = jacket(weight, height, age);
	printf("jacketsize: %f\n", jacketsize );
	float waistsize = waist(weight, age);
	printf("waistsize: %f\n", waistsize );

	return 0;
}
float hat(int weight, int height){
	float hatsize = ((float)weight/height) * 2.9;
	return hatsize;
}
float jacket(int weight, int height, int age){
	float jacketsize = (float)(height*weight)/288;
	if (age >= 40){
		jacketsize = (float)jacketsize + ( (float) ((age / 10) - 3) * 0.125);
	}
	return jacketsize;
}
float waist(int weight, int age){
	float waistsize = (float)weight/5.7;
	if (age >= 30){
		waistsize = (float)waistsize + ( (float) ((age / 2) -14) * 0.1);
	}
	return waistsize;
}
