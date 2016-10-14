//© A+ Computer Science  -  www.apluscompsci.com
//Name - Sean Wangnick
//Date - 9/29/16
//Class - AP Computer Science
//Lab  - Surface Area Of A Cube

public class Cube
{
	private double side;
	private double surfaceArea;

	public void setSide(int s)
	{
		side = s;
	}

	public void calculateSurfaceArea( )
	{
		surfaceArea = 6 * Math.pow(side,2);
	}

	public void print( )
	{
		System.out.print("The surface area is :: ");
		System.out.printf("%.0f", surfaceArea);
		System.out.print("\n\n\n");
	}
}