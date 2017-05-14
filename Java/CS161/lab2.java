//---------------------------
// Name: Grant Merola
// Class: CS161 spring 0'15
// Class times: MWF 800
// Date started: 4/7/15
// Date completed: 4/9/15 
// Lab#:2
// Driver name: lab2.html     ?
// Program description: snowman maker
// Test Oracle: looks right       ? 
//---------------------------

import javax.swing.JApplet;
import java.awt.*;
public class lab2 extends JApplet{
    
    public void paint(Graphics page){
      // From book 
      final int MID = 170; // I changed MID + 20 px
      final int TOP = 50;
      setBackground(Color.cyan);

      page.setColor(Color.orange);
      page.fillRect(0,175,300,50);   //ground

      page.setColor(Color.yellow);
      page.fillOval(260,-40,80,80);  //sun I changed changed x val to move to sun to right

      page.setColor(Color.white);
      page.fillOval(MID-20, TOP,40,40);       //head
      page.fillOval(MID-35, TOP+35, 70, 50);  // upper torso
      page.fillOval(MID-50, TOP+80, 100, 60); // lower torso

      page.setColor(Color.black);
      page.fillOval(MID-10, TOP+10, 5,5);    //left eye
      page.fillOval(MID+5, TOP+10, 5,5);     //right eye

      page.drawArc(MID-10, TOP+20,20,10,10,160);  //smile I changed where arc selected 

      page.drawLine(MID-25, TOP+60, MID-50,TOP+40); //left arm
      page.drawLine(MID+25, TOP+60, MID+55, TOP+60); //right arm

      page.drawLine(MID-20, TOP+5, MID+20, TOP+5);  //brim of hat
      page.fillRect(MID-15, TOP-20, 30,25);         //top of hat
      // my stuff 
      page.setColor(Color.red);
      page.fillOval(MID-3, TOP+45, 5,5);//button red1
      page.fillOval(MID-3, TOP+55, 5,5);//button red2
      page.setColor(Color.black);
      page.fillOval(MID-3, TOP+65, 5,5);//button black1
      page.fillOval(MID-3, TOP+75, 5,5);//button black2
      page.drawString("Grant Merola",7,10);
      
      
      
    }
}