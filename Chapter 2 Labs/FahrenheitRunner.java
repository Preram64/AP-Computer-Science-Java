//© A+ Computer Science  -  www.apluscompsci.com
//Name - Sean Wangnick
//Date - 9/30/16
//Class - AP Computer Science
//Lab  - Celsius To Fahrenheit

public class FahrenheitRunner
{
	public static void main( String[] args )
	{
		Fahrenheit temps = new Fahrenheit();
		
		temps.setFahrenheit(98.6);
		temps.getCelsius();
		temps.print();
		
		temps.setFahrenheit(52.30);
		temps.getCelsius();
		temps.print();
		
		temps.setFahrenheit(82.45);
		temps.getCelsius();
		temps.print();
		
		temps.setFahrenheit(75.00);
		temps.getCelsius();
		temps.print();
		
		temps.setFahrenheit(100.00);
		temps.getCelsius();
		temps.print();			
	}
}