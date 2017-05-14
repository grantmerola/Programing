import javax.swing.JFrame;


public class project3{

	public static void main(String[] args) {
	// just making a frame  
	JFrame frame = new JFrame("A nice set of Circles");

	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	project3panel panel = new project3panel();
	frame.getContentPane().add(panel);
	
	frame.pack();
	frame.setVisible(true);	

	}
}

