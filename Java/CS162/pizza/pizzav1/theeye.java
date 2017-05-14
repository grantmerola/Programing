//model
//this is where every thing is controlled from, confusingly it is the model ¯\_(ツ)_/¯
import java.util.ArrayList;
import javax.swing.JLabel;
import java.util.Arrays;
import javax.swing.DefaultListModel;
public class theeye{

	public totaltrackerobject total = new totaltrackerobject();
	//public totaltrackerobject total;
	public theeye( /*totaltrackerobject intotal*/ ){
		//total = intotal;
		//total = new totaltrackerobject();
		//totaltrackerobject total = new totaltrackerobject();		
	}


	//sidebar stuff
	//only instainate nessesary new objects 
	//avoid recurson i.e. try to avoid instgateing theeye in this file
	//public totaltrackerobject total = new totaltrackerobject();

	public String[] getitemlist(){
		
		
		String[] array = total.getitemlist();

		System.out.println("getitemlist eye"+ Arrays.toString(array));
		return array;
	}

	public void clearbtn(){

			total.clearall();
	}
	public void removeitem(int index){

		total.removeitem(index);
	}

	//pizza stuff


	//This implmenation is horifing to me and i wrote it but i think it works and it respects VMC bondrys, so well yaa know
	private int id=0;
	//private ArrayList<pizzadataobject> pizzaarray = new ArrayList<pizzadataobject>();
	public ArrayList<String> itemnamearray = new ArrayList<String>();
	public ArrayList<Double> itemcostarray = new ArrayList<Double>();

	public void addpizza(){
		//pizzaarray.add(new pizzadataobject(id,tempsize,tempsauce,tempcheese,temppineapple,tempcanadianbacon,tempricotta,tempchicken));
		pizzadataobject temppizza = new pizzadataobject(id,tempsize,tempsauce,tempcheese,temppineapple,tempcanadianbacon,tempricotta,tempchicken); 
		id++;
		tempsize = 1;
		tempsauce = true;
		tempcheese = 1;
		temppineapple = 0;
		tempcanadianbacon = 0;
		tempricotta = 0;
		tempchicken	= 0;

	
		for(String i : temppizza.getwhatsonthispizza()){
			itemnamearray.add(i);
		}
		for(Double i: temppizza.gethowmuch()){
			itemcostarray.add(i);
		}
		total.addarraytoitemnamearray(itemnamearray);
		total.addarraytoitemcostarray(itemcostarray);
		//System.out.println("itemnamearray"+Arrays.toString(itemnamearray.toArray()));
		//System.out.println("itemcostarray"+Arrays.toString(itemcostarray.toArray()));
		//System.out.println("call to total getsize"+ total.getsize());
		//System.out.println("call to total getitemlist "+Arrays.toString(total.getitemlist()));

		System.out.println("total toString"+total.toString());	
	}

		private int tempsize =1;
		private boolean tempsauce = true;
		private int tempcheese =1;
		private int temppineapple;
		private int tempcanadianbacon;
		private int tempricotta;
		private int tempchicken;
		//set
		public void setsize(int in){
			tempsize = in;
			System.out.println("tempsize is: "+ tempsize);
		}
		public void setsauce(boolean in){
			tempsauce = in;
			System.out.println("tempsauce is: "+ tempsauce);
		}
		public void setcheese(int in){
			tempcheese = tempcheese + in;
			System.out.println("tempcheese is: "+ tempcheese);
		}
		public void setpineapple(int in){
			temppineapple = temppineapple + in;
			System.out.println("temppineapple is: "+ temppineapple);
		}
		public void setcanadianbacon(int in){
			tempcanadianbacon = tempcanadianbacon + in;
			System.out.println("tempcanadianbacon is: "+ tempcanadianbacon);
		}
		public void setricotta(int in){
			tempricotta = tempricotta + in;
			System.out.println("tempricotta is: "+ tempricotta);
		}
		public void setchicken(int in){
			tempchicken = tempchicken + in;
			System.out.println("tempchicken is: "+ tempchicken);
		}

		public int getid(){return id;}
		public int getsizestate(){return tempsize;}
		public boolean getsaucestate(){return tempsauce;}
		public int getcheesecount(){return tempcheese;}
		public int getpineapplecount(){return temppineapple;}
		public int getcanadianbaconcount(){return tempcanadianbacon;}
		public int getricottacount(){return tempricotta;}
		public int getchickencount(){return tempchicken;}
	
	//public ArrayList<pizzadataobject> getpizzaarray(){return pizzaarray;}
	
	//for(pizzadataobject i : pizzaarray){
		//whatsonthispizza = i.getwhatsonthispizza();
		//howmuchisthispizza = i.gethowmuch();
	//}
	


	public void clearpizza(){
		tempsize = 1;
		tempsauce = true;
		tempcheese = 1;
		temppineapple = 0;
		tempcanadianbacon = 0;
		tempricotta = 0;
		tempchicken	= 0;	
	}


	public int getsize(){
		int num = total.getsize();
		System.out.println("getsizenum"+num);
		return num;
	}
	public String toString(){
		
		return "the toString";
	}
	public void updatejlist(theeye ineye){
		/*//listmodel.removeAllElements();
		for(int i=0; i< seesall.getlistinfo().length ;i++){

			listmodel.add(i,seesall.getlistinfo()[i]);
		}*/
			DefaultListModel listmodel = pizzaSidebar.getlistmodel();
			theeye seesall = ineye;

			int num = seesall.getsize();
			listmodel.clear();
			//System.out.println("num in updatejlists"+num);
			//does run ~not run
			for(int i=0; i < num; i++){
				
				String tempstring = seesall.total.getitemlist()[i];
	
				//System.out.println(tempstring);
				listmodel.addElement(tempstring);
			}
			JLabel totallabel = pizzaSidebar.gettotallabel();

			totallabel.setText("Total: "+seesall.gettotal());
			/*
			if(listmodel.isEmpty()){
				System.out.println("empty");
			}
			else{
				System.out.println("not empty");
			}
			//*/
	}
	public void addrootbeer(){

		total.addanitemtoitemnamearray("Root Beer");
		total.addanitemtoitemcostarray(1.00);
	}
	public void addorangesoda(){

		total.addanitemtoitemnamearray("Orange Soda");
		total.addanitemtoitemcostarray(1.00);
	}
	public void addjuice(){

		total.addanitemtoitemnamearray("Juice");
		total.addanitemtoitemcostarray(1.00);
	}
	public void addbirchbeer(){

		total.addanitemtoitemnamearray("Birch Beer");
		total.addanitemtoitemcostarray(1.00);
	}
	public void addbreadsticks(){

		total.addanitemtoitemnamearray("Bread Sticks");
		total.addanitemtoitemcostarray(1.00);
	}
	public void addcalzone(){

		total.addanitemtoitemnamearray("Calzone");
		total.addanitemtoitemcostarray(2.00);
	}
	public void addfries(){

		total.addanitemtoitemnamearray("Fries");
		total.addanitemtoitemcostarray(1.00);
	}
	public void addpie(){

		total.addanitemtoitemnamearray("Pie");
		total.addanitemtoitemcostarray(1.00);
	}
	public String gettotal(){
		return Double.toString(total.gettotal());
	}

}