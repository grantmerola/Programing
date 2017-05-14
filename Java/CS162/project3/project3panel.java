
import java.awt.*;
import javax.swing.*;

public class project3panel extends JPanel{

	//circle array
	private circle[] circles = new circle[20];

	//only turn this on if you dont mind printing alot of stuff 
	public static boolean debug = false;

	public project3panel(){

		setPreferredSize(new Dimension(1400,870));

		for(int i=0; i<20;i++){
			//creates circle objects that can be refrenced by the array
			circles[i] = new circle();
				if(debug){
					System.out.println("circle creation");
				}
			
		}
		//checks all the circle objects for overlap and sets there color
		for(int l=0; l<circles.length; l++){
				for(int k=0; k<circles.length; k++){
					if(checkOverlap(circles[l], circles[k])){
						//touching
						circles[l].setcolor(Color.cyan);
						circles[k].setcolor(Color.cyan);
							if(debug){
								System.out.println("two circles have just been set to cyan!");
							}
					}
					else{
						//not touching
							if(debug){
								System.out.println("no circles have been colored ");
							}
					}
				}
		}
		//checks for cyan if it doesnt find cyan it turns it black
		for(int j=0; j<circles.length; j++){
			if(circles[j].getColor() != Color.cyan){
				circles[j].setcolor(Color.black);
					if(debug){
						System.out.println("a circle has just been set to black!");

					}
			}
			else if(circles[j].getColor() != Color.black || circles[j].getColor() != Color.cyan || circles[j].getColor() != Color.white){
				// this line prints and i have no idea why ¯\_(ツ)_/¯
				if (debug){System.out.println("hmmm i seem to be the wrong color");}
			}
		}


	}
	//take circles and checks if they overlap 
	public static boolean checkOverlap(circle c1, circle c2){

		boolean touching= false;
		//false not touching 
		//true touching 
		// defaults to false could be problimatic 

		//get the circles values 
		int radius1 = c1.getradius();
		int x1 = c1.getx();
		int y1 = c1.gety();
		
		int radius2 = c2.getradius();
		int x2 = c2.getx();
		int y2 = c2.gety();

			if(debug){
				System.out.println("what are the values that i fetched from the circle object.");
				System.out.println("touching? " + touching);
				System.out.println("radius1: "+radius1);
				System.out.println("radius2: "+radius2);
				System.out.println("x1: "+ x1);
				System.out.println("y1: "+ y1);

				System.out.println("x2: "+ x2);
				System.out.println("y2: "+ y2+"\n");
			}

		//the top right of a square plus the radius
		/*
		!.....@......	@
		......@......	@	
		......@......	@	===	radius 
		%%%%%%#@@@@@@	@
		......%......		
		......%......	@@@@@@ === radius
		......%......

		!@@@@@@......
		@............
		@............
		@.....#......
		.............
		.............
		.............

		! + @ = #
		
		perfectly clear
		¯\_(ツ)_/¯
		*/

		int xorigin1 = x1+radius1;
		int yorigin1 = y1+radius1;

		int xorigin2 = x2+radius2;
		int yorigin2 = y2+radius2;


			if(debug){
				System.out.println("origins");
				System.out.println("touching? " + touching);
				System.out.println("xorigin1: " + xorigin1);
				System.out.println("xorigin2: " + xorigin2);
				System.out.println("yorigin1: " + yorigin1);
				System.out.println("yorigin2: " + yorigin2+"\n");
			}

		//distance formula 
		double distance = Math.sqrt(((xorigin2 - xorigin1) * (xorigin2 - xorigin1) )+ ((yorigin2 - yorigin1) * (yorigin2 - yorigin1)));

		double testnum = distance - (radius1 + radius2);

				if(debug){
					System.out.println("distance formula output" + distance);
					System.out.println("distance - r+r: " + testnum +"\n");
				}

		//same circle case
		if(distance != 0.0){
			//we return false if we are the same circle, this delves in to the philosophical question of are you touching your self if you are you ¯\_(ツ)_/¯, also it fixes our program so, yaaa were going with this one
			
			if(testnum >= 1){
				//not touching
				touching = false;
					if(debug){
						System.out.println("touching?"+touching);
					}
			}
			else if(testnum <= 0){
				//touching
				touching = true;
					if(debug){
						System.out.println("touching?" + touching);
					}
			}
			else{
				System.out.println("Some thing very bad had happend and I dont know how to fix it. Author recomends heavy medication and setting hair on fire to fix problem.");
				touching = false;
				/*no not really*/ }
		}
		return touching;
	}
	
	//less vodoo magic than last time but sill mysterious
	public void paintComponent(Graphics page){
	
	super.paintComponent(page);

		for(int m=0; m<circles.length; m++){
			circles[m].draw(page);
		}
	}
}