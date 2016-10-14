//© A+ Computer Science  -  www.apluscompsci.com
//Name - Sean Wangnick
//Date - 9/30/16
//Class - AP Computer Science
//Lab  - Slope Of A Line

public class Line
{
	private double xOne,yOne, xTwo, yTwo;
	private double slope;

	public Line(int x1, int y1, int x2, int y2)
	{
		xOne = x1;
		yOne = y1;
		xTwo = x2;
		yTwo = y2;
	}

	public void setCoordinates(int x1, int y1, int x2, int y2)
	{
		xOne = x1;
		yOne = y1;
		xTwo = x2;
		yTwo = y2;
	}

	public void calculateSlope( )
	{
		slope = (yTwo - yOne) / (xTwo - xOne);
	}

	public void print( )
	{
		System.out.print("The slope is ");
		System.out.printf("%.2f", slope);
		System.out.print("\n\n");
	}
}