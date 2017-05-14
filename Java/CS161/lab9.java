//Name: Grant Merola
//Class: CS161 Spring 2015
//Class Times: MWF 800
//Date Started:5/29/15
//Date Completed: 5/29/15
//lab#: 9
//Driver name:N/A, this file
//program description: counts the number of times a number between 0-50 occurs in a 1000 randomly generated numbers 
//test oracle:
/*
0 | 2
1 | 1
2 | 3
3 | 3
4 | 1
5 | 1
6 | 2
7 | 4
8 | 2
9 | 4
10 | 2

//*/
//

import java.util.Arrays;
import java.util.Random;
public class lab9{

	public static void main(String[] args){
	
	Random rng = new Random();
	int[] all = new int[51];
		for(int i =1; i <= 1000; i++){
	
		int randnum =rng.nextInt(51);
			
			for (int l =0; l <= 50; l++)
				
				if (randnum == l){
				all[l] = all[l] + 1;
				}
		
		}
	//System.out.println(Arrays.toString(all));
	
		for(int i = 0; i <= 50; i++){
		System.out.println(i + " | " + all[i]);
		}
	}

}