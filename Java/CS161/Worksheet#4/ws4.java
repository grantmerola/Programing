//-----------------------------
// Name: Grant Merola            Folder:Worksheet#4
// CS161 MWF800
// Date: 4/23/15
// Description:  Worksheet number 4
//-----------------------------

import java.util.Scanner;

public class ws4{

	public static void main(String[] args){
	
		Scanner Fred = new Scanner(System.in);
		String Name;
		System.out.println("Today we practice writing methods ");
		
		Practice object1 = new Practice(6,'$');
		System.out.println("Object 1 is: ");
		System.out.println(object1);
		//object1.Story();
		Practice myObject = new Practice(34, '#');
		//myObject.Story();		
		long MyNum = object1.SixTimes();
		System.out.println("MyNum is: " + MyNum);
		System.out.println(myObject.SixTimes());
		
		System.out.print("Please enter number:");
		int firstnum = Fred.nextInt();
		System.out.print(firstnum);
		System.out.print("\nPlease enter number:");
		int secondnum = Fred.nextInt();
		System.out.print(secondnum + "\n");
		object1.setNumber(firstnum);
		myObject.setNumber(secondnum);
		System.out.println(object1);
		System.out.println(myObject);
		Practice object3, object4;
		object3 = new Practice(72,'T');
		object4 = new Practice(68,'i');
		System.out.println(object3);
		System.out.println(object4);
		System.out.println("\n\n\n");
	
	}

}
