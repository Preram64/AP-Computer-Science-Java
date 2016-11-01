//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*; 

// IMPORTANT:
// Read the comments!!!!!!!!!!!!!!!!!!!!!!!!!!!!
// You can learn a lot from reading the comments

public class HexToBinary
{
	// instance variable hex that holds a single char value
	// all methods have access to the instance variable(s)
	private char hex;



	// default constructor (SAME NAME AS THE CLASS)
	//    to set your instance variable hex
	//    to a beginning default value
	public HexToBinary()
	{


	}


	// initializer constructor  (SAME NAME AS THE CLASS)
	//    to set your instance variable hex
	//    to a beginning value
	// when another class calls our constructor, a
	// temporary variable hexNum is created and
	// receives a new character value to store in the
	// instance variable hex	
	public HexToBinary(char hexNum)
	{


	}// end of constructor, hexNum is destroyed



	// modifier or setter method 
	//    to modify or set your instance variable
	//    to a new value
	// temporary variable hexNum is created and
	// receives a new character value to store in your
	// instance variable hex
	public void setHex(char hexNum)
	{


	} // end of method, hexNum is destroyed



	// DO NOT USE out.println or out.print statements
	// in this method!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
	//     the purpose of this method is to find the
	//     binary value of hex as a String and return it
	// NOTE: you return the binary value of hex as a String
	public String getBinary()
	{
		String binaryValue = "";
		
		// we could have used an if else if else if ...
		// but we will use a switch statement instead
		
		switch (???)
		{
			// is hex == 'A' ???
			// if so, binaryValue is set to "1010" and we break
			//    out of the switch statement
			case 'A' : binaryValue = "????"; break;
			
			
			
			default  : binaryValue = "Error";
		}

		return "";
	}


	// DO NOT USE out.println or out.print statements
	// in this method!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
	//     the purpose of this method is to return 
	//     the output as a String
	public String toString()
	{
		// look at your doc to see what should be returned
		
		// DO NOT USE out.println or out.print statements
		// in this method!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
		// ??? should be replaced with your instance variable
		// ????? should be replaced with a method call
		
		return ??? + " is " + ????? + " in binary!";
	}
}