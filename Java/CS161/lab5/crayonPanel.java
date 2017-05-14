//Name: Grant Merola
//Class: CS161 Spring 2015
//Class Times: MWF 800
//Date Started:5/2/15
//Date Completed: 5/4/15
//lab#: 5
//Driver name:lab5.java
//program description draws crayons
//test oracle:N/A
import javax.swing.*;
import java.awt.*;
public class crayonPanel extends JPanel{

	public Crayon crayon1, crayon2, crayon3, crayon4, crayon5, crayon6;
	
	public crayonPanel(){
	//window size
	setPreferredSize(new Dimension(400,200));
	
	int where = 50;
	//crayon obj def
	crayon1 = new Crayon(10 + where,10,23, Color.red);
	crayon2 = new Crayon(55 + where,10,25, Color.green);
	crayon3 = new Crayon(180 + where,10,55, Color.orange);
	crayon4 = new Crayon(230 + where,10,103,Color.black);
	crayon5 = new Crayon(130 + where,10,173, Color.magenta);
	crayon6 = new Crayon(89 + where,10,853, Color.yellow);
	//*/

	
	}
	// crazy voodoo witch craft magic 
	public void paintComponent(Graphics page){
	
	super.paintComponent(page);
	
	crayon1.draw(page);
	crayon2.draw(page);
	crayon3.draw(page);
	crayon4.draw(page);
	crayon5.draw(page);
	crayon6.draw(page);
	//box
	page.setColor(Color.yellow);
	page.fillRect(50,50,300,100);
	//name
	page.drawString("Grant Merola",10,10);
	//*/
	}


}