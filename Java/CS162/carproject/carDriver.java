import javax.swing.JFrame;


public class carDriver{
	public static void main(String[] args) {
	// just making a frame  
	JFrame frame = new JFrame("A nice little car");

	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	frame.getContentPane().add(new carPanel());
	frame.pack();
	frame.setVisible(true);	
	}
}