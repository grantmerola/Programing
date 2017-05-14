import java.awt.Dimension;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JButton;

public class pizzaTab3 extends JPanel{

	public pizzaTab3(theeye ineye, boolean inbol){
		boolean debug = inbol;
		theeye seesAll =ineye; 
		pushme btn = new pushme(ineye,debug);
		
		
		JPanel breadsticks = new JPanel();
		JPanel calzone = new JPanel();
		JPanel fries = new JPanel();
		JPanel pie = new JPanel();

		// Bread sticks
		JLabel breadsticksLable = new JLabel("Bread Sticks");
		breadsticks.add(breadsticksLable);

		JButton addBreadsticks = new JButton("Add");
		addBreadsticks.addActionListener(btn.new addBreadsticksBtn());
		breadsticks.add(addBreadsticks);

		// Calzone
		JLabel calzoneLable = new JLabel("Calzone");
		calzone.add(calzoneLable);

		JButton addCalzone = new JButton("Add");
		addCalzone.addActionListener(btn.new addCalzoneBtn());
		calzone.add(addCalzone);

		// Fries
		JLabel friesLable = new JLabel("Fries");
		fries.add(friesLable);

		JButton addFries = new JButton("Add");
		addFries.addActionListener(btn.new addFriesBtn());
		fries.add(addFries);

		// Pie
		JLabel pieLable = new JLabel("PIE!!");
		pie.add(pieLable);

		JButton addPie = new JButton("Add");
		addPie.addActionListener(btn.new addPieBtn());
		pie.add(addPie);

		add(breadsticks);
		add(calzone);
		add(fries);
		add(pie);
	}	
}