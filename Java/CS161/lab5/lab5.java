//Name: Grant Merola
//Class: CS161 Spring 2015
//Class Times: MWF 800
//Date Started:5/2/15
//Date Completed: 5/4/15
//lab#: 5
//Driver name:N/A, this file
//program description draws crayons
//test oracle:N/A
import javax.swing.JFrame;
public class lab5{

	public static void main(String[] args){
	//name
	JFrame container = new JFrame("A nice box of crayons");
	//close
	container.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	//stuff that does stuff
	container.getContentPane().add(new crayonPanel());
	
	container.pack();
	container.setVisible(true);	

	
	
	}

}