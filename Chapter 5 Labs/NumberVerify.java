//© A+ Computer Science  -  www.apluscompsci.com
//Name - Sean Wangnick
//Date - 10/19/16
//Class - AP Computer Science
//Lab  - Odd/Even (IF)

import static java.lang.System.*;

public class NumberVerify
{
    public static boolean isOdd( int num )
    {
 
            if( num % 2 == 1 || num % 2 == -1) {return true;}
            return false;
         
    }
    public static boolean isEven( int num )
    {
                
            if( num % 2 == 1 || num % 2 == -1) {return false;}
            return true;
    }  
}
