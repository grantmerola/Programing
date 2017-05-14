//-----------------------
// Name: Grant Merola        Folder:Worksheet#5
// CS161
// MWF 800
// Date: 5/2/15
// Worksheet #5
//------------------------
import java.util.Scanner;
import java.util.Random;
import java.awt.Color;

public class ws5{

	public static void main(String[] args){
	
	practice5 prac = new practice5();
	Scanner Fred = new Scanner(System.in);
	System.out.println("Today we practice writing methods again ");
	System.out.println("Here is the first method: \n");
	prac.Lyrics();
	System.out.println("Here it is again:\n");
	prac.Lyrics();
	System.out.println("2 to the fourth power is: " + prac.FourPower(2));
	System.out.println(prac.FourPower(6));
	System.out.println(prac.Random100());
	System.out.println(prac.RandomInRange(2,19));
	System.out.println(prac.RandomInRange(50,95));
	int First, Second;
	System.out.println("please enter an integer: ");
	First = Fred.nextInt();
	System.out.println("please enter another integer: ");
	Second = Fred.nextInt();
	System.out.println(prac.RandomInRange(First, Second));
	prac.RandomColor();
	System.out.println("\n\n\n");
	}
	

}