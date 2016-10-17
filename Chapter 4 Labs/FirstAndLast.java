//© A+ Computer Science  -  www.apluscompsci.com
//Name - Sean Wangnick
//Date - 10/14/16
//Class - AP Computer Science
//Lab  - Start And End String

import static java.lang.System.*;

public class FirstAndLast
{
	private String word;

	public FirstAndLast(String s)
	{
		word = s;
	}

	public void setString(String s)
	{
		word = s;
	}

	public char getFirst()
	{
		return word.charAt(0);
	}
	
	public char getLast()
	{
		return word.charAt(word.length() -1);
	}

 	public String toString()
 	{
 		String output="";
 		return output;
	}
	
	public void Word() {
		System.out.println("\n\nword :: " + word);
	}
}