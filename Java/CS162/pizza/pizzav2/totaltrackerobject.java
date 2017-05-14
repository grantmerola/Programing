import java.util.ArrayList;
import java.util.Arrays;

//total tracker data object
public class totaltrackerobject{

	private boolean debug;
	public totaltrackerobject(boolean inbol){
		debug = inbol;
		if(debug)
			System.out.println("totaltrackerobject: inbol " + inbol);
	}

	public totaltrackerobject(){}

	// Data stored in this object
	private  ArrayList<String> itemName = new ArrayList<String>();
	private  ArrayList<Double> itemCost = new ArrayList<Double>();
	private  double total = 0.00;

	//specilty methods
	// Clear both of our arrays
	public  void clearAll(){
		itemName.clear();
		itemCost.clear();
		total = 0.00;
	}
	// Gets the size of the array and does check if they are the same size, They should be. Otherwise throws -1.
	public  int getSize(){
		int num1 = itemName.size();
		int num2 = itemCost.size();
		if(num1 == num2){
			if(debug)
				System.out.println("totaltrackerobject: retuned getsize "+num1);
			return num1;
		}
		else{
			return -1;
		}
	}
	//to String
	public String toString(){
			String outString ="[ ";
			for(int i =0; i < getSize(); i++){
				outString = outString + getItemList()[i] + ", ";
			}
			outString = outString + " ]";
			return outString;
	} 
	// Returns a String array that is all ready formated nicely 
	public  String[] getItemList(){

		String[] outStringArray = new String[getSize()];
		for(int i=0; i< getSize(); i++){
			
			String outString = "";
			outString = outString + getItemName(i);
			outString = outString + "\t\t......." +Double.toString(getItemCost(i));
			outStringArray[i] = outString;
		}
		if(debug)
			System.out.println("totaltrackerobject: total outstringarray "+Arrays.toString(outStringArray));
		return outStringArray;
	}

	//get 
	public  ArrayList<String> getItemNameFullArray(){return itemName;}
	public  String getItemName(int index){return itemName.get(index);}

	public  ArrayList<Double> getItemCostFullArray(){return itemCost;}
	public  Double getItemCost(int index){return itemCost.get(index);}
	
	// Set
	// These should not be used, The prefred way is to use add and remove
	public  void setItemName(int index, String setto){ itemName.set(index, setto);}
	public  void setItemCost(int index, double setto){ itemCost.set(index, setto);}

	// Add 
	// Add an Array
	public  void addArrayToItemNameArray(ArrayList<String> in){
		for(String i: in){
			itemName.add(i);
		}	
	}	
	public  void addArrayToItemCostArray(ArrayList<Double> in){
		for(Double i: in){
			itemCost.add(i);
		}	
	}
	// Add a singuar item
	public  void addAnItemToItemNameArray(String in){
		
		itemName.add(in);
	}
	public  void addAnItemToItemCostArray(Double in){
		
		itemCost.add(in);
	}

	// Remove item and price
	public void removeItem(int index){
		String itemStr = itemName.get(index);
		
		if(debug)
			System.out.println("totaltrackerobject: itemstr1 " + itemStr);
		
		if(itemName.size() > 0){
			if(itemStr.equals("Small") || itemStr.equals("Medium") || itemStr.equals("Large") && (index != itemName.size())  ){
				
				for(int i =index+1; i < itemName.size(); i++){
					String itemStrTwo = itemName.get(i);
					
					if(debug)
						System.out.println("totaltrackerobject: itemstrtwo " + itemStrTwo);
					
					int lastSizeIndex =0;			
					for(int m=0; m < itemName.size(); m++){
						if(itemName.get(m).equals("Small") || itemName.get(m).equals("Medium") || itemName.get(m).equals("Large")){
							lastSizeIndex = m;
						}		
					}
				
					if( ( itemStrTwo.equals("Small") || itemStrTwo.equals("Medium") || itemStrTwo.equals("Large") ) && (index != lastSizeIndex)){
						itemName.subList(index, i).clear();
						itemCost.subList(index, i).clear();
						if(debug)
							System.out.println("totaltrackerobject: removed a pizza");
					}
					else if(index == lastSizeIndex){
						itemName.subList(index, (itemName.size()) ).clear();
						itemCost.subList(index, (itemCost.size()) ).clear();
						if(debug)
							System.out.println("totaltrackerobject: removed a pizza 2");
					}
				}
			}
			else{
				itemName.remove(index);
				itemCost.remove(index);
			}
		}
	}
	// Calculate total
	public Double getTotal(){
		Double total =0.0;
		for(Double i : itemCost){
			total += i;
		}
		return total;
	}
}