//© A+ Computer Science  -  www.apluscompsci.com
//Name - Sean Wangnick
//Date - 9/30/16
//Class - AP Computer Science
//Lab  - Celsius To Fahrenheit

public class Fahrenheit
{
	private double fahrenheit;

	public void setFahrenheit(double fahren)
	{
		fahrenheit = fahren;
	}

	public double getCelsius()
	{
		double celsius = 0.0;
		double middle = 0.0;
		middle = fahrenheit - 32;
		celsius = middle * 5/9;
		return celsius;
	}

	public void print()
	{
		System.out.printf("%.2f", fahrenheit);
		System.out.print(" degrees Fahrenheit == ");
		System.out.printf("%.2f", getCelsius());
		System.out.print(" degrees Celsius");
		System.out.print("\n\n\n");
	}
}