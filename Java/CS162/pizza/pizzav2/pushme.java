//action listener file 
//controller
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JLabel;
import javax.swing.JList;

import javax.swing.event.ListSelectionListener;
import javax.swing.event.ListSelectionEvent;

//USE: create pushme object with and eye object then do <objectname>.new <actionlistenername>
public class pushme{

	protected theeye directsAll;
	protected boolean debug = false;
	public pushme(theeye ineye, boolean inbol){
		directsAll = ineye;
		debug = inbol;
		if(debug)
			System.out.println("pushme: inbol " + inbol);
	}
	public pushme(theeye ineye){
		directsAll = ineye;
	}

// Action Listeners 
	//SIDEBAR
	// Clear Btn
	public class clearBtn implements ActionListener{
		private int check;
		public void actionPerformed(ActionEvent e){		
			//This is for the sadist with an autoclicker 
			if(check < Integer.MAX_VALUE -1){
				check++;
				directsAll.clearBtn();
				directsAll.updateJList(directsAll);
				if(debug)
					System.out.println("pushme: cleared lists");
			}
			else{
				System.out.println("I don't like you, go do something else -_-");
			}
		}
	}
	// Order Btn
	public class orderBtn implements ActionListener{
		private int check;
		public void actionPerformed(ActionEvent e){			
			if(check < Integer.MAX_VALUE -1){
				check++;
				if(debug)
					System.out.println("pushme: from where?, to where?");
			}
			else{
				System.out.println("I don't like you, go do something else -_-");
			}
		}
	}
	// Remove Btn
	protected int selectionValue = 0;	
	public class removeBtn implements ActionListener{
		private int check;
		public void actionPerformed(ActionEvent e){
			if(check < Integer.MAX_VALUE -1){
				check++;
				directsAll.removeItem(selectionValue);
				directsAll.updateJList(directsAll);
				if(debug)
					System.out.println("pushme: item removed");
			}
			else{
				System.out.println("I don't like you, go do something else -_-");
			}
		}
	}
	// Fetches selected value
	public class selctionListener implements ListSelectionListener{
		public JList list;
		public selctionListener(JList inlist){
			list = inlist;
		}
		public void valueChanged(ListSelectionEvent e){
			selectionValue = list.getSelectedIndex();
			if(debug){
				if(selectionValue >= 0){
					System.out.println("pushme: selectionValue " + selectionValue);
					System.out.println("pushme: listselection changed");
				}
				else{
					System.out.println("pushme: actully select a item");
				}
			}			
		}
	}

	//PIZZA
	// Size
	// Small
	public class smallPizzaBtn implements ActionListener{
		private int check;
		public void actionPerformed(ActionEvent e){			
			if(check < Integer.MAX_VALUE -1){
				check++;
				directsAll.setSize(1);
				if(debug)
					System.out.println("pushme: chose small pizza");
			}
			else{
				System.out.println("I don't like you, go do something else -_-");
			}	
		}
	}
	// Medium
	public class mediumPizzaBtn implements ActionListener{
		private int check;
		public void actionPerformed(ActionEvent e){				
			if(check < Integer.MAX_VALUE -1){
				check++;			
				directsAll.setSize(2);
				if(debug)
					System.out.println("pushme: chose medium pizza");
			}
			else{
				System.out.println("I don't like you, go do something else -_-");
			}
		}
	}
	// Large 
	public class largePizzaBtn implements ActionListener{
		private int check;
		public void actionPerformed(ActionEvent e){			
			if(check < Integer.MAX_VALUE -1){
				check++;
				directsAll.setSize(3);
				if(debug)
					System.out.println("pushme: chose large pizza");
			}
			else{
				System.out.println("I don't like you, go do something else -_-");
			}
		}
	}
	// Sauce
	// Tomato Sauce
	public class sauceTBtn implements ActionListener{
		private int check;
		public void actionPerformed(ActionEvent e){			
			if(check < Integer.MAX_VALUE -1){
				check++;
				directsAll.setSauce(true);
				System.out.println("pushme: chose tomato sauce");
			}
			else{
				System.out.println("I don't like you, go do something else -_-");
			}
		}
	}
	// BBQ Sauce
	public class sauceBBtn implements ActionListener{
		private int check;
		public void actionPerformed(ActionEvent e){
			if(check < Integer.MAX_VALUE -1){
				check++;
				directsAll.setSauce(false);
				if(debug)
					System.out.println("pushme: chose BBQ sauce");
			}
			else{
				System.out.println("I don't like you, go do something else -_-");
			}
		}
	}
	// Cheese
	public class addCheeseBtn implements ActionListener{
		private int check;
		private JLabel passedLabel;
		public addCheeseBtn(JLabel label){
			passedLabel = label;
		}
		public void actionPerformed(ActionEvent e){
			if(check < Integer.MAX_VALUE -1){
				check++;
				directsAll.setCheese(1);
				passedLabel.setText("x "+Integer.toString(directsAll.getCheeseCount()));
				if(debug)
					System.out.println("pushme: add cheeeeeeeeeeeeeeeeeeese -_-");
			}
			else{
				System.out.println("I don't like you, go do something else -_-");
			}
		}
	}
	// Pineapple
	public class addPineappleBtn implements ActionListener{
		private int check;
		private JLabel passedLabel;
		public addPineappleBtn(JLabel label){
			passedLabel = label;
		}
		public void actionPerformed(ActionEvent e){
			if(check < Integer.MAX_VALUE -1){
				check++;
				directsAll.setPineapple(1);
				passedLabel.setText("x "+Integer.toString(directsAll.getPineappleCount()));
				if(debug)
					System.out.println("pushme: added pineapple");
			}
			else{
				System.out.println("I don't like you, go do something else -_-");
			}
		}	
	}
	// Canadian Bacon
		public class addCanadianbaconBtn implements ActionListener{
		private int check;
		private JLabel passedLabel;
		public addCanadianbaconBtn(JLabel label){
			passedLabel = label;
		}
		public void actionPerformed(ActionEvent e){
			if(check < Integer.MAX_VALUE -1){
				check++;
				directsAll.setCanadianbacon(1);
				passedLabel.setText("x "+Integer.toString(directsAll.getCanadianbaconCount()));
				if(debug)
					System.out.println("pushme: added canadianbacon");
			}
			else{
				System.out.println("I don't like you, go do something else -_-");
			}
		}
	}

