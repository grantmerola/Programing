//	Grant Merola
// Final
// THIS IS THE DRIVER
//
import javax.swing.JFrame;
import javax.swing.*;


public class Final{
	
	public static void main(String[] args){
	
		
	//name
	JFrame container = new JFrame("Your string reversed");
	//close
	container.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	//stuff that does stuff
	container.add(new stringDisplayPanel());

	
	container.pack();
	container.setVisible(true);
	
	}


}