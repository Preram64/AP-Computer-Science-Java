//© A+ Computer Science  -  www.apluscompsci.com
//Name - Sean Wangnick
//Date - 9/27/16
//Class - Comp Sci
//Lab  - Shape

import java.awt.Color;
import java.awt.Graphics;

public class Shape
{
   //instance variables
	private int xPos;
	private int yPos;
	private int width;
	private int height;
	private Color color;
	private String string;

   public Shape(int x, int y, int wid, int ht, Color col)
   {
		xPos = x;
		yPos = y;
		width = wid;
		height = ht;
		color = col;
		
		// finish this constructor 
		// by assigning values to your instance variables
		
		
		
   }


   public void draw(Graphics window)
   {
      window.setColor(Color.RED);
      window.drawString("Sean Wangnick     APCS 2016",10,40);
      
      window.setColor(Color.YELLOW);
      window.fillOval(200, 100, 400, 400);
      window.setColor(Color.BLACK);
      window.drawOval(200, 100, 400, 400);
      
      window.setColor(Color.RED);
      window.fillOval(450, 150, 50, 50);
      window.fillOval(270, 160, 50, 50);
      window.fillOval(340, 310, 50, 50);
      window.fillOval(300, 240, 50, 50);
      window.fillOval(260, 380, 50, 50);
      window.fillOval(510, 200, 50, 50);
      window.fillOval(400, 300, 50, 50);
      window.fillOval(520, 360, 50, 50);
      window.fillOval(460, 390, 50, 50);
      window.fillOval(390, 230, 50, 50);
      window.fillOval(340, 380, 50, 50);
      window.fillOval(500, 280, 50, 50);
      window.fillOval(350, 150, 50, 50);
      window.fillOval(240, 320, 50, 50);
      
      window.setColor(Color.GREEN);
      window.drawString("Pepperoni Pizza!", 600, 120);
      

      // draw whatever you want
      // You will need to use Graphics routines like
      //    window.drawRect(...);
      //    window.drawOval(...);
      //    window.drawLine(...);
      //    window.drawString(...);
      //    and any others
      // The ... indicates that you need to supply the parameters
      //    ^
      
     

   }




   public String toString()
   {
   	return xPos+" "+yPos+" "+width+" "+height+" "+color;
   }
}