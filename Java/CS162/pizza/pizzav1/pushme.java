//action listener file 
//controller
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

//USE: create pushme object then do <objectname>.new <actionlistenername>
// yes this is confusing and wierd  just do it future me DO IT
public class pushme /*implements ActionListener extends pizzaTab1*/{

	protected theeye directsall;
	public pushme(theeye ineye){
		directsall = ineye;
	}


	// proteced not private becasue action listeners are subclasses, only visibility modifyer with subclass option and is =! pub is protected
	//protected theeye directsall = new theeye();

	//action listeners 
	//NOTE: we try only to call the eye not any other objects, this is becasue we really want controller model seperation  
	// if we need some thing we will just create it in the eye unwieldy but  ¯\_(ツ)_/¯
	
	//SIDEBAR
	public class clearbtn implements ActionListener{
			private int check;
			public void actionPerformed(ActionEvent e){
				
				//This is for the sadist with an autoclicker 
				if(check < Integer.MAX_VALUE -1){
					check++;
					directsall.clearbtn();
					directsall.updatejlist(directsall);
					System.out.println("cleared lists");

				}
				else{
					System.out.println("I don't like you, go do something else -_-");
				}

			}
	}
	public class orderbtn implements ActionListener{
			private int check;
			public void actionPerformed(ActionEvent e){
				
				if(check < Integer.MAX_VALUE -1){
					check++;
					System.out.println("from where?, to where?");

				}
				else{
					System.out.println("I don't like you, go do something else -_-");
				}

			}
	}
	
	protected int selectionvalue = 0;
	
	public class removebtn implements ActionListener{
			private int check;
			public void actionPerformed(ActionEvent e){


				if(check < Integer.MAX_VALUE -1){
					check++;
					directsall.removeitem(selectionvalue);
					System.out.println("item removed");
					directsall.updatejlist(directsall);

				}
				else{
					System.out.println("I don't like you, go do something else -_-");
				}

			}
	}
	public class selctionlistener implements ListSelectionListener{
		//public int value = 0;
		public JList list;
		public selctionlistener(JList inlist){
			// value = inlist.getSelectedIndex();
			list = inlist;
		}
		public void valueChanged(ListSelectionEvent e){
				
				//if(value >= 0){
				selectionvalue = list.getSelectedIndex();
				if(selectionvalue > 0){
				//selectionvalue = value;
				//System.out.println("listselection changed");
				}
				else{
					System.out.println("actully select a item");
				}
				
		}
	}



	//PIZZA
	//size
	public class smallpizzabtn implements ActionListener{
			private int check;
			public void actionPerformed(ActionEvent e){

				
				if(check < Integer.MAX_VALUE -1){
					check++;
					System.out.println("chose small pizza");
					directsall.setsize(1);


				}
				else{
					System.out.println("I don't like you, go do something else -_-");
				}	

			}
	}
	public class mediumpizzabtn implements ActionListener{
			private int check;
			public void actionPerformed(ActionEvent e){

				
				if(check < Integer.MAX_VALUE -1){
					check++;	
					System.out.println("chose medium pizza");
					directsall.setsize(2);

				}
				else{
					System.out.println("I don't like you, go do something else -_-");
				}

			}
	}
	public class largepizzabtn implements ActionListener{
			private int check;
			public void actionPerformed(ActionEvent e){

				
				if(check < Integer.MAX_VALUE -1){
					check++;
					System.out.println("chose large pizza");
					directsall.setsize(3);

				}
				else{
					System.out.println("I don't like you, go do something else -_-");
				}
			}
	}

	//sauce
	public class sauceTbtn implements ActionListener{
			private int check;
			public void actionPerformed(ActionEvent e){

				
				if(check < Integer.MAX_VALUE -1){
					check++;
					System.out.println("chose tomato sauce");
					directsall.setsauce(true);

				}
				else{
					System.out.println("I don't like you, go do something else -_-");
				}

			}
	}
	public class sauceBbtn implements ActionListener{
			private int check;
			public void actionPerformed(ActionEvent e){

				
				if(check < Integer.MAX_VALUE -1){
					check++;
					System.out.println("chose BBQ sauce");
					directsall.setsauce(false);

				}
				else{
					System.out.println("I don't like you, go do something else -_-");
				}
			}
	}

