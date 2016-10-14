//© A+ Computer Science  -  www.apluscompsci.com
//Name - Sean Wangnick
//Date - 9/19/16
//Class - AP Computer Science
//Lab  - Big House

import java.awt.Graphics;
import java.awt.Color;
import java.awt.Canvas;

public class BigHouse extends Canvas
{
   public BigHouse()  //constructor - sets up the class
   {
      setSize(800,600);
      setBackground(Color.WHITE);
      setVisible(true);
   }

   public void paint( Graphics window )
   {
   	  bigHouse(window);
   	  window.setColor(Color.RED);
   	  window.drawString("Sean Wangnick   APCS 2016",10,40);
      
      
   }


   public void bigHouse( Graphics window )
   {
   	  //Meta
   	  
      window.setColor(Color.BLUE);
      window.drawString( "BIG HOUSE ", 50, 50 );
      window.setColor(Color.BLUE);
      window.fillRect( 200, 200, 400, 400 );

	  //Roof
	  
	  window.setColor(Color.GREEN);
	  window.fillRect(100, 100, 600, 100);
	  
	  //Windows
	  
	  window.setColor(Color.YELLOW);
	  window.fillRect(275, 300, 75, 75);
	  window.fillRect(450, 300, 75, 75);
	  
	  //Door
	  
	  window.setColor(Color.WHITE);
	  window.fillRect(350, 450, 100, 200);
   }
}