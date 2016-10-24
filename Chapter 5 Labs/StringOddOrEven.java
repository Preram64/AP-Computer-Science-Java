//© A+ Computer Science  -  www.apluscompsci.com
//Name - Sean Wangnick
//Date - 10/24/16
//Class - AP Computer Science
//Lab  - Odd/Even String

import static java.lang.System.*;
import java.util.Scanner;

public class StringOddOrEven
{
	private String word;

	public StringOddOrEven()
	{
		setString("");
	}
	
	public StringOddOrEven(String s)
	{
		setString(s);		
	}

	public void setString(String s)
	{
		word=s;
		
	}

 	public boolean isEven()
 	{
 		if (word.length()%2==0)
 			return true;
 		else
		return false;
	}

 	public String toString()
 	{
 		String output=word+" is ";
 		
 		if (isEven())
 			output+="even.";
 		else
 			output+="odd.";
 		
 		return output;
	}
}