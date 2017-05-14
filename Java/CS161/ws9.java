//----------------------------------
// Name: Grant Merola             Folder:Worksheet#9
//CS161
//MWF 800
//Date: 5/29/15
//Description: Worksheet#9
//----------------------------------

import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;
public class ws9{

	public static void main(String[] args){
	
	Scanner MyScan = new Scanner(System.in);
	int Number;
	System.out.println("Today we practice using arrays \n\n");
	System.out.println("How many integers do you want in your array today?");
	Number = MyScan.nextInt();
	int[] MyArray = new int[Number];
	Random rng = new Random();
	/*
		for(int i = 0; i < MyArray.length; i++){
		MyArray[i] = rng.nextInt(88) + 7;
	
		}
	
		for(int l =0; l< MyArray.length; l++){
		System.out.print(MyArray[l]+", ");
			if (l%8 == 0){
			System.out.println("\n");	
			}
		}
	
	System.out.println(MyArray.length);
	
	double[] Stuff = new double[30];
	
		for(int i = 0; i < Stuff.length; i++){
		Stuff[i] = rng.nextDouble()*100;
	
		}
	System.out.println(Arrays.toString(Stuff));
	System.out.println(Stuff[-3]);
	
	
	char[] Vowels = {'a','e','i','o','u'};
	System.out.println(Vowels.length);
	
		for(int i =0; i < Vowels.length; i++){
		 System.out.println(Vowels[i]);
		}
	
	String[] Firends = new String[10];
	
	Firends[2] = "Fred Flintstone";
	Firends[4] = "Barney Rubble";
	Firends[1] = "newname";
	Firends[6] = "newname2";
	Firends[7] = "newname3";
	
	for(int i =0; i < Firends.length; i++){
		 System.out.println(Firends[i]);
		}
	//*/	

	String[] DaysOfWeek = {"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};
	
		for(int i =0; i < DaysOfWeek.length; i++){
		 System.out.println(DaysOfWeek[i]);
		}
	
	System.out.println("\n\n done for now..");
	
	}

}