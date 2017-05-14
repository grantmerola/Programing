//
//
//

import java.util.Scanner;
public class ws7{

   public static void main (String[] args){

	Scanner Fred = new Scanner(System.in);
	System.out.println("Today we Practice using switch statements \n\n");
	char Ans;
	char DoMore = 'Y';


	boolean x = false;
	while(DoMore== 'Y' || DoMore == 'y'){
		do{
		System.out.println("What kind of car do you drive?");
		System.out.println(" (F)ord, (C)hevy, (B)uick, (M)azda, (H)onda");
		String Word = Fred.next();
		Word=Word.toUpperCase();
		Ans = Word.charAt(0);
			switch(Ans){
	
				case 'C' : System.out.println("Chevy- the heartbeat of America");
				System.out.println("");
				break;
				case 'F' : System.out.println("Ford tough");
				System.out.println("");
				break;
				case 'B' : System.out.println("Buick- Luxury you can afford");
				System.out.println("");
				break;
				case 'M' : System.out.println("Mazda- Zoom, Zoom");
				System.out.println("");
				break;
				case 'H' : System.out.println("Honda- Always dependable");
				System.out.println("");
				break;
				case 'I' : System.out.println("Some car");
				System.out.println("");
				break;
				case 'J' : System.out.println("Really i dont know cars");
				System.out.println("");
				break;
				default: System.out.println("Get a better car...");
				x = true;
			}
		}while(x != false);
	System.out.println("Try again? (Y/N)");
	String Word = Fred.next();
	Word=Word.toUpperCase();
	DoMore = Word.charAt(0);
	}
	System.out.println("\n\n done for now..");
}
}