//
//
//
public class Dog {

	String name;
	int age;
	
	public Dog(){
	
	age = 0;
	name = null;
	
	}
	
	public void setDogAgeName(String dogname, int dogage){
	
		name = dogname;
		age = dogage;
	
	}
	public String getDogName(){
	
		return name;
	
	}
	
	public int getDogAge(){
	
		return age;
		
	}

	
	public int peopleYears(){
	
		return age * 7;
	
	}
	
	public String toString(){
	
	String tostring = getDogName() + "s" + " age is: " + getDogAge() + ".";
	return tostring;
	}

}