//© A+ Computer Science  -  www.apluscompsci.com
//Name - Sean Wangnick
//Date - 10/17/16
//Class - AP Computer Science
//Lab  - String Ripper

import static java.lang.System.*;

public class StringRipper
{
	private String word;
	
	public StringRipper()
	{
		word = "";
	}

	public StringRipper(String s)
	{
		word = s;
	}
	
   public void setString(String s)
   {
   		word = s;
   }	

	public String ripString(int x, int y)
	{
		return word.substring(x, y);
	}

 	public String toString()
 	{
 		return "";
	}
}