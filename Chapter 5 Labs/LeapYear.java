//© A+ Computer Science  -  www.apluscompsci.com
//Name - Sean Wangnick
//Date - 10/19/16
//Lab  - Leap Year

import static java.lang.System.*; 
import java.util.Scanner;

public class LeapYear
{
	public static boolean isLeapYear( int year )
	{
		if (year % 4 == 0 || year % 400 == 0) {
			return true;
		} else {
			return false;
		}
	}
}