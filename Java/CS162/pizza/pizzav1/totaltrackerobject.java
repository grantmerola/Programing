import java.util.ArrayList;
import java.util.Arrays;

//total tracker data object
public class totaltrackerobject{

	public totaltrackerobject(){

	}
	private  ArrayList<String> itemname = new ArrayList<String>();
	private  ArrayList<Double> itemcost = new ArrayList<Double>();
	private  double total = 0.00;


	//specilty methods
	//clear both of our arraylists
	public  void clearall(){
		itemname.clear();
		itemcost.clear();
		total = 0.00;

	}
	//gets size checks if arrays are same size they should be or else very bad things throws -1 if error but catching that is not currently done 
	//should not currently be a problem because we controll in's and outs no user to mess with things (assuming you dont use the built in get/set methods)
	public  int getsize(){
		int num1 = itemname.size();
		int num2 = itemcost.size();
		if(num1 == num2){
			//System.out.println("retuned getsize"+num1);
			return num1;

		}
		else{
			//here for finding in exceptions not for catching (to lazy to implment full catching of errors?~~we will find out)
			return -1;
		}
	}
	//to String
	public String toString(){
			String outstring ="[ ";
			for(int i =0; i < getsize(); i++){
				outstring = outstring + getitemlist()[i] + ", ";
			}
			outstring = outstring + " ]";
			return outstring;
	} 
	// we will make some things pretty in the (eye)not any more moved to become native method and let the default java cover the rest( i.e. cross your fingers and toes and hope for the best)
	public  String[] getitemlist(){

		String[] outstringarray = new String[getsize()];
		for(int i=0; i< getsize(); i++){
			
			String outstring = "";
			outstring = outstring + getitemname(i);
			outstring = outstring + "\t\t......." +Double.toString(getitemcost(i));
			outstringarray[i] = outstring;
		}
		//System.out.println("total outstringarray"+Arrays.toString(outstringarray));
		return outstringarray;
	}

	//get 
	public  ArrayList<String> getitemnamefullarray(){return itemname;}
	public  String getitemname(int index){return itemname.get(index);}

	public  ArrayList<Double> getitemcostfullarray(){return itemcost;}
	public  Double getitemcost(int index){return itemcost.get(index);}
	
	//set
	//these should not be used use full implmentaion instead
	public  void setitemname(int index, String setto){ itemname.set(index, setto);}
	public  void setitemcost(int index, double setto){ itemcost.set(index, setto);}

	//add 
	// full implmenation (~~someday)
	//today~~mabey

	public  void addarraytoitemnamearray(ArrayList<String> in){
		for(String i: in){
			itemname.add(i);
		}	
	}
	
	public  void addarraytoitemcostarray(ArrayList<Double> in){
		for(Double i: in){
			itemcost.add(i);
		}	
	}
	
	public  void addanitemtoitemnamearray(String in){
		
		itemname.add(in);
	}
	
	public  void addanitemtoitemcostarray(Double in){
		
		itemcost.add(in);
	}

	//remove
	public void removeitem(int index){
		itemname.remove(index);
		itemcost.remove(index);
	}

	public Double gettotal(){
		Double total =0.0;
		for(Double i : itemcost){
			total += i;
		}
		return total;
	}

}