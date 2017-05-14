
import java.awt.*;
import javax.swing.*;
public class quiltPanel extends JPanel{

	private quilt quilt1, quilt2;
	
	public quiltPanel(){
	
	setPreferredSize(new Dimension(400,200));
	
	quilt1 = new quilt(Color.green,Color.red,/*false,*/10,10,5,7);
	quilt2 = new quilt(Color.black,Color.white,60,10,4,9);
	
	}

	public void paintComponent(Graphics page){
	
	super.paintComponent(page);
	
	quilt1.draw(page);
	quilt2.draw(page);
	
	}
}
