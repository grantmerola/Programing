import javax.swing.JFrame;
import javax.swing.JSplitPane;
import javax.swing.JTabbedPane;
import javax.swing.BoxLayout;

//import java.awt.*;

//pizza ordering application driver
//(☞ﾟヮﾟ)☞ pizza__driver lol
/*
	VERSION: 2
	Version 2 changes: code neatness, implmenation of debug arg, compleate import statements, camel case, denoted first add and further additions of toppings, deletion of pizza size deletes the rest of the pizza, debut trace statments.
	Version 2 was a back end and edge case update. If v3 happens it would be new feature oriented. For more info see file "problems in writen form"  
	NOTE:
	This project is big, when compileing it creates A LOT of class files, so be prepared 
	also I honestly dont even know how it all conects any more
	code is not very flexable but it does have good~~ MVC
	modify at your own risk

	linecount: 1,465
	Change: -45 lines
	sourcefilecount: 9
	classfilecount: 33

	drawn extensivly from the oracle documnation 

*/
public class pizzadriver{

	private static boolean debug = false;
	
	public static void main(String[] args){

		// Do you want to debug
		if(args.length > 0){
			String argZero = args[0];
			if("FALSE".equalsIgnoreCase(argZero)){
				debug(false);
			}
			else if("TRUE".equalsIgnoreCase(argZero)){
				debug(true);
			}
			else{
				System.out.println("Program \"pizzadriver\" acepts arguments [true] or [false] for debug.");
			}
		}
		if(debug)
			System.out.println("Pizzadriver: debug " + debug);

		// just making a frame  
		JFrame frame = new JFrame("I WANT PIZZA NOW");

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		theeye ineye = new theeye(debug);

		//tab object creation more for file/source dcomp and neatness than anything
		pizzaTab1 tab1 = new pizzaTab1(ineye,debug);
		pizzaTab2 tab2 = new pizzaTab2(ineye,debug);
		pizzaTab3 tab3 = new pizzaTab3(ineye,debug);
		pizzaSidebar sidebar = new pizzaSidebar(ineye,debug);

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
	public static void debug(boolean inbol){
		debug = inbol;
	}
}