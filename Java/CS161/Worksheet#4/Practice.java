//-----------------------------
// Name: Grant Merola            Folder:Worksheet#4
// CS161 MWF800
// Date: 4/23/15
// Description:  Worksheet number 4
//-----------------------------
public class Practice{

	private int Number;
	private char Thing;
	
	public Practice(int Num, char Ans){
	
		Number = Num;
		Thing = Ans;
	
	}
	public String toString(){
		
		String Result;
		Result = "Number is: " + Number + " Thing is:" + Thing;
		return Result;
	
	}
	
	public void Story(){
	
	System.out.println(" This is a cute little method that only prints things");
	System.out.println(" First we will print the value of the integer: " + Number);
	System.out.println(" Now we print the character: " + Thing);
	System.out.println("Number and Thing are called instance variables");
	System.out.println("This is a method called \"Story\" ");
	System.out.println(" ... And now we are done :" );		
	}
	
	public long SixTimes(){
	
	long BigNum;
	BigNum = Number*Number*Number*Number*Number*Number;
	return BigNum;
	}
	
	public void setNumber(int num){
	
	Number = num;
	
	}
}