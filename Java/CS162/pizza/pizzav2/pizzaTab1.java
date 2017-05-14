import java.awt.Dimension;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;

public class pizzaTab1 extends JPanel{

	public pizzaTab1(theeye ineye, boolean inbol){
		boolean debug = inbol;
		theeye seesAll =ineye; 
		pushme btn = new pushme(ineye,debug);

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
		
		JLabel sizeIcon = new JLabel(new ImageIcon("sizeicon.png"));
		size.add(sizeIcon);
		
			//radio button
			JRadioButton small = new JRadioButton("Small",true);

			JRadioButton medium = new JRadioButton("Medium");
			JRadioButton large = new JRadioButton("Large");
			
			ButtonGroup pizzaSizeBtns = new ButtonGroup();
			pizzaSizeBtns.add(small);
			pizzaSizeBtns.add(medium);
			pizzaSizeBtns.add(large);


			small.addActionListener(btn.new smallPizzaBtn());
			medium.addActionListener(btn.new mediumPizzaBtn());
			large.addActionListener(btn.new largePizzaBtn());

		size.add(small);
		size.add(medium);
		size.add(large);

		//sauce
		sauce.setPreferredSize(new Dimension(25,100));
		sauce.setLayout(new BoxLayout(sauce, BoxLayout.X_AXIS));
		
		JLabel sauceIcon = new JLabel(new ImageIcon("sauceicon.png"));
		sauce.add(sauceIcon);
		
		JRadioButton sauceT = new JRadioButton("Tomato Sauce",true);

		JRadioButton sauceB = new JRadioButton("BBQ Sauce");

		ButtonGroup pizzaSauceBtns = new ButtonGroup();
			pizzaSauceBtns.add(sauceT);
			pizzaSauceBtns.add(sauceB);

		sauceT.addActionListener(btn.new sauceTBtn());
		sauceB.addActionListener(btn.new sauceBBtn());
		sauce.add(sauceT);
		sauce.add(sauceB);


		//cheese
		cheese.setPreferredSize(new Dimension(25,80));
		cheese.setLayout(new BoxLayout(cheese, BoxLayout.X_AXIS));
		
		JLabel cheeseIcon = new JLabel(new ImageIcon("cheeseicon.png"));
		cheese.add(cheeseIcon);
		
		JButton addCheese = new JButton("Add extra cheese");
		JLabel cheeseCount = new JLabel("x "+Integer.toString(seesAll.getCheeseCount()));

		addCheese.addActionListener(btn.new addCheeseBtn(cheeseCount));
		cheese.add(addCheese);


		cheese.add(cheeseCount);


		//pineapple througth chicken are the same
		//Pineapple
		pineapple.setPreferredSize(new Dimension(25,80));
		pineapple.setLayout(new BoxLayout(pineapple, BoxLayout.X_AXIS));
		
		//image
		JLabel pineappleIcon = new JLabel(new ImageIcon("pineappleicon.png"));
		pineapple.add(pineappleIcon);
		
		//add button
		JButton addPineapple = new JButton("Add Pineapple");
		JLabel pineappleCount = new JLabel("x 0");
		addPineapple.addActionListener(btn.new addPineappleBtn(pineappleCount));
		pineapple.add(addPineapple);
		
		pineapple.add(pineappleCount);


		//canadianbacon
		canadianbacon.setPreferredSize(new Dimension(25,80));
		canadianbacon.setLayout(new BoxLayout(canadianbacon, BoxLayout.X_AXIS));
		
		JLabel canadianbaconIcon = new JLabel(new ImageIcon("canadianbaconicon.png"));
		canadianbacon.add(canadianbaconIcon);
		
		JButton addCanadianbacon = new JButton("Add Canadian Bacon");
		JLabel canadianbaconCount = new JLabel("x 0");
		addCanadianbacon.addActionListener(btn.new addCanadianbaconBtn(canadianbaconCount));
		canadianbacon.add(addCanadianbacon);

		
		canadianbacon.add(canadianbaconCount);


		//ricotta
		ricotta.setPreferredSize(new Dimension(25,80));
		ricotta.setLayout(new BoxLayout(ricotta, BoxLayout.X_AXIS));
		
		JLabel ricottaIcon = new JLabel(new ImageIcon("ricottaicon.png"));
		ricotta.add(ricottaIcon);
		
		JButton addRicotta = new JButton("Add Ricotta");
		JLabel ricottaCount = new JLabel("x 0");
		addRicotta.addActionListener(btn.new addRicottaBtn(ricottaCount));
		ricotta.add(addRicotta);

		
		ricotta.add(ricottaCount);


		//chicken
		chicken.setPreferredSize(new Dimension(25,80));
		chicken.setLayout(new BoxLayout(chicken, BoxLayout.X_AXIS));
		
		JLabel chickenIcon = new JLabel(new ImageIcon("chickenicon.png"));
		chicken.add(chickenIcon);
		
		JButton addChicken = new JButton("Add Chicken");
		JLabel chickenCount = new JLabel("x 0");
		addChicken.addActionListener(btn.new addChickenBtn(chickenCount));
		chicken.add(addChicken);


		chicken.add(chickenCount);


		//id
		id.setVisible(true);
		id.setPreferredSize(new Dimension(25,80));
		id.setLayout(new BoxLayout(id, BoxLayout.X_AXIS));
		
		JLabel idIcon = new JLabel(new ImageIcon("idicon.png"));
		id.add(idIcon);
		
		JButton addPizza = new JButton("Add current Pizza");
		addPizza.addActionListener(btn.new addPizzaBtn(cheeseCount,pineappleCount,canadianbaconCount,ricottaCount,chickenCount));
		id.add(addPizza);

		JButton clearPizza = new JButton("Reset this pizza");
		clearPizza.addActionListener(btn.new clearPizzaBtn(cheeseCount,pineappleCount,canadianbaconCount,ricottaCount,chickenCount));
		id.add(clearPizza);


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