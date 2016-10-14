//© A+ Computer Science  -  www.apluscompsci.com
//Name - Sean Wangnick
//Date - 9/28/16
//Class - AP Computer Science
//Lab  - SUM IT

public class Sum
{
	//instance variables
	private double one, two, sum;

	public void setNums(double num1, double num2)
	{
		one = num1;
		two = num2;
	}

	public void sum()
	{
		sum = one + two;
	}

	public void print()
	{
		System.out.printf("%.1f", one);
		System.out.printf(" + ");
		System.out.printf("%.1f", two);
		System.out.printf(" == ");
		System.out.printf("%.2f", sum);
		System.out.println("\n");
	}
}
