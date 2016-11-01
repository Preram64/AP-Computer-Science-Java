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
 		if (b.equals(a.substring(a.length() - b.length()))) {
 			return true;
 		}
 		
 		return false;
 	}
}
