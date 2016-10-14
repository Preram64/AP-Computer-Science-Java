//(c) A+ Computer Science
// www.apluscompsci.com

//graphics example for circles/ovals

import java.awt.Graphics;
import java.awt.Color;
import java.awt.Canvas;

public class Circles extends Canvas
{
	public Circles()
	{
		setBackground(Color.WHITE);
	}

	public void paint( Graphics window )
	{
		window.setColor(Color.BLACK);
		window.drawString("Circles - Ovals", 50, 50);

		window.setColor(Color.MAGENTA);

		//drawOval(int x1, int y1, int width, int height)
		window.drawOval(500,300,40,40);

		window.setColor(Color.BLUE);
		window.drawOval(400,100,1000,500);

		window.setColor(Color.YELLOW);
		window.fillOval(250,250,90,90);

		window.setColor(Color.RED);
		window.fillOval(50,150,50,50);

		window.setColor(Color.BLUE);
		window.fillOval(150,350,120,80);
	}
}