
import javax.swing.*;
import javax.swing.text.*;
import java.awt.*;
import java.awt.Graphics;
import java.util.Scanner;
import java.awt.event.*;


public class stringDisplayPanel extends JPanel{

	public String in;
	public String out = ""; 
	public JTextField insqr = new JTextField(10);
	public JButton button = new JButton("Reverse the Phrase");
	public int x = 0;
	
	public stringDisplayPanel(){
	
	setPreferredSize(new Dimension(400,500));
	
	backward rev = new backward();
	Scanner scan = new Scanner(System.in);
	//System.out.println("Enter a string.");
	//in = scan.nextLine();
	//out = backward.reverse(in);
	//System.out.println(backward.reverse(in));
	
	

	add(insqr);
	add(button);
	blah();

	}
	
	
	void blah(){
		//JButton button = new JButton("Reverse the Phrase");
		//add(button);
		button.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				
				
				repaint();
				in = insqr.getText();
				out = backward.reverse(in);
				x= x + 10;
				System.out.println(out);
				
			}
		});
	}
	
	//*/
	public void paintComponent(Graphics g){
	
	g.drawString(out,50,45 + x);
	}//*/
}