	// Ricotta
	public class addRicottaBtn implements ActionListener{
		private int check;
		private JLabel passedLabel;
		public addRicottaBtn(JLabel label){
			passedLabel = label;
		}
		public void actionPerformed(ActionEvent e){
			if(check < Integer.MAX_VALUE -1){
				check++;
				directsAll.setRicotta(1);
				passedLabel.setText("x "+Integer.toString(directsAll.getRicottaCount()));
				if(debug)
					System.out.println("pushme: added ricotta");
			}
			else{
				System.out.println("I don't like you, go do something else -_-");
			}
		}
	}
	//chicken
	public class addChickenBtn implements ActionListener{
		private int check;
		private JLabel passedLabel;
		public addChickenBtn(JLabel label){
			passedLabel = label;
		}
		public void actionPerformed(ActionEvent e){
			if(check < Integer.MAX_VALUE -1){
				check++;
				directsAll.setChicken(1);
				passedLabel.setText("x "+Integer.toString(directsAll.getChickenCount()));
				if(debug)
					System.out.println("pushme: added chicken");
			}
			else{
				System.out.println("I don't like you, go do something else -_-");
			}
		}
	}

	//id & add pizza
	public class addPizzaBtn implements ActionListener{
		private int check;
		private JLabel passedCheeseLabel;
		private JLabel passedPineappleLabel;
		private JLabel passedCanadianbaconLabel;
		private JLabel passedRicottaLabel;
		private JLabel passedChickenLabel;

		public addPizzaBtn(JLabel cheeseLabel,JLabel pineappleLabel,JLabel candaianbaconlabel,JLabel ricottaLabel,JLabel chickenLabel){
			 passedCheeseLabel = cheeseLabel;
			 passedPineappleLabel = pineappleLabel;
			 passedCanadianbaconLabel = candaianbaconlabel;
			 passedRicottaLabel = ricottaLabel;
			 passedChickenLabel = chickenLabel;
		}
		public void actionPerformed(ActionEvent e){
			if(check < Integer.MAX_VALUE -1){
				check++;
				directsAll.addPizza();
				passedCheeseLabel.setText("x  1");
				passedPineappleLabel.setText("x  0");
				passedCanadianbaconLabel.setText("x  0");
				passedRicottaLabel.setText("x  0");
				passedChickenLabel.setText("x  0");
				directsAll.clearPizza();
				directsAll.updateJList(directsAll);
				if(debug)
					System.out.println("pushme: added a pizza");
			}
			else{
				System.out.println("I don't like you, go do something else -_-");
			}
		}
	}
	// clear pizza
	public class clearPizzaBtn implements ActionListener{
		private int check;
		private JLabel passedCheeseLabel;
		private JLabel passedPineappleLabel;
		private JLabel passedCanadianbaconLabel;
		private JLabel passedRicottaLabel;
		private JLabel passedChickenLabel;

