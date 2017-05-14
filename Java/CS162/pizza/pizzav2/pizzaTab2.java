import java.awt.Dimension;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JButton;

public class pizzaTab2 extends JPanel{

	public pizzaTab2(theeye ineye, boolean inbol){
		boolean debug = inbol;
		theeye seesAll =ineye; 
		pushme btn = new pushme(ineye, debug);
		
		
		JPanel rootBeer = new JPanel();
		JPanel orangeSoda = new JPanel();
		JPanel juice = new JPanel();
		JPanel birchBeer = new JPanel();

		// Root Beer
		JLabel rootBeerLabel = new JLabel("Root Beer");
		rootBeer.add(rootBeerLabel);

		JButton addRootBeer = new JButton("Add");
		addRootBeer.addActionListener(btn.new addRootBeerBtn());
		rootBeer.add(addRootBeer);

		// Orange Soda
		JLabel orangeSodaLabel = new JLabel("Orange Soda");
		orangeSoda.add(orangeSodaLabel);

		JButton addOrangeSoda = new JButton("Add");
		addOrangeSoda.addActionListener(btn.new addOrangeSodaBtn());
		orangeSoda.add(addOrangeSoda);

		// Juice
		JLabel juiceLabel = new JLabel("Juice");
		juice.add(juiceLabel);

		JButton addJuice = new JButton("Add");
		addJuice.addActionListener(btn.new addJuiceBtn());
		juice.add(addJuice);

		// Birch Beer
		JLabel birchBeerLabel = new JLabel("Birch beer");
		birchBeer.add(birchBeerLabel);

		JButton addBirchBeer = new JButton("Add");
		addBirchBeer.addActionListener(btn.new addBirchBeerBtn());
		birchBeer.add(addBirchBeer);

		add(rootBeer);
		add(orangeSoda);
		add(juice);
		add(birchBeer);
	}	
}