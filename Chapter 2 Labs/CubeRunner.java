//© A+ Computer Science  -  www.apluscompsci.com
//Name - Sean Wangnick
//Date - 9/29/16
//Class - AP Computer Science
//Lab  - Surface Area Of A Cube

public class CubeRunner
{
	public static void main( String[] args )
   {
		Cube test = new Cube();
	 	
	 	test.setSide(112);
	 	test.calculateSurfaceArea();
	 	test.print();
	 	
	 	test.setSide(4);
	 	test.calculateSurfaceArea();
	 	test.print();
	 	
	 	test.setSide(33);
	 	test.calculateSurfaceArea();
	 	test.print();
	 	
	 	test.setSide(50);
	 	test.calculateSurfaceArea();
	 	test.print();
	 	
	 	test.setSide(5);
	 	test.calculateSurfaceArea();
	 	test.print();
	 	
	 	test.setSide(19);
	 	test.calculateSurfaceArea();
	 	test.print();

	}
}