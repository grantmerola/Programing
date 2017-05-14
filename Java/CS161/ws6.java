//-------------------
// Name: Grant Merola         folder: worksheet#6
// CS161
// MWF 800
// Date: 5/5/15
// Description: worksheet#6
//-------------------

import java.util.Scanner;

public class ws6{

	public static void main(String[] args){
	
	Scanner Fred = new Scanner(System.in);
	System.out.println("Today we practice writing loops ");
	System.out.println("Here is the first loop: \n");
	//int count = 1;
		//while (count < 10){
			//System.out.println("Hello - my name is Jack... ");
			//count = count + 1;
		//}
	//int Stuff = 5;
	//System.out.println("how many times do you want to repeat this?");
	//Stuff = Fred.nextInt();
	//while(Stuff > 0){
	
		//System.out.println("Here comes Peter Cottontail, hopping down the bunny trail");
		//Stuff = Stuff + 1;
		//} 
	
	//int Number;
	//int Total = 0;
	//while(Total < 500){
	
		//System.out.println("Enter number of tickets sold: ");
		//Number = Fred.nextInt();
		//Total = Total + Number;
	//}	
	//System.out.println("Total is: " + Total);
	
	//int asterisks = 50;
	//while(asterisks > 0){
	
	//System.out.print("@");
	//asterisks = asterisks - 1;
	//}
	char Again = 'Y';
	while(Again != 'N'){
		long product = 1;
		int count = 0;
		System.out.println("This program will generate a table of powers of a number.");
		System.out.println("You just have to tell me what number: \n\n");
		System.out.println("Enter an integer please: ");
		int MyNum = Fred.nextInt();
		while(count <5){
			count++;
			product = product * MyNum;
			System.out.print(product);
			System.out.print(" Bye for now.... , ");
		}
		System.out.print("\n\n\n Try another number (y/n)? ");
		String word = Fred.next();
		Again = Character.toUpperCase(word.charAt(0));
	}
	
	
	
	}

}