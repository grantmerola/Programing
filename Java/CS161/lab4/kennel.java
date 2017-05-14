// --------------------------------
// Name: Grant Merola
// Class: CS161 Spring 2015
// Class times: MWF 800
// Date Started: 4/22/25
// Date Completed
// Lab #4
// Driver Name: kennel.java
// Program Description: creates and names a couple of dog albums
// Test Oracle: 34 in dog years is 238
//25 is 175
//12 is 84
//7 is 49
//---------------------------------


public class kennel{

	public static void main(String[] args){
	
	Dog dog1, dog2, dog3, dog4;
	
	//Dog1
	dog1 = new Dog();
	dog1.setDogAgeName("Sam", 34);
	System.out.println(dog1.toString());
	System.out.println("Dogs name is: " + dog1.getDogName() + ",");
	System.out.println(dog1.getDogName() + "s" + " age in people years is: " + dog1.peopleYears() + ".\n");
	
	//Dog2
	dog2 = new Dog();
	dog2.setDogAgeName("Joe",25);
	System.out.println("Dogs name is: " + dog2.getDogName() + ",");
	System.out.println(dog2.toString());
	System.out.println(dog2.getDogName() + "s" + " age in people years is: " + dog2.peopleYears() + ".\n");
	
	//Dog3
	dog3 = new Dog();
	dog3.setDogAgeName("Marice",12);
	System.out.println("Dogs name is: " + dog3.getDogName() + ",");
	System.out.println(dog3.toString());
	System.out.println(dog3.getDogName() + "s" + " age in people years is: " + dog3.peopleYears() + ".\n");
	
	//Dog4
	dog4 = new Dog();
	dog4.setDogAgeName("John",7);
	System.out.println("Dogs name is: " + dog4.getDogName() + ",");
	System.out.println(dog4.toString());
	System.out.println(dog4.getDogName() + "s" + " age in people years is: " + dog4.peopleYears() + ".\n");
	//*/
	}
	
}