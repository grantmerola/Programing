//Name: Grant Merola
//Class: CS161 Spring 2015
//Class Times: MWF 800
//Date Started:5/2/15
//Date Completed: 5/4/15
//lab#: 5
//Driver name:lab5.java
//program description draws crayons
//test oracle:N/A
import java.awt.*;
import java.util.Random;
public class Crayon{
	
	public int x, y, rank;
	public Color WC;
	
	public Crayon(int pos1, int pos2,int height, Color color){
	
	x = pos1;
	y = pos2;
	rank = height;
	WC = color;
	
	if(rank < 50){
	rank = 50;
	}
	else if(rank > 100){
	rank = 100;
	}

	
	}
	
	// draws crayon object
	public void draw(Graphics page){
	
	page.setColor(WC);
	page.drawLine(x + 10,y,x,y + 10);
	page.drawLine(x + 10, y,x + 20,y + 10);
	page.fillRect(x,y + 10,20,rank);
				
	}
	
	//direct from the practice 
	public static Color RandomColor(){
	
	Random rand = new Random();
	int red, green, blue;
	red = rand.nextInt(255);
	green = rand.nextInt(255);
	blue = rand.nextInt(255);
	
	Color color = new Color(red,green,blue);
	return color;
	
	}
	//rand color setter
	public void setrandcolor(){
	WC = RandomColor();
	}
	
	//getter setter 
	public void setPos1(int pos1){x=pos1;};
	public int getPos1(){return x;};
	public void setPos2(int pos2){y=pos2;};
	public int getPos2(){return y;};
	public void setHeight(int height){rank=height;};
	public int getrank(){return rank;};
	public void setColor(Color color){WC=color;};
	public Color getColor(){return WC;};

}