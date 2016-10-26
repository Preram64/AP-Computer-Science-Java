//© A+ Computer Science  -  www.apluscompsci.com
//Name - Sean Wangnick
//Date - 10/26/16
//Class - AP Computer Science
//Lab  - Distance Formula

import java.util.Scanner;
import static java.lang.System.*;
import static java.lang.Math.*;

public class Distance
{
	private int x1,y1,x2,y2;

	public Distance()
	{
		x1 = 0;
		y1 = 0;
		x2 = 0;
		y2 = 0;
	}

	public Distance(int xOne, int yOne, int xTwo, int yTwo)
	{
		x1 = xOne;
		y1 = yOne;
		x2 = xTwo;
		y2 = yTwo;
	}

	public void setCoordinates(int xOne, int yOne, int xTwo, int yTwo)
	{
		x1 = xOne;
		y1 = yOne;
		x2 = xTwo;
		y2 = yTwo;
	}

	public String determineClosest( )
	{
		double distanceA = 0.0, distanceB = 0.0;
		String result="";
		
		//distanceA = x1 + y1;
		//distanceB = x2 + y2;
		
		distanceA = Math.sqrt((x1 * x1) + (y1 * y1));
		distanceB = Math.sqrt((x2 * x2) + (y2 * y2));
		
		if (distanceA < distanceB) {
			result = "\nA is closer to (0,0).\n\n\n\n";
		} else if (distanceA > distanceB) {
			result = "\nB is closer to (0,0).\n\n\n\n";
		}
		
		return result;
	}
	
	public String toString()
	{
		return "";
	}
}