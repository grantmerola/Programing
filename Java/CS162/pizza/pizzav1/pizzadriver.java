import javax.swing.*;
import java.awt.*;

//pizza ordering application driver
//(☞ﾟヮﾟ)☞ pizza__driver lol
/*
	VERSION: 1
	NOTE:
	This project is big, when compileing it creates A LOT of class files so be prepared 
	in retrospect should have used camelcase it needes it bad
	also I honestly dont even know how it all conects any more
	code is not very flexable but it does have good~~ MVC
	modify at your own risk

	linecount: 1510
	sourcefilecount: 9
	classfilecount: 33

	drawn extensivly from the oracle documnation 

*/
public class pizzadriver{

	public static void main(String[] args){

	// just making a frame  
	JFrame frame = new JFrame("I WANT PIZZA NOW");

	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	theeye ineye = new theeye();

	//tab object creation more for file/source dcomp and neatness than anything
	pizzaTab1 tab1 = new pizzaTab1(ineye);
	pizzaTab2 tab2 = new pizzaTab2(ineye);
	pizzaTab3 tab3 = new pizzaTab3(ineye);
	pizzaSidebar sidebar = new pizzaSidebar(ineye);

	//the tabbed pane	
	JTabbedPane tabedPanel = new JTabbedPane();

	tabedPanel.addTab("Pizza",tab1);
	tabedPanel.addTab("Drinks",tab2);
	tabedPanel.addTab("Special",tab3);
	
	//adding the tabs and the side bare
	JSplitPane panel = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, tabedPanel, sidebar);

	// not working?
	panel.setDividerLocation(.75);

	//because inplmenting boxlayout in the class is hard
	sidebar.setLayout(new BoxLayout(sidebar, BoxLayout.Y_AXIS));
	tab1.setLayout(new BoxLayout(tab1, BoxLayout.Y_AXIS));
	tab2.setLayout(new BoxLayout(tab2, BoxLayout.Y_AXIS));
	tab3.setLayout(new BoxLayout(tab3, BoxLayout.Y_AXIS));





	frame.getContentPane().add(panel);	
	frame.pack();
	frame.setVisible(true);	
	}
}