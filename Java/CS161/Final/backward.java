
import java.util.Arrays;
import java.util.ArrayList;
import java.lang.String;

public class backward{

	public backward(){
	
	}
	
	public static String reverse(String inString){
	
		String finString = "";
		String startString = inString;
		System.out.println(startString);
		int count = 0;
		
		char[] brokString = startString.toCharArray();
		
		char[] revchars = new char[brokString.length];
		
		//System.out.println(Arrays.toString(brokString));
		
			for(int i = brokString.length-1; i >= 0; i--){
				
				//System.out.println(i);
							
				revchars[count] = brokString[i];
				
				//System.out.println(Arrays.toString(revchars));
				count++;
					
			}
		//System.out.println(Arrays.toString(revchars));
		
			for(int i = 0;i < revchars.length; i++){
			

			finString = finString + revchars[i];

			}	
		System.out.println(finString);
		
		return finString; 	
	
	}	
		
	
	
	
	
}