	//cheese
	public class addcheesebtn implements ActionListener{
			private int check;
			private JLabel passedlabel;
			public addcheesebtn(JLabel label){
				passedlabel = label;
			}

			public void actionPerformed(ActionEvent e){

				
				if(check < Integer.MAX_VALUE -1){
					check++;
					System.out.println("add cheeeeeeeeeeeeeeeeeeese -_-");
					directsall.setcheese(1);
					passedlabel.setText("x "+Integer.toString(directsall.getcheesecount()));

				}
				else{
					System.out.println("I don't like you, go do something else -_-");
				}
			}
	}

	//pineapple
	public class addpineapplebtn implements ActionListener{
			private int check;
			private JLabel passedlabel;
		
			public addpineapplebtn(JLabel label){
				passedlabel = label;
			}

			public void actionPerformed(ActionEvent e){
				
				if(check < Integer.MAX_VALUE -1){
					check++;
					System.out.println("added pineapple");
					directsall.setpineapple(1);
					passedlabel.setText("x "+Integer.toString(directsall.getpineapplecount()));

				}
				else{
					System.out.println("I don't like you, go do something else -_-");
				}
			}	
	}

	//canadianbacon
		public class addcanadianbaconbtn implements ActionListener{
			private int check;
			private JLabel passedlabel;
			public addcanadianbaconbtn(JLabel label){
				passedlabel = label;
			}

			public void actionPerformed(ActionEvent e){

				
				if(check < Integer.MAX_VALUE -1){
					check++;
					System.out.println("added canadianbacon");
					directsall.setcanadianbacon(1);
					passedlabel.setText("x "+Integer.toString(directsall.getcanadianbaconcount()));

				}
				else{
					System.out.println("I don't like you, go do something else -_-");
				}
			}
	}

	//ricotta
	public class addricottabtn implements ActionListener{
			private int check;
			private JLabel passedlabel;
			public addricottabtn(JLabel label){
				passedlabel = label;
			}

			public void actionPerformed(ActionEvent e){

				
				if(check < Integer.MAX_VALUE -1){
					check++;
					System.out.println("added ricotta");
					directsall.setricotta(1);
					passedlabel.setText("x "+Integer.toString(directsall.getricottacount()));

				}
				else{
					System.out.println("I don't like you, go do something else -_-");
				}
			}
	}
	//chicken
	public class addchickenbtn implements ActionListener{
			private int check;
			private JLabel passedlabel;
			public addchickenbtn(JLabel label){
				passedlabel = label;
			}

			public void actionPerformed(ActionEvent e){

				
				if(check < Integer.MAX_VALUE -1){
					check++;
					System.out.println("added chicken");
					directsall.setchicken(1);
					passedlabel.setText("x "+Integer.toString(directsall.getchickencount()));

				}
				else{
					System.out.println("I don't like you, go do something else -_-");
				}
			}
	}

	//id & add pizza
	public class addpizzabtn implements ActionListener{
			private int check;
			private JLabel passedcheeselabel;
			private JLabel passedpineapplelabel;
			private JLabel passedcanadianbaconlabel;
			private JLabel passedricottalabel;
			private JLabel passedchickenlabel;

			public addpizzabtn(JLabel cheeselabel,JLabel pineapplelabel,JLabel candaianbaconlabel,JLabel ricottalabel,JLabel chickenlabel){
				 passedcheeselabel = cheeselabel;
				 passedpineapplelabel = pineapplelabel;
				 passedcanadianbaconlabel = candaianbaconlabel;
				 passedricottalabel = ricottalabel;
				 passedchickenlabel = chickenlabel;
			}
			public void actionPerformed(ActionEvent e){
				
				if(check < Integer.MAX_VALUE -1){
					check++;
					System.out.println("added a pizza");
					directsall.addpizza();

					passedcheeselabel.setText("x  1");
					passedpineapplelabel.setText("x  0");
					passedcanadianbaconlabel.setText("x  0");
					passedricottalabel.setText("x  0");
					passedchickenlabel.setText("x  0");
					directsall.clearpizza();
					directsall.updatejlist(directsall);

				}
				else{
					System.out.println("I don't like you, go do something else -_-");
				}

			}
	}

	// clear pizza
	public class clearpizzabtn implements ActionListener{
			private int check;
			private JLabel passedcheeselabel;
			private JLabel passedpineapplelabel;
			private JLabel passedcanadianbaconlabel;
			private JLabel passedricottalabel;
			private JLabel passedchickenlabel;

