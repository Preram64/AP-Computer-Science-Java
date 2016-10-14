//© A+ Computer Science  -  www.apluscompsci.com
//Name - Sean Wangnick
//Date - 9/28/16
//Class - AP Computer Science
//Lab  - SUM IT

public class SumRunner
{
	public static void main( String[] args )
	{
		Sum test = new Sum();
		test.setNums(5, 5);
		test.sum();
		test.print();

		test.setNums(90, 100.0);
		test.sum();
		test.print();
		
		test.setNums(100.5, 85.5);
		test.sum();
		test.print();
		
		test.setNums(-100, 55);
		test.sum();
		test.print();
		
		test.setNums(15236, 5642);
		test.sum();
		test.print();
		
		test.setNums(1000, 555);
		test.sum();
		test.print();

		//add more test cases
		
	}
}