//© A+ Computer Science  -  www.apluscompsci.com
//Name - Sean Wangnick
//Date - 10/17/16
//Class - AP Computer Science
//Lab  - String Checker

import static java.lang.System.*;

public class StringChecker
{
	private String word;

	public StringChecker()
	{
		word = "";
	}

	public StringChecker(String s)
	{
		word = s;
	}

    public void setString(String s)
    {
   		word = s;
    }

	public boolean findLetter(char c) {
		if(word.indexOf(c) != -1) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public boolean findSubString(String s) {
		if(word.indexOf(s) != -1) {
			return true;
		}
		else {
			return false;
		}
	}

 	public String toString()
 	{
 		return "\n\n";
	}
}