//© A+ Computer Science  -  www.apluscompsci.com
//Name - Sean Wangnick
//Date - 10/24/16
//Class - AP Computer Science
//Lab  - Odd/Even String

import static java.lang.System.*;
import java.util.Scanner;

public class StringRunner
{
	public static void main ( String[] args )
	{
		StringOddOrEven obj = new StringOddOrEven();
		int whileLoop=0;
		Scanner keyboard = new  Scanner(System.in);
		
		while (whileLoop<=7){
		out.print("Enter a word :: ");
		
		String strWord = keyboard.next(); 
		
			obj.setString(strWord);
		out.println(obj);
		
		out.println();
		whileLoop++;
		 }				
	}
}