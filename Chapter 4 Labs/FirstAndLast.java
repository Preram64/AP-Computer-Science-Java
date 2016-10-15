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

	public String getFirst()
	{
		return word.charAt(0);
	}
	
	public String getLast()
	{
		return word.charAt(1);
	}

 	public String toString()
 	{
 		String output="";
 		return output;
	}
}