//© A+ Computer Science  -  www.apluscompsci.com
//Name - Sean Wangnick
//Date - 9/20/16
//Class - AP Computer Science
//Lab  - Robot

import java.awt.Graphics;
import java.awt.Color;
import java.awt.Canvas;

class Robot extends Canvas
{
   public Robot()    //constructor method - sets up the class
   {
      setSize(800,600);
      setBackground(Color.WHITE);   	
      setVisible(true);
   }

   public void paint( Graphics window )
   {
   	  window.setColor(Color.RED);
   	  window.drawString("Sean Wangnick     APCS 2016",10,40);

      window.setColor(Color.BLUE);

      window.drawString("Robot LAB ", 10, 75 );

      head(window);
      upperBody(window);
      lowerBody(window);
      
   }

   public void head( Graphics window )
   {
      	window.setColor(Color.YELLOW);
      	window.fillOval(300, 100, 200, 100);
      	window.setColor(Color.GREEN);
      	window.fillOval(330, 120, 25, 25);
      	window.fillOval(445, 120, 25, 25);
      	window.setColor(Color.BLACK);
      	window.fillOval(390, 145, 20, 10);
      	window.setColor(Color.RED);
      	window.drawArc(340, 140, 120, 50, 180, 180);
				
   }

   public void upperBody( Graphics window )
   {
   		window.setColor(Color.BLACK);
   		window.drawLine(200, 170, 330, 230);
   		window.drawLine(470, 230, 600, 170);
   		window.setColor(Color.BLUE);
   		window.fillRect(330, 230, 140, 80);
   		window.setColor(Color.YELLOW);
   		window.drawLine(330, 230, 470, 230);
   		window.drawLine(470, 230, 470, 310);
   		window.drawLine(330, 230, 330, 310);
   		window.drawLine(330, 310, 470, 310);
   }

   public void lowerBody( Graphics window )
   {
   		window.setColor(Color.GRAY);
   		window.fillRect(330, 320, 140, 80);
   		window.setColor(Color.YELLOW);
   		window.drawLine(330, 320, 470, 320);
   		window.drawLine(470, 320, 470, 400);
   		window.drawLine(330, 320, 330, 400);
   		window.drawLine(330, 400, 470, 400);
   		window.setColor(Color.BLACK);
   		window.drawLine(200, 550, 330, 400);
   		window.drawLine(470, 400, 600, 550);
   }
}