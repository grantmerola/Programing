//
//
//

import java.util.Scanner;
public class lab6{

	public static void main(String[] args){
	
	boolean isleap;
	int useryear;
	
	char flag = 'y';
	while(flag == 'y'){
	
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter a year to find out if it is a leap year. Must be greater than 1582.");
	System.out.print("Year: ");
	useryear = scan.nextInt();
	isleap = false;
	
	
	do{
	if(useryear < 1582){
	
		System.out.println("Error: Year must be greater than 1582, \"The year the Gregorian calculator was adopted\".");
		System.out.println("\nEnter a year to find out if it is a leap year. Must be greater than 1582.");
		System.out.print("Year: ");
		useryear = scan.nextInt();
	}
	}while(useryear < 1582);
	
	
	if(useryear % 4 == 0 ){
	
		if(useryear % 100 == 0){
			if(useryear % 400 == 0){
			isleap = true;
			}
		isleap = false;
		}
	isleap = true;
	}
	else{
	isleap = false;
	}
	
	
	
	if(isleap == true){
	System.out.println(useryear + " is a leap year.");
	}
	else{
	System.out.println(useryear + " is not a leap year.");
	}
	System.out.println("Enter y to continue or any thing else to exit");
	String ask = scan.next();
	flag = Character.toLowerCase(ask.charAt(0));
	}
	}

}