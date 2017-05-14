import java.awt.*;
import javax.swing.*;

public class pizzaTab2 extends JPanel{

	public pizzaTab2(theeye ineye){
		theeye seesall =ineye; 
		pushme btn = new pushme(ineye);
		
		setPreferredSize(new Dimension(500,700));
		
		JPanel rootbeer = new JPanel();
		JPanel orangesoda = new JPanel();
		JPanel juice = new JPanel();
		JPanel birchbeer = new JPanel();

		rootbeer.setPreferredSize(new Dimension(10,20));
		JLabel rootbeerlable = new JLabel("Root Beer");
		rootbeer.add(rootbeerlable);

		JButton addrootbeer = new JButton("Add");
		addrootbeer.addActionListener(btn.new addrootbeerbtn());
		rootbeer.add(addrootbeer);


		orangesoda.setPreferredSize(new Dimension(10,20));
		JLabel orangesodalable = new JLabel("Orange Soda");
		orangesoda.add(orangesodalable);

		JButton addorangesoda = new JButton("Add");
		addorangesoda.addActionListener(btn.new addorangesodabtn());
		orangesoda.add(addorangesoda);


		juice.setPreferredSize(new Dimension(10,20));
		JLabel juicelable = new JLabel("Juice");
		juice.add(juicelable);

		JButton addjuice = new JButton("Add");
		addjuice.addActionListener(btn.new addjuicebtn());
		juice.add(addjuice);


		birchbeer.setPreferredSize(new Dimension(10,20));
		JLabel birchbeerlable = new JLabel("Birch beer");
		birchbeer.add(birchbeerlable);

		JButton addbirchbeer = new JButton("Add");
		addbirchbeer.addActionListener(btn.new addbirchbeerbtn());
		birchbeer.add(addbirchbeer);
//*/
		add(rootbeer);
		add(orangesoda);
		add(juice);
		add(birchbeer);
	}
	
}