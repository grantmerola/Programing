import java.util.ArrayList;

public class pizzadataobject{

	private int id;
	private int size = 1;
	private boolean sauce = true;
	private int cheese = 1;
	private int pineapple = 0;
	private int canadianbacon = 0;
	private int ricotta = 0;
	private int chicken = 0;

	//specile methods
	public pizzadataobject(int inid,
						int insize, 
						boolean insauce,
						int incheese, 
						int inpineapple, 
						int incanadianbacon, 
						int inricotta, 
						int inchicken){

		setid(inid);
		setsize(insize);
		setsauce(insauce);
		setcheese(incheese);
		setpineapple(inpineapple);
		setcanadianbacon(incanadianbacon);
		setricotta(inricotta);
		setchicken(inchicken);
	}

	public ArrayList<String> getwhatsonthispizza(){
			ArrayList<String> outarray = new ArrayList<String>();

			switch(size){
				case (1): outarray.add("Small");
				break;
				case (2): outarray.add("Medium");
				break;
				case (3): outarray.add("Large");
				break;
				default: System.out.println("bad bad bad, but this might happen"); 
			}
			if(sauce){outarray.add("Tomato");}
			else{outarray.add("BBQ");}
			if(cheese >= 2){
				for(int i  =0; i < cheese; i++)
				outarray.add("Extra Cheese");
			}
			if(pineapple >= 1){
				for(int i  =0; i < pineapple; i++)
				outarray.add("Added Pineapple");
			}
			if(canadianbacon >= 1){
				for(int i  =0; i < canadianbacon; i++)
				outarray.add("Added Canadian Bacon");
			}
			if(ricotta >= 1){
				for(int i  =0; i < ricotta; i++)
				outarray.add("Added Ricotta");
			}
			if(chicken >= 1){
				for(int i  =0; i < chicken; i++)
				outarray.add("Added Chicken");
			}
			return outarray;
	}

	public ArrayList<Double> gethowmuch(){
			ArrayList<Double> outarray = new ArrayList<Double>();

			switch(size){
				case (1): outarray.add(5.00);
				break;
				case (2): outarray.add(7.00);
				break;
				case (3): outarray.add(12.00);
				break;
				default: System.out.println("bad bad bad, but this might happen"); 
			}
			if(sauce){outarray.add(0.00);}
			else{outarray.add(0.25);}
			if(cheese >= 2){
				for(int i  =0; i < cheese; i++)
				outarray.add(0.25);
			}
			if(pineapple >= 1){
				for(int i  =0; i < pineapple; i++)
				outarray.add(0.80);
			}
			if(canadianbacon >= 1){
				for(int i  =0; i < canadianbacon; i++)
				outarray.add(0.80);
			}
			if(ricotta >= 1){
				for(int i  =0; i < ricotta; i++)
				outarray.add(0.80);
			}
			if(chicken >= 1){
				for(int i  =0; i < chicken; i++)
				outarray.add(0.80);
			}
			return outarray;	
	}
	public int getarraysize(){
		return getwhatsonthispizza().size();
	}

	//get
	public int getid(){return id;}
	public boolean getsauce(){return sauce;}
	public int getsize(){return size;}
	public int getcheese(){return cheese;}
	public int getpineapple(){return pineapple;}
	public int getcanadianbacon(){return canadianbacon;}
	public int getricotta(){return ricotta;}
	public int getchicken(){return chicken;}

	//set
	public void setid(int in){id = in;}
	public void setsauce(boolean in){sauce = in;}
	public void setsize(int in){size = in;}
	public void setcheese(int in){cheese = in;}
	public void setpineapple(int in){pineapple = in;}
	public void setcanadianbacon(int in){canadianbacon = in;}
	public void setricotta(int in){ricotta = in;}
	public void setchicken(int in){chicken = in;}
	

}