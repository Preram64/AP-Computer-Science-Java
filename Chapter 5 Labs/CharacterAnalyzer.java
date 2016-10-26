//© A+ Computer Science  -  www.apluscompsci.com
//Name - Sean Wangnick
//Date - 10/25/16
//Class - AP Computer Science
//Lab  - Character Analyzer

import static java.lang.System.*;
import java.util.Scanner;

public class CharacterAnalyzer
{
	private char theChar;

	public CharacterAnalyzer()
	{
		theChar = '-';
	}

	public CharacterAnalyzer(char c)
	{
		theChar = c;
	}

	public void setChar(char c)
	{
		theChar = c;
	}

	public char getChar()
	{
		return theChar;
	}

	public boolean isUpper( )
	{
		if (theChar > 64 && theChar < 91) {
			return true;
		} else {
			return false;
		}
	}

	public boolean isLower( )
	{
		if (theChar > 96 && theChar < 123) {
			return true;
		} else {
			return false;
		}
	}
	
	public boolean isNumber( )
	{
		if (theChar > 47 && theChar < 58) {
			return true;
		} else {
			return false;
		}
	}	

	public int getASCII( )
	{
		return theChar;
	}

	public String toString()
	{
		if (isUpper() == true) {
			return "" + getChar() + " is an uppercase character. ASCII == " + getASCII() + "\n";
		} else if (isLower() == true) {
			return "" + getChar() + " is a lowercase character. ASCII == " + getASCII() + "\n";
		} else if (isNumber() == true) {
			return "" + getChar() + " is a number. ASCII == " + getASCII() + "\n";
		}
		return "";
	}
}