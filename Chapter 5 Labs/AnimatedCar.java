//© A+ Computer Science  -  www.apluscompsci.com
//Name - Sean Wangnick
//Date - 10/28/16
//Class - AP Computer Science
//Lab  - Animated Car

import java.awt.Graphics;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.Timer;
import javax.swing.JFrame;
import java.awt.Canvas;

class AnimatedCar extends Canvas
{
	private int x=0;
	private int y;
	private Timer timer;
	private final static int SLEEP = 100;  //bigger # = slower animation	
	
	public AnimatedCar(int width, int heigth)
	{
		setSize(width, heigth);
		setVisible(true);
		setBackground(Color.BLACK);
		
		x = 70;
		y = 0;

		ActionListener paintCaller = new ActionListener(){
			public void actionPerformed(ActionEvent event)
			{
				repaint();  //each time timer fires it will call paint
			}
		};
		timer = new Timer(SLEEP, paintCaller);
		timer.start();
	}

   public void paint( Graphics window )
   {
      window.setColor(Color.BLUE);
	  rectangle(window);
	  wheels(window);
	  if (x<=getWidth()){
	  	x+=50;
	  } else {
	  	x=200;
	  }
      // call head method and pass it window
      
      
      // call other methods and pass it window
      
      
   }
   
   public void rectangle( Graphics window )
   {	
   		window.setColor(Color.GREEN);
        window.fillRect(x,y+50,100,40);
   }

   public void wheels( Graphics window )
   {
   		window.setColor(Color.BLUE);
		window.fillOval(x-10,y+70,50,50);
		window.fillOval(x+80,y+70,50,50);
		// add more code here

   }
}