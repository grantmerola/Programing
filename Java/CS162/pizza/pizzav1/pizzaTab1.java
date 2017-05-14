import java.awt.*;
import javax.swing.*;

public class pizzaTab1 extends JPanel{

	//actionlistener file call
	//private pushme btn = new pushme();

	// theeye call
	//private theeye seesall = new theeye();



	public pizzaTab1(theeye ineye){
		theeye seesall =ineye; 
		pushme btn = new pushme(ineye);

		setPreferredSize(new Dimension(600,500));

		//Clunky as hell
		
		JPanel id = new JPanel();
		JPanel size = new JPanel();
		JPanel sauce = new JPanel();
		JPanel cheese = new JPanel();
		JPanel pineapple = new JPanel();
		JPanel canadianbacon = new JPanel();
		JPanel ricotta = new JPanel();
		JPanel chicken = new JPanel();
		

		
		//size

		size.setPreferredSize(new Dimension(25,80));
		size.setLayout(new BoxLayout(size, BoxLayout.X_AXIS));
		
		JLabel sizeicon = new JLabel(new ImageIcon("sizeicon.png"));
		size.add(sizeicon);
		
			//radio button
			JRadioButton small = new JRadioButton("Small",true);

			JRadioButton medium = new JRadioButton("Medium");
			JRadioButton large = new JRadioButton("Large");
			
			ButtonGroup pizzasizebtns = new ButtonGroup();
			pizzasizebtns.add(small);
			pizzasizebtns.add(medium);
			pizzasizebtns.add(large);


			small.addActionListener(btn.new smallpizzabtn());
			medium.addActionListener(btn.new mediumpizzabtn());
			large.addActionListener(btn.new largepizzabtn());

		size.add(small);
		size.add(medium);
		size.add(large);
		//size.setVisible(true);	

		//sauce
		sauce.setPreferredSize(new Dimension(25,80));
		sauce.setLayout(new BoxLayout(sauce, BoxLayout.X_AXIS));
		
		JLabel sauceicon = new JLabel(new ImageIcon("sauceicon.png"));
		sauce.add(sauceicon);
		
		JRadioButton sauceT = new JRadioButton("Tomato Sauce",true);

		JRadioButton sauceB = new JRadioButton("BBQ Sauce");

		ButtonGroup pizzasaucebtns = new ButtonGroup();
			pizzasaucebtns.add(sauceT);
			pizzasaucebtns.add(sauceB);

		sauceT.addActionListener(btn.new sauceTbtn());
		sauceB.addActionListener(btn.new sauceBbtn());
		sauce.add(sauceT);
		sauce.add(sauceB);


		//cheese
		cheese.setPreferredSize(new Dimension(25,80));
		cheese.setLayout(new BoxLayout(cheese, BoxLayout.X_AXIS));
		
		JLabel cheeseicon = new JLabel(new ImageIcon("cheeseicon.png"));
		cheese.add(cheeseicon);
		
		JButton addcheese = new JButton("Add extra cheese");
		JLabel cheesecount = new JLabel("x "+Integer.toString(seesall.getcheesecount()));

		addcheese.addActionListener(btn.new addcheesebtn(cheesecount));
		cheese.add(addcheese);


		cheese.add(cheesecount);


		//pineapple througth chicken are the same
		//Pineapple
		pineapple.setPreferredSize(new Dimension(25,80));
		pineapple.setLayout(new BoxLayout(pineapple, BoxLayout.X_AXIS));
		
		//image
		JLabel pineappleicon = new JLabel(new ImageIcon("pineappleicon.png"));
		pineapple.add(pineappleicon);
		
		//add button
		JButton addpineapple = new JButton("Add Pineapple");
		JLabel pineapplecount = new JLabel("x 0");
		addpineapple.addActionListener(btn.new addpineapplebtn(pineapplecount));
		pineapple.add(addpineapple);

		//pineapple added thus far
		
		pineapple.add(pineapplecount);


		//canadianbacon
		canadianbacon.setPreferredSize(new Dimension(25,80));
		canadianbacon.setLayout(new BoxLayout(canadianbacon, BoxLayout.X_AXIS));
		
		JLabel canadianbaconicon = new JLabel(new ImageIcon("canadianbaconicon.png"));
		canadianbacon.add(canadianbaconicon);
		
		JButton addcanadianbacon = new JButton("Add Canadian Bacon");
		JLabel canadianbaconcount = new JLabel("x 0");
		addcanadianbacon.addActionListener(btn.new addcanadianbaconbtn(canadianbaconcount));
		canadianbacon.add(addcanadianbacon);

		
		canadianbacon.add(canadianbaconcount);


		//ricotta
		ricotta.setPreferredSize(new Dimension(25,80));
		ricotta.setLayout(new BoxLayout(ricotta, BoxLayout.X_AXIS));
		
		JLabel ricottaicon = new JLabel(new ImageIcon("ricottaicon.png"));
		ricotta.add(ricottaicon);
		
		JButton addricotta = new JButton("Add Ricotta");
		JLabel ricottacount = new JLabel("x 0");
		addricotta.addActionListener(btn.new addricottabtn(ricottacount));
		ricotta.add(addricotta);

		
		ricotta.add(ricottacount);


		//chicken
		chicken.setPreferredSize(new Dimension(25,80));
		chicken.setLayout(new BoxLayout(chicken, BoxLayout.X_AXIS));
		
		JLabel chickenicon = new JLabel(new ImageIcon("chickenicon.png"));
		chicken.add(chickenicon);
		
		JButton addchicken = new JButton("Add Chicken");
		JLabel chickencount = new JLabel("x 0");
		addchicken.addActionListener(btn.new addchickenbtn(chickencount));
		chicken.add(addchicken);


		chicken.add(chickencount);


		//id
		id.setVisible(true);
		id.setPreferredSize(new Dimension(25,80));
		id.setLayout(new BoxLayout(id, BoxLayout.X_AXIS));
		
		JLabel idicon = new JLabel(new ImageIcon("idicon.png"));
		id.add(idicon);
		
		JButton addpizza = new JButton("Add current Pizza");
		addpizza.addActionListener(btn.new addpizzabtn(cheesecount,pineapplecount,canadianbaconcount,ricottacount,chickencount));
		//addpizza.addActionListener(btn.new )
		id.add(addpizza);

		JButton clearpizza = new JButton("Reset this pizza");
		clearpizza.addActionListener(btn.new clearpizzabtn(cheesecount,pineapplecount,canadianbaconcount,ricottacount,chickencount));
		id.add(clearpizza);


		//addto the tab panel
		add(size);
		add(sauce);
		add(cheese);
		add(pineapple);
		add(canadianbacon);
		add(ricotta);
		add(chicken);

		add(id);

	}


}