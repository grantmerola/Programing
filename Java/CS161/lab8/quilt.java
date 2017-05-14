
import java.awt.*;
import java.util.Random;
public class quilt{

	private Color color1, color2;
	private int x, y, row, col;
	private boolean ptype;
	private Random rng;
	
	public quilt(Color c1, Color c2, /*boolean patterntype,*/ int startcordX, int startcordY, int rowsize, int colsize){
	
	color1 = c1;
	color2 = c2;
	

	x = startcordX;
	y = startcordY;
	row = rowsize;
	col = colsize;
	
	//ptype = patterntype; 
	

	rng = new Random(); 	



	}
	public void draw(Graphics page){
	
		/*if (ptype){
			if (rng.nextInt()%2==0){
			
				page.setColor(color1);
				
			}
			else{
			
				page.setColor(color2);
				
			}
		}
		else{*/
		
			int pixC =0;
				for(int l=0; l < col; l++){
					for(int i=0; i < row; i++){
		
						if (rng.nextInt()%2==0){

							page.setColor(color1);

						}
						else{

							page.setColor(color2);

						}
					page.fillRect(x + pixC,y,10,10);
					pixC = pixC + 10; 
		
					}
				y = y +10;
				pixC = 0;
				}
		//}

				
	}
}