			public clearpizzabtn(JLabel cheeselabel,JLabel pineapplelabel,JLabel candaianbaconlabel,JLabel ricottalabel,JLabel chickenlabel){
				 passedcheeselabel = cheeselabel;
				 passedpineapplelabel = pineapplelabel;
				 passedcanadianbaconlabel = candaianbaconlabel;
				 passedricottalabel = ricottalabel;
				 passedchickenlabel = chickenlabel;
			}
			public void actionPerformed(ActionEvent e){
				
				if(check < Integer.MAX_VALUE -1){
					check++;
					System.out.println("cleared a pizza");
					directsall.clearpizza();

					passedcheeselabel.setText("x  0");
					passedpineapplelabel.setText("x  0");
					passedcanadianbaconlabel.setText("x  0");
					passedricottalabel.setText("x  0");
					passedchickenlabel.setText("x  0");

				}
				else{
					System.out.println("I don't like you, go do something else -_-");
				}

			}
	}



	//DRINKS
	//rootbeer
	public class addrootbeerbtn implements ActionListener{
		private int check;

		public void actionPerformed(ActionEvent e){
			
			if(check < Integer.MAX_VALUE -1){
				check++;
				System.out.println("added rootbeer");
				directsall.addrootbeer();
				directsall.updatejlist(directsall);

			}
			else{
				System.out.println("I don't like you, go do something else -_-");
			}
		}	
	}

	//orangesoda
	public class addorangesodabtn implements ActionListener{
		private int check;

		public void actionPerformed(ActionEvent e){
			
			if(check < Integer.MAX_VALUE -1){
				check++;
				System.out.println("added orangesoda");
				directsall.addorangesoda();
				directsall.updatejlist(directsall);

			}
			else{
				System.out.println("I don't like you, go do something else -_-");
			}
		}	
	}

	//juice
	public class addjuicebtn implements ActionListener{
		private int check;

		public void actionPerformed(ActionEvent e){
			
			if(check < Integer.MAX_VALUE -1){
				check++;
				System.out.println("added juice");
				directsall.addjuice();
				directsall.updatejlist(directsall);

			}
			else{
				System.out.println("I don't like you, go do something else -_-");
			}
		}	
	}

	//birchbeer
	public class addbirchbeerbtn implements ActionListener{
		private int check;

		public void actionPerformed(ActionEvent e){
			
			if(check < Integer.MAX_VALUE -1){
				check++;
				System.out.println("added birchbeer");
				directsall.addbirchbeer();
				directsall.updatejlist(directsall);

			}
			else{
				System.out.println("I don't like you, go do something else -_-");
			}
		}	
	}




	//specilty items
	//breadsticks
	public class addbreadsticksbtn implements ActionListener{
		private int check;

		public void actionPerformed(ActionEvent e){
			
			if(check < Integer.MAX_VALUE -1){
				check++;
				System.out.println("added breadsticks");
				directsall.addbreadsticks();
				directsall.updatejlist(directsall);

			}
			else{
				System.out.println("I don't like you, go do something else -_-");
			}
		}	
	}

	//calzone
	public class addcalzonebtn implements ActionListener{
		private int check;

		public void actionPerformed(ActionEvent e){
			
			if(check < Integer.MAX_VALUE -1){
				check++;
				System.out.println("added calzone");
				directsall.addcalzone();
				directsall.updatejlist(directsall);

			}
			else{
				System.out.println("I don't like you, go do something else -_-");
			}
		}	
	}

	//fries
	public class addfriesbtn implements ActionListener{
		private int check;

		public void actionPerformed(ActionEvent e){
			
			if(check < Integer.MAX_VALUE -1){
				check++;
				System.out.println("added fries");
				directsall.addfries();
				directsall.updatejlist(directsall);

			}
			else{
				System.out.println("I don't like you, go do something else -_-");
			}
		}	
	}

	//pie
	public class addpiebtn implements ActionListener{
		private int check;

		public void actionPerformed(ActionEvent e){
			
			if(check < Integer.MAX_VALUE -1){
				check++;
				System.out.println("added pie");
				directsall.addpie();
				directsall.updatejlist(directsall);

			}
			else{
				System.out.println("I don't like you, go do something else -_-");
			}
		}	
	}
}