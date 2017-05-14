//--------------------------
// Name: Grant Merola 		Folder:Worksheet#3
// CS 161
// MWF 800
// 4/15/15
// Worksheet#3
//--------------------------

import java.util.Scanner;
import java.util.Random;
public class ws3{

	public static void main(String[] args){
	
		Scanner Fred = new Scanner(System.in);
		String Name1;
		//System.out.print("Please enter your name: ");
		//Name1 = Fred.nextLine();
		//System.out.println("\n\nYou entered: " + Name1);
		
		//System.out.println("the length of your name is: " + Name1.length());
		//System.out.println("the first character is: " + Name1.charAt(0));
		
		Name1 = "Kevin";
		String Name2 = "Martha Stewart";
		System.out.println("comparing them:" + Name2.compareTo(Name1));
		
		String message = "Once upon a time there were three little pigs and a wolf.";
		String piece1 = message.substring(28,46);
		System.out.println("piece1 is " + piece1);
		String CapMessage = message.toUpperCase();
		System.out.println(CapMessage);
		
		Random gen = new Random();
		float floatrand = gen.nextFloat();
		System.out.println(floatrand);
		
		int intrand = gen.nextInt();
		System.out.println(intrand);
		
		int int100 = gen.nextInt(99) + 1;
		System.out.println(int100);
		
		int int75_190 = gen.nextInt(116) + 75;
		System.out.println(int75_190);
		
		System.out.println(Math.abs(-19));
		
		System.out.println(Math.sqrt(97));
		
		System.out.println(Math.sqrt(-97));
		
		System.out.println(Math.pow(2,5));
		
		System.out.println(Math.sqrt(16));
		
		System.out.println("Square root of 16: " + Math.pow(16,0.5));
		
		System.out.println(Math.pow(81,0.25));
		
		System.out.println(Math.random());
	
		System.out.println("\n\n\n");
	}	
}