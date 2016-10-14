//© A+ Computer Science  -  www.apluscompsci.com
//Name - Sean Wangnick
//Date - 10/6/16
//Class - AP Computer Science
//Lab  - Adding Strings

import static java.lang.System.*;

public class AddStrings
{
   private String first, last;
   private String sum;

   public AddStrings()
   {
   		first = "";
   		last = "";
   }

   public AddStrings(String one, String two)
   {
		first = one;
		last = two;
   }

   public void setStrings(String one, String two)
   {
   		first = one;
		last = two;
   }

 	public void add( )
 	{
 		sum = first + " " + last;
	}

 	public String toString()
 	{
 		String output = "first :: " + first + "\n" + "last :: " + last + "\n" + "sum :: " + sum + "\n\n\n";
 		return output;
	}
}