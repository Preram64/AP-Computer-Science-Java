//© A+ Computer Science  -  www.apluscompsci.com
//Name - Sean Wangnick
//Date - 9/29/16
//Class - AP Computer Science
//Lab  - Num Average

public class Average
{
	//instance variables
	private double one, two, average;

	public void setNums(double num1, double num2)
	{
		one = num1;
		two = num2;
	}

	public void average( )
	{
		double sum = 0;
		sum = one + two;
		average = sum / 2;
	}
	public void print( )
	{
		System.out.printf("%.1f", one);
		System.out.print(" + ");
		System.out.printf("%.1f", two);
		System.out.print(" has an average of ");
		System.out.printf("%.2f", average);
		System.out.println("\n");
	}
}