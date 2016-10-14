//© A+ Computer Science  -  www.apluscompsci.com
//Name - Sean Wangnick
//Date - 9/19/16
//Class - AP Computer Science
//Lab  - Smiley Face

import java.awt.Graphics;
import java.awt.Color;
import java.awt.Canvas;

public class SmileyFace extends Canvas
{
   public SmileyFace()    //constructor - sets up the class
   {
      setSize(800,600);
      setBackground(Color.WHITE);
      setVisible(true);
   }

   public void paint( Graphics window )
   {
      smileyFace(window);
   }

   public void smileyFace( Graphics window )
   {
   	//Meta
   	  window.setColor(Color.RED);
   	  window.drawString("Sean Wangnick    APCS 2016",10,40);
      window.setColor(Color.BLUE);
      window.drawString("SMILEY FACE LAB ", 10, 75);

	//Circle
      window.setColor(Color.YELLOW);
      window.fillOval( 210, 100, 400, 400 );
	  
	//Eyes
	  window.setColor(Color.GREEN);
	  window.fillOval(275, 200, 75, 50);
	  window.fillOval(450, 200, 75, 50);
	  
	//Nose
	  window.setColor(Color.BLACK);
	  window.fillOval(382, 275, 50, 50);
	  
	//Smile
	  window.setColor(Color.RED);
	  window.drawArc(325, 350, 175, 50, 180, 180);
	


   }
}