		public clearPizzaBtn(JLabel cheeseLabel,JLabel pineappleLabel,JLabel candaianbaconlabel,JLabel ricottaLabel,JLabel chickenLabel){
			 passedCheeseLabel = cheeseLabel;
			 passedPineappleLabel = pineappleLabel;
			 passedCanadianbaconLabel = candaianbaconlabel;
			 passedRicottaLabel = ricottaLabel;
			 passedChickenLabel = chickenLabel;
		}
		public void actionPerformed(ActionEvent e){
			if(check < Integer.MAX_VALUE -1){
				check++;
				directsAll.clearPizza();
				passedCheeseLabel.setText("x  0");
				passedPineappleLabel.setText("x  0");
				passedCanadianbaconLabel.setText("x  0");
				passedRicottaLabel.setText("x  0");
				passedChickenLabel.setText("x  0");
				if(debug)
					System.out.println("pushme: cleared a pizza");
			}
			else{
				System.out.println("I don't like you, go do something else -_-");
			}
		}
	}

	//DRINKS
	// Root Beer
	public class addRootBeerBtn implements ActionListener{
		private int check;
		public void actionPerformed(ActionEvent e){
			if(check < Integer.MAX_VALUE -1){
				check++;
				directsAll.addRootBeer();
				directsAll.updateJList(directsAll);
				System.out.println("pushme: added rootbeer");
			}
			else{
				System.out.println("I don't like you, go do something else -_-");
			}
		}	
	}

	// Orange Soda
	public class addOrangeSodaBtn implements ActionListener{
		private int check;
		public void actionPerformed(ActionEvent e){
			if(check < Integer.MAX_VALUE -1){
				check++;
				directsAll.addOrangeSoda();
				directsAll.updateJList(directsAll);
				System.out.println("pushme: added orangesoda");
			}
			else{
				System.out.println("I don't like you, go do something else -_-");
			}
		}	
	}

	// Juice
	public class addJuiceBtn implements ActionListener{
		private int check;
		public void actionPerformed(ActionEvent e){
			if(check < Integer.MAX_VALUE -1){
				check++;
				directsAll.addJuice();
				directsAll.updateJList(directsAll);
				if(debug)
					System.out.println("pushme: added juice");
			}
			else{
				System.out.println("I don't like you, go do something else -_-");
			}
		}	
	}

	// Birch Beer
	public class addBirchBeerBtn implements ActionListener{
		private int check;
		public void actionPerformed(ActionEvent e){
			if(check < Integer.MAX_VALUE -1){
				check++;
				directsAll.addBirchBeer();
				directsAll.updateJList(directsAll);
				if(debug)
					System.out.println("pushme: added birchbeer");
			}
			else{
				System.out.println("I don't like you, go do something else -_-");
			}
		}	
	}

	// Specilty Items
	// Bread Sticks
	public class addBreadsticksBtn implements ActionListener{
		private int check;
		public void actionPerformed(ActionEvent e){
			if(check < Integer.MAX_VALUE -1){
				check++;
				directsAll.addBreadsticks();
				directsAll.updateJList(directsAll);
				System.out.println("pushme: added breadsticks");
			}
			else{
				System.out.println("I don't like you, go do something else -_-");
			}
		}	
	}

	// Calzone
	public class addCalzoneBtn implements ActionListener{
		private int check;
		public void actionPerformed(ActionEvent e){
			if(check < Integer.MAX_VALUE -1){
				check++;
				directsAll.addCalzone();
				directsAll.updateJList(directsAll);
				if(debug)
					System.out.println("pushme: added calzone");
			}
			else{
				System.out.println("I don't like you, go do something else -_-");
			}
		}	
	}

	// Fries
	public class addFriesBtn implements ActionListener{
		private int check;
		public void actionPerformed(ActionEvent e){
			if(check < Integer.MAX_VALUE -1){
				check++;
				directsAll.addFries();
				directsAll.updateJList(directsAll);
				if(debug)
					System.out.println("pushme: added fries");
			}
			else{
				System.out.println("I don't like you, go do something else -_-");
			}
		}	
	}

	//pie
	public class addPieBtn implements ActionListener{
		private int check;
		public void actionPerformed(ActionEvent e){
			if(check < Integer.MAX_VALUE -1){
				check++;
				directsAll.addPie();
				directsAll.updateJList(directsAll);
				if(debug)
					System.out.println("pushme: added pie");
			}
			else{
				System.out.println("I don't like you, go do something else -_-");
			}
		}	
	}
}