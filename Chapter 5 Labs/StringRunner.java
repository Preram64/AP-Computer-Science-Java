//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date - 
//Class -
//Lab  -

import static java.lang.System.*;
import java.util.Scanner;

public class StringRunnerv
{
	public static void main ( String[] args )
	{
		Scanner keyboard = new Scanner (System.in);
		out.print("Enter a word :: ");
		
		String word = keyboard.next();
		StringOddOrEven demo = new StringOddOrEven(word);
		out.println(demo);
		
		out.print("Enter a word :: ");
		keyboard.next();
		out.println(demo);
		
		out.print("Enter a word :: ");
		keyboard.next();
		out.println(demo);
		
		out.print("Enter a word :: ");
		keyboard.next();
		out.println(demo);
		
		out.print("Enter a word :: ");
		keyboard.next();
		out.println(demo);
		
		out.print("Enter a word :: ");
		keyboard.next();
		out.println(demo);
		
		out.print("Enter a word :: ");
		keyboard.next();
		out.println(demo);
		
		out.print("Enter a word :: ");
		keyboard.next();
		out.println(demo);
	}
}
