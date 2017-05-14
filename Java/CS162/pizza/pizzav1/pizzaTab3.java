import java.awt.*;
import javax.swing.*;

public class pizzaTab3 extends JPanel{

	public pizzaTab3(theeye ineye){

		theeye seesall =ineye; 
		pushme btn = new pushme(ineye);
		
		setPreferredSize(new Dimension(300,300));
		
		JPanel breadsticks = new JPanel();
		JPanel calzone = new JPanel();
		JPanel fries = new JPanel();
		JPanel pie = new JPanel();

		breadsticks.setPreferredSize(new Dimension(10,20));
		JLabel breadstickslable = new JLabel("Bread Sticks");
		breadsticks.add(breadstickslable);

		JButton addbreadsticks = new JButton("Add");
		addbreadsticks.addActionListener(btn.new addbreadsticksbtn());
		breadsticks.add(addbreadsticks);


		calzone.setPreferredSize(new Dimension(10,20));
		JLabel calzonelable = new JLabel("Calzone");
		calzone.add(calzonelable);

		JButton addcalzone = new JButton("Add");
		addcalzone.addActionListener(btn.new addcalzonebtn());
		calzone.add(addcalzone);


		fries.setPreferredSize(new Dimension(10,20));
		JLabel frieslable = new JLabel("Fries");
		fries.add(frieslable);

		JButton addfries = new JButton("Add");
		addfries.addActionListener(btn.new addfriesbtn());
		fries.add(addfries);


		pie.setPreferredSize(new Dimension(10,20));
		JLabel pielable = new JLabel("PIE!!");
		pie.add(pielable);

		JButton addpie = new JButton("Add");
		addpie.addActionListener(btn.new addpiebtn());
		pie.add(addpie);
//*/
		add(breadsticks);
		add(calzone);
		add(fries);
		add(pie);


	}
	
}