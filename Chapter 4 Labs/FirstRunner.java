//� A+ Computer Science  -  www.apluscompsci.com
//Name - Sean Wangnick
//Date - 10/14/16
//Class - AP Computer Science
//Lab  - Start And End String

import static java.lang.System.*;

public class FirstRunner
{
	public static void main ( String[] args )
	{
		FirstAndLast demo = new FirstAndLast("Hello");
		demo.setString("Hello");
		System.out.println( "first letter :: " + demo.getFirst() );
		System.out.println( "last letter :: " + demo.getLast() );
		
		FirstAndLast demo2 = new FirstAndLast("UIL");
		demo.setString("UIL");
		System.out.println( "first letter :: " + demo2.getFirst() );
		System.out.println( "last letter :: " + demo2.getLast() );
		
		FirstAndLast demo3 = new FirstAndLast("Hello");
		System.out.println( "first letter :: " + demo3.getFirst() );
		System.out.println( "last letter :: " + demo3.getLast() );
		
		FirstAndLast demo4 = new FirstAndLast("Hello");
		System.out.println( "first letter :: " + demo4.getFirst() );
		System.out.println( "last letter :: " + demo4.getLast() );
		
		FirstAndLast demo5 = new FirstAndLast("Hello");
		System.out.println( "first letter :: " + demo5.getFirst() );
		System.out.println( "last letter :: " + demo5.getLast() );
		
	}
}