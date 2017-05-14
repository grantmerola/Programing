//*****************************************************************

// Name: Grant Merola

// Class: CS162 Fall 2015

// Class times: MW 1000

// Date: 8/5/15

// Project #:1

// Driver Name:project1.java 

// Program Description: generates numbers in a range to am amount requested from the user

// Test Oracle: 
/*
How many numbers
35
Error not in range
How many numbers
65
How many times that number was randomly generated with in that range given a total number of generations equal to the number entered.
The range 1-10
.......
Times generated 7

The range 11-20
...........
Times generated 11

The range 21-30
.......
Times generated 7

The range 31-40
....
Times generated 4

The range 41-50
.......
Times generated 7

The range 51-60
.....
Times generated 5

The range 61-70
....
Times generated 4

The range 71-80
........
Times generated 8

The range 81-90
.......
Times generated 7

The range 91-100
......
*/
//*****************************************************************
import java.util.Scanner;
import java.util.Random;

public class project1{

	public static void main(String[] args){
	
	//vars declarations 
	Scanner scan = new Scanner(System.in);
	Random rng = new Random();
	
	boolean valid = false;
	
	int rngnum,countlow,counthigh;
	
	int[] numcount = new int[10];
	
	//validation loop
	System.out.println("How many numbers");
	int numvalues = scan.nextInt();
		do{
			if (numvalues >= 50 && numvalues <=200){
			valid = true;
			break;
			}
		System.out.println("Error not in range");
		System.out.println("How many numbers");
		numvalues = scan.nextInt();
		
		}while(valid == false);
	
	//number generation, location store and count
	System.out.println("How many times that number was randomly generated with in that range given a total number of generations equal to the number entered.");
	for(int i = 0; i <= numvalues;i++){
		rngnum = rng.nextInt(100)+1;
			 //screw switch and cleaver ways to do stuff if else is simmple and better
			// i'm not cleaver ¯\_(ツ)_/¯
			/*switch (rngnum){

				case (rngnum >=1 && rngnum <= 10): numcount[0] = numcount[0] + 1;
				break;
				case (rngnum >=11 && rngnum <= 20): numcount[1] = numcount[1] + 1;
				break;
				case (rngnum >=21 && rngnum <= 30): numcount[2] = numcount[2] + 1;
				break;
				case (rngnum >=31 && rngnum <= 40): numcount[3] = numcount[3] + 1;
				break;
				case (rngnum >=41 && rngnum <= 50): numcount[4] = numcount[4] + 1;
				break;
				case (rngnum >=51 && rngnum <= 60): numcount[5] = numcount[5] + 1;
				break;
				case (rngnum >=61 && rngnum <= 70): numcount[6] = numcount[6] + 1;
				break;
				case (rngnum >=71 && rngnum <= 80): numcount[7] = numcount[7] + 1;
				break;
				case (rngnum >=81 && rngnum <= 90): numcount[8] = numcount[8] + 1;
				break;
				case (rngnum >=91 && rngnum <= 100): numcount[9] = numcount[9] + 1;
				break;

			}*/


			if(rngnum >=1 && rngnum <= 10){
			numcount[0] = numcount[0] + 1;
			}
			else if(rngnum >=11 && rngnum <= 20){
			numcount[1] = numcount[1] + 1;
			}
			else if(rngnum >=21 && rngnum <= 30){
			numcount[2] = numcount[2] + 1;
			}
			else if(rngnum >=31 && rngnum <= 40){
			numcount[3] = numcount[3] + 1;
			}
			else if(rngnum >=41 && rngnum <= 50){
			numcount[4] = numcount[4] + 1;
			}
			else if(rngnum >=51 && rngnum <= 60){
			numcount[5] = numcount[5] + 1;
			}
			else if(rngnum >=61 && rngnum <= 70){
			numcount[6] = numcount[6] + 1;
			}
			else if(rngnum >=71 && rngnum <= 80){
			numcount[7] = numcount[7] + 1;
			}
			else if(rngnum >=81 && rngnum <= 90){
			numcount[8] = numcount[8] + 1;
			}
			else if(rngnum >=91 && rngnum <= 100){
			numcount[9] = numcount[9] + 1;
			}
		
		}
		//part that prints stuff dots call is in here
		//looks messy so that it prints not messy
		countlow = 1;
		counthigh = 10;
		for(int l =0; l < numcount.length; l++){
			
			System.out.println("The range " + countlow + "-" +counthigh);
			dots(numcount[l]);
			System.out.println("Times generated " + numcount[l]+"\n");
			countlow = countlow + 10;
			counthigh = counthigh + 10;
			
		}

}
//method to print a line of dots. Size dependent on int passed to it.
	public static void dots(int count){
	int dots = count;
		for (int i = 0; i < dots; i++){
		System.out.print(".");
		}
	System.out.print("\n");
	
	}
}