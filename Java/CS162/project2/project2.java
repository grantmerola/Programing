import java.io.FileReader;
import java.io.*;
import java.io.BufferedReader;
import java.util.ArrayList;
import java.util.Arrays;

public class project2{

	public static int linecount;
	// TURN THIS FLAG TO SEE CHECKS
	public static boolean debug = false;

	public static dataobject INFO = new dataobject(linecount);

	public static void main(String[] args)throws IOException{
		//method calls
		parser(fromfile("proj2.csv"));
		
		double donationSum = 0.0;
		//geting stuff and printing
		for(int i=0; i<linecount;i++){
		System.out.println(INFO.getLastName(i)+","+ INFO.getFirstName(i)+"   Phone Number: "+INFO.getPhoneNum(i)+"   Address: "+INFO.getAddressNum(i)+" "+INFO.getStreetName(i)+" "+INFO.getStreetSufix(i)+"    City: "+INFO.getCity(i)+"    State: "+INFO.getState(i)+"    Zip: "+INFO.getZip(i)+"    Donation Amount: "+INFO.getDonation(i)+"\n\n");
		donationSum = donationSum + INFO.getDonation(i);
		//System.out.println(bucketOstrings.get(i));༼ つ ◕_◕ ༽つ
		}
		System.out.println("\n\nTotal Donation Amount: "+ donationSum);

	}
	//take file name and outputs first string of file
	public static ArrayList<String> fromfile(String file)throws IOException{
		
		FileReader reader = new FileReader(file);
		BufferedReader read = new BufferedReader(reader);

		ArrayList<String> strings = new ArrayList<String>();

		//can read?
		if(read.ready()){
			int i = 0;
			do{
			//read and store in out going array 
			strings.add(read.readLine());
			i++;
			}while(read.ready()!=false);
			//while i can read do so
			//the number of lines read i.e. the size of the array
			linecount = i;
		}
		else{
			//throw error
			//replace with try catch?
		}
			//debug prints eachline
			if(debug == true){
			System.out.println(linecount);
				for(int i=0; i<strings.size();i++){
				System.out.println(strings.get(i));
				}
			}
		return strings;

	
	}

	//parsses csv string for meaning
	// three optinns char arrays, String's methods, reg epressions

	public static void parser(ArrayList<String> bucketOstrings){

		for (int i =0;i<bucketOstrings.size();i++) {
			//get me the first string in the array i.e. line 1
			String tempString = bucketOstrings.get(i);

			//serches for , and spilts in to an array good lord regex is amazing ~(˘▾˘~)(~˘▾˘)~
			String[] tempArray= tempString.split("[,]");
				//debug prints temp array
					if(debug ==true){
					System.out.println(Arrays.toString(tempArray) +"\n\n");
					}
			
				//set all the info for the object
			
				INFO.setFirstName(tempArray[0],i);
				INFO.setLastName(tempArray[1],i);
				INFO.setAddressNum(Integer.parseInt(tempArray[2]),i);
				INFO.setStreetName(tempArray[3],i);
				INFO.setStreetSufix(tempArray[4],i);
				INFO.setCity(tempArray[5],i);
				INFO.setState(tempArray[6],i);
				INFO.setZip(Integer.parseInt(tempArray[7]),i);
				INFO.setPhoneNum(tempArray[8],i);
				INFO.setDonation(Double.parseDouble(tempArray[9]),i);

			

		}
	}
}

//worth noteing this file structure and csv parser could be repourposed quite easyly for future file i/o uses

