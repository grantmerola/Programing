import java.util.ArrayList;

public class pizzadataobject{

	// Default Values
	private int id;
	private int size = 1;
	private boolean sauce = true;
	private int cheese = 1;
	private int pineapple = 0;
	private int canadianbacon = 0;
	private int ricotta = 0;
	private int chicken = 0;

	// Special Methods
	public pizzadataobject(int inid,
						int insize, 
						boolean insauce,
						int incheese, 
						int inpineapple, 
						int incanadianbacon, 
						int inricotta, 
						int inchicken){

		setId(inid);
		setSize(insize);
		setsauce(insauce);
		setCheese(incheese);
		setPineapple(inpineapple);
		setCanadianbacon(incanadianbacon);
		setRicotta(inricotta);
		setChicken(inchicken);
	}
	// Returns array of choices  // This could be changed to read from a file
	public ArrayList<String> getWhatsOnThisPizza(){
			ArrayList<String> outArray = new ArrayList<String>();

			switch(size){
				case (1): outArray.add("Small");
				break;
				case (2): outArray.add("Medium");
				break;
				case (3): outArray.add("Large");
				break;
				default: System.out.println("bad bad bad, but this might happen"); 
			}
			if(sauce){outArray.add("Tomato");}
			else{outArray.add("BBQ");}
			if(cheese >= 2){
				for(int i  =0; i < cheese; i++)
				outArray.add("Extra Cheese");
			}
			else if(cheese == 1){
				outArray.add("Cheese");
			}
			if(pineapple >= 1){
				outArray.add("Added Pineapple");
				for(int i  =0; i < pineapple-1; i++){	
					outArray.add("Added Extra Pineapple");				
				}
			}
			if(canadianbacon >= 1){
				outArray.add("Added Canadian Bacon");
				for(int i  =0; i < canadianbacon-1; i++)
				outArray.add("Added Extra Canadian Bacon");
			}
			if(ricotta >= 1){
				outArray.add("Added Ricotta");
				for(int i  =0; i < ricotta-1; i++)
				outArray.add("Added Extra Ricotta");
			}
			if(chicken >= 1){
				outArray.add("Added Chicken");
				for(int i  =0; i < chicken-1; i++)
				outArray.add("Added Chicken");
			}
			return outArray;
	}

	// Returns the array of prices    // This could be up dated to read values from a file
	public ArrayList<Double> getHowMuch(){
			ArrayList<Double> outArray = new ArrayList<Double>();

			switch(size){
				case (1): outArray.add(5.00);
				break;
				case (2): outArray.add(7.00);
				break;
				case (3): outArray.add(12.00);
				break;
				default: System.out.println("bad bad bad, but this might happen"); 
			}
			if(sauce){outArray.add(0.00);}
			else{outArray.add(0.25);}
			if(cheese >= 2){
				for(int i  =0; i < cheese; i++)
				outArray.add(0.25);
			}
			else if(cheese == 1){
				outArray.add(0.00);
			}
			if(pineapple >= 1){
				for(int i  =0; i < pineapple; i++)
				outArray.add(0.80);
			}
			if(canadianbacon >= 1){
				for(int i  =0; i < canadianbacon; i++)
				outArray.add(0.80);
			}
			if(ricotta >= 1){
				for(int i  =0; i < ricotta; i++)
				outArray.add(0.80);
			}
			if(chicken >= 1){
				for(int i  =0; i < chicken; i++)
				outArray.add(0.80);
			}
			return outArray;	
	}
	// Returns the size of the array
	public int getArraySize(){
		return getWhatsOnThisPizza().size();
	}

	// Get
	public int getId(){return id;}
	public boolean getSauce(){return sauce;}
	public int getSize(){return size;}
	public int getCheese(){return cheese;}
	public int getPineapple(){return pineapple;}
	public int getCanadianbacon(){return canadianbacon;}
	public int getRicotta(){return ricotta;}
	public int getChicken(){return chicken;}

	// Set
	public void setId(int in){id = in;}
	public void setsauce(boolean in){sauce = in;}
	public void setSize(int in){size = in;}
	public void setCheese(int in){cheese = in;}
	public void setPineapple(int in){pineapple = in;}
	public void setCanadianbacon(int in){canadianbacon = in;}
	public void setRicotta(int in){ricotta = in;}
	public void setChicken(int in){chicken = in;}
}