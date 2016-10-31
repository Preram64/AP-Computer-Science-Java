//© A+ Computer Science  -  www.apluscompsci.com
//Name - Sean Wangnick
//Date - 10/26/16
//Lab  - String Ends With

import static java.lang.System.*; 
import java.util.Scanner;

public class StringUtilities
{
 	public static boolean endsWith(String a, String b)
 	{
 		String one = a;
 		String two = b;
 		//String aEnding = indexOf(b);
 		
 		if (two.equals (one.substring(one.charAt(5)))) {
 			return true;
 		}
 		
 		return false;
 	}
}
