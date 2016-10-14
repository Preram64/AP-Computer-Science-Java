//© A+ Computer Science  -  www.apluscompsci.com
//Name - Sean Wangnick
//Date - 9/29/16
//Class - AP Computer Science
//Lab  - Rectangle Perimeter

public class Rectangle
{
	private int length;
	private int width;
	private int perimeter;

	public void setLengthWidth(int len, int wid )
	{
		length=len;
		width=wid;
	}

	public void calculatePerimeter( )
	{
		perimeter = 2*length + 2*width;
	}

	public void print( )
	{
		System.out.print("The perimeter is :: ");
		System.out.print(perimeter);
		System.out.println("\n\n");
	}
}
