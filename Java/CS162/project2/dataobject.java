//dataobject stores all the values needed and provides ways to get thouse values
public class dataobject{

	//dumb because smart wasn't working
	public static int howbig= 25;
	public dataobject(int howmany){
		//howbig=howmany;
	}
		//data types
	public static String[] firstName = new String[howbig];
	public static String[] lastName = new String[howbig];
	public static int[] addressNum = new int[howbig];
	public static String[] streetName = new String[howbig];
	public static String[] streetSufix = new String[howbig];
	public static String[] city = new String[howbig];
	public static String[] state = new String[howbig];
	public static int[] zip = new int[howbig];
	public static String[] phoneNum = new String[howbig];
	public static double[] donation = new double[howbig];
	
	//--------Get/Set Methods--------
	//==================================================================
	//first name--------------------------------------------------------
	public static String getFirstName(int personNum){
		return firstName[personNum];
	}
	public static void setFirstName(String inString, int personNum){
		firstName[personNum] = inString;
	}
	//last name---------------------------------------------------------
	public static String getLastName(int personNum){
		return lastName[personNum];
	}
	public static void setLastName(String inString, int personNum){
		lastName[personNum] = inString;
	}
	//addressNum--------------------------------------------------------
	public static int getAddressNum(int personNum){
		return addressNum[personNum];
	}
	public static void setAddressNum(int inInt, int personNum){
		addressNum[personNum] = inInt;
	}
	//Streetname--------------------------------------------------------
	public static String getStreetName(int personNum){
		return streetName[personNum];
	}
	public static void setStreetName(String inString, int personNum){
		streetName[personNum] = inString;
	}
	//street sufix------------------------------------------------------
	public static String getStreetSufix(int personNum){
		return streetSufix[personNum];
	}
	public static void setStreetSufix(String inString, int personNum){
		streetSufix[personNum] = inString;
	}
	//city--------------------------------------------------------------
	public static String getCity(int personNum){
		return city[personNum];
	}
	public static void setCity(String inString, int personNum){
		city[personNum] = inString;
	}
	//state-------------------------------------------------------------
	public static String getState(int personNum){
		return state[personNum];
	}
	public static void setState(String inString, int personNum){
		state[personNum] = inString;
	}
	// zip--------------------------------------------------------------
	public static int getZip(int personNum){
		return zip[personNum];
	}
	public static void setZip(int inInt, int personNum){
		zip[personNum] = inInt;
	}
	//phone number-------------------------------------------------------
	public static String getPhoneNum(int personNum){
		return phoneNum[personNum];
	}
	public static void setPhoneNum(String inString, int personNum){
		phoneNum[personNum] = inString;
	}
	//donation-----------------------------------------------------------
	public static double getDonation(int personNum){
		return donation[personNum];
	}
	public static void setDonation(double inDouble, int personNum){
		donation[personNum] = inDouble;
	}
	//===================================================================

	//todo
	//return the entirety of an array


}