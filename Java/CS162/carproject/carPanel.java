import javax.swing.JPanel;
import javax.swing.Timer;
import java.awt.Graphics;
import java.awt.Color;
import java.awt.Dimension;


public class carPanel extends JPanel{

	private int x,y,x2;

	public carPanel(){
		setPreferredSize(new Dimension(1000,300));
		setBackground(Color.GREEN);
		x =0;
		x2 = 980;
		y = 100;
		Timer  tm = new Timer(6,null);
		tm.addActionListener(e -> {
			repaint();
			if(x <980)
				x += 2;
			else
				x = 0;
			
			if(x2 < 1000 && x2 > 0)
				x2 -= 2;
			else
				x2 = 980;

		});
		tm.start();
	}


	
	public void paintComponent(Graphics page){	

		super.paintComponent(page);
		int width = 20;
		int length = 10;
		page.setColor(Color.BLACK);
		page.fillRect(0,100,1000,40);
		page.setColor(Color.YELLOW);
		page.fillRect(0,117,1000,2);
		page.setColor(Color.BLUE);
		page.fillRect(x,y,width,length);
		page.setColor(Color.BLUE);
		page.fillRect(x2,y+20,width,length);	

	}
}