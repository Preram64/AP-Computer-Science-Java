//© A+ Computer Science  -  www.apluscompsci.com
//Name - Sean Wangnick
//Date - 9/30/16
//Class - AP Computer Science
//Lab  - Area Of A Circle

public class Circle
{
	private double radius;
	private double area;

	public void setRadius(double rad)
	{
		radius = rad;
	}

	public void calculateArea()
	{
		area = Math.PI * Math.pow(radius, 2);
	}

	public void print()
	{
		System.out.print("The area is :: ");
		System.out.printf("%.4f", area);
		System.out.print("\n\n\n");
	}
}