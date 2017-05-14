//
//
//
import javax.swing.JFrame;
public class lab8{
	public static void main(String[] args){
	//name
	JFrame container = new JFrame("A nice quilt");
	//close
	container.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	//stuff that does stuff
	container.getContentPane().add(new quiltPanel());
	
	container.pack();
	container.setVisible(true);
	}
}