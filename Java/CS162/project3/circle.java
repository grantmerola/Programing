import java.util.Random;
import java.awt.*;

public class circle implements Comparable<circle> {

	private Random rng = new Random();

	private int r;
	private int x; 
	private int y; 
	private Color currentcolor; 

	public circle(){

		r = rng.nextInt(100);
		x = rng.nextInt(1000);
		y = rng.nextInt(500); 
		currentcolor = Color.white;
	}
	//seters
	public void setradius(int radius){r = radius;} 
	public void setx(int setx){x = setx;}
	public void sety(int sety){y = sety;}
	public void setcolor(Color setcolor){currentcolor = setcolor;}
	
	//geters 
	public int getradius(){return r;}
	public int getx(){return x;}
	public int gety(){return y;}
	public Color getColor(){return currentcolor;}

	public void draw(Graphics page){
	
		page.setColor(currentcolor);
		// r*2 = length/ this is a square because this is a circle (also that logic sounds circular but it's not)
		page.fillOval(x,y,r*2,r*2);
				
	}

	//what is this devil worishp and why on gods green earth does it exist ಠ_ಠ (time to find out if this one throws an error) 
	//never mind i know why it exists but is's still crazy
	public int compareTo(circle obj){

		return 	Integer.compare(this.r, obj.r);
	}
}