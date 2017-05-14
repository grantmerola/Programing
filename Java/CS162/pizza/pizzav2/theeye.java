//model
//this is where every thing is controlled from, confusingly it is the model ¯\_(ツ)_/¯
import java.util.ArrayList;
import java.util.Arrays;

import javax.swing.JLabel;
import javax.swing.DefaultListModel;

public class theeye{

	public theeye(){
	}
	public totaltrackerobject total;
	private boolean debug = false;
	public theeye(boolean inbol){
		debug = inbol;
		total = new totaltrackerobject(debug);
		if(debug)
			System.out.println("theeye: inbol " + inbol);
	}
	//public totaltrackerobject total = new totaltrackerobject(debug);

	// Sidebar Stuff
	// Gets the item list
	public String[] getItemList(){
				
		String[] array = total.getItemList();
		if(debug)
			System.out.println("theeye: getItemList eye "+ Arrays.toString(array));
		return array;
	}
	public void clearBtn(){

			total.clearAll();
	}
	// Remove an item at index
	public void removeItem(int index){

		total.removeItem(index);
	}

	//pizza stuff
	private int id=0;

	public ArrayList<String> itemNameArray = new ArrayList<String>();
	public ArrayList<Double> itemCostArray = new ArrayList<Double>();
	// Add pizza to total object
	public void addPizza(){

		pizzadataobject tempPizza = new pizzadataobject(id,tempSize,tempSauce,tempCheese,tempPineapple,tempCanadianbacon,tempRicotta,tempChicken); 
		id++;
		tempSize = 1;
		tempSauce = true;
		tempCheese = 1;
		tempPineapple = 0;
		tempCanadianbacon = 0;
		tempRicotta = 0;
		tempChicken	= 0;

	
		for(String i : tempPizza.getWhatsOnThisPizza()){
			itemNameArray.add(i);
		}
		for(Double i: tempPizza.getHowMuch()){
			itemCostArray.add(i);
		}
		total.addArrayToItemNameArray(itemNameArray);
		total.addArrayToItemCostArray(itemCostArray);
		if(debug){
			System.out.println("theeye: itemNameArray "+Arrays.toString(itemNameArray.toArray()));
			System.out.println("theeye: itemCostArray "+Arrays.toString(itemCostArray.toArray()));
			System.out.println("theeye: call to total getSize "+ total.getSize());
			System.out.println("theeye: call to total getItemList "+Arrays.toString(total.getItemList()));
			System.out.println(" theeye:total toString "+total.toString());
		}
		itemNameArray.clear();
		itemCostArray.clear();	
	}

	private int tempSize =1;
	private boolean tempSauce = true;
	private int tempCheese =1;
	private int tempPineapple;
	private int tempCanadianbacon;
	private int tempRicotta;
	private int tempChicken;
	// Set
	public void setSize(int in){
		tempSize = in;
		if(debug)
			System.out.println("theeye: tempSize is: "+ tempSize);
	}
	public void setSauce(boolean in){
		tempSauce = in;
		if(debug)
			System.out.println("theeye: tempSauce is: "+ tempSauce);
	}
	public void setCheese(int in){
		tempCheese = tempCheese + in;
		if(debug)
			System.out.println("theeye: tempCheese is: "+ tempCheese);
	}
	public void setPineapple(int in){
		tempPineapple = tempPineapple + in;
		if(debug)
			System.out.println("theeye: tempPineapple is: "+ tempPineapple);
	}
	public void setCanadianbacon(int in){
		tempCanadianbacon = tempCanadianbacon + in;
		if(debug)
			System.out.println("theeye: tempCanadianbacon is: "+ tempCanadianbacon);
	}
	public void setRicotta(int in){
		tempRicotta = tempRicotta + in;
		if(debug)
			System.out.println("theeye: tempRicotta is: "+ tempRicotta);
	}
	public void setChicken(int in){
		tempChicken = tempChicken + in;
		if(debug)
			System.out.println("theeye: tempChicken is: "+ tempChicken);
	}
	// Get
	public int getId(){return id;}
	public int getSizeState(){return tempSize;}
	public boolean getSauceState(){return tempSauce;}
	public int getCheeseCount(){return tempCheese;}
	public int getPineappleCount(){return tempPineapple;}
	public int getCanadianbaconCount(){return tempCanadianbacon;}
	public int getRicottaCount(){return tempRicotta;}
	public int getChickenCount(){return tempChicken;}
	// Clear pizz
	public void clearPizza(){
		tempSize = 1;
		tempSauce = true;
		tempCheese = 1;
		tempPineapple = 0;
		tempCanadianbacon = 0;
		tempRicotta = 0;
		tempChicken	= 0;	
		if(debug)
			System.out.println("theeye: temppizza was cleared");
	}
	// Get Size of total object
	public int getSize(){
		int num = total.getSize();
		System.out.println("theeye: getsizenum"+num);
		return num;
	}
	// Visualy update list
	public void updateJList(theeye ineye){

		DefaultListModel listModel = pizzaSidebar.getListModel();
		theeye seesall = ineye;

		int num = seesall.getSize();
		listModel.clear();
		if(debug)
			System.out.println("theeye: num in updatejlists "+num);
		for(int i=0; i < num; i++){
			
			String tempstring = seesall.total.getItemList()[i];
			if(debug)
				System.out.println(tempstring);
			listModel.addElement(tempstring);
		}
		JLabel totallabel = pizzaSidebar.getTotalLabel();

		totallabel.setText("Total: "+seesall.getTotal());
		if(debug){
			if(listModel.isEmpty()){
				System.out.println("theeye: empty");
			}
			else{
				System.out.println("theeye: not empty");
			}
		}
	}
	// Add drink
	public void addRootBeer(){

		total.addAnItemToItemNameArray("Root Beer");
		total.addAnItemToItemCostArray(1.00);
		if(debug)
			System.out.println("theeye: Root Beer was added");
	}
	public void addOrangeSoda(){

		total.addAnItemToItemNameArray("Orange Soda");
		total.addAnItemToItemCostArray(1.00);
		if(debug)
			System.out.println("theeye: Orange Soda was added");
	}
	public void addJuice(){

		total.addAnItemToItemNameArray("Juice");
		total.addAnItemToItemCostArray(1.00);
		if(debug)
			System.out.println("theeye: Juice was added");
	}
	public void addBirchBeer(){

		total.addAnItemToItemNameArray("Birch Beer");
		total.addAnItemToItemCostArray(1.00);
		if(debug)
			System.out.println("theeye: Birch Beer was added");
	}
	// Add specilty item
	public void addBreadsticks(){

		total.addAnItemToItemNameArray("Bread Sticks");
		total.addAnItemToItemCostArray(1.00);
		if(debug)
			System.out.println("theeye: Bread Sticks was added");
	}
	public void addCalzone(){

		total.addAnItemToItemNameArray("Calzone");
		total.addAnItemToItemCostArray(2.00);
		if(debug)
			System.out.println("theeye: Calzone was added");
	}
	public void addFries(){

		total.addAnItemToItemNameArray("Fries");
		total.addAnItemToItemCostArray(1.00);
		if(debug)
			System.out.println("theeye: Fries was added");
	}
	public void addPie(){

		total.addAnItemToItemNameArray("Pie");
		total.addAnItemToItemCostArray(1.00);
		if(debug)
			System.out.println("theeye: Pie was added");
	}
	// Get total
	public String getTotal(){
		return Double.toString(total.getTotal());
	}
}