//---------------------------
// Name: Grant Merola
// Class: CS161 Spring 2015
// Class times: MWF 800
// Date Started: 4/15/15
// Date Completed: 4/15/15
// Lab#: 3
// Driver Name: main
// Program description: Creates an auto generated password using user name and random number
// Test Oracle: 
// first name	last name 	expected output 	actual output
// Cadvan 		ligron 		CligroXX			Cligro72
// Mearad		pellinor	MpelliXX			Mpelli60
// Nelac		norloch		NnorloXX			Nnorlo15
// Grant		merola		GmerolXX			Gmerol12
//---------------------------

import java.util.Scanner;
import java.util.Random;

public class lab3{

public static void main(String[] args){
	
	Scanner scan = new Scanner(System.in);
	//first name
	System.out.print("Please enter first name: ");
	String firstname = scan.next();
	//last name 
	System.out.print("Please enter last name: ");
	String lastname = scan.next();
	
	char firstnamechar1 = firstname.charAt(0);
	String lastnamesubstr = lastname.substring(0,5); 
	String passpart1 = firstnamechar1 + lastnamesubstr;
	
	Random rand = new Random();
	int passpart2 = rand.nextInt(90) + 10;
	String password = passpart1 + passpart2;
	System.out.print("Here is an auto generated password: ");
	System.out.println(password); 
	}

}