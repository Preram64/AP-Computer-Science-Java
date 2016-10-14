//© A+ Computer Science  -  www.apluscompsci.com
//Name - Sean Wangnick
//Date - 9/27/16
//Class - Computer Science
//Lab  - StarsAndStripes

import static java.lang.System.*;

public class StarsAndStripes {
	
   // this is your default constructor
   // it gets called when you create the class in the
   // main program	
   public StarsAndStripes()
   {
   	  out.println("Sean Wangnick       APCS 2016");
   	  out.println();
   	  out.println();
      out.println("StarsAndStripes");
      printTwoBlankLines();
   }


   public void printTwentyStars()
   {
   		System.out.println("********************");
   }

   public void printTwentyDashes()
   {
   		System.out.println("--------------------");	
   }

   public void printTwoBlankLines()
   {
		System.out.println("\n");
   }
   
   public void printASmallBox()
   {
   		printTwentyDashes();
   		printTwentyStars();
   		printTwentyDashes();
   		printTwentyStars();
   		printTwentyDashes();
   		printTwentyStars();
   		printTwentyDashes();
   }
 
   public void printABigBox()
   { 	
		printTwentyDashes();
		printTwentyStars();
		printTwentyDashes();
		printTwentyStars();
		printTwentyDashes();
		printTwentyStars();
		printTwentyDashes();
		printTwentyDashes();
		printTwentyStars();
		printTwentyDashes();
		printTwentyStars();
		printTwentyDashes();
		printTwentyStars();
		printTwentyDashes();
   } 

   	  
}  // end of class StarsAndStripes
