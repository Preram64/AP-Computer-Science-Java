//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*; 

public class Decoder
{
	// instance variable (attribute, property, field)
	private char letter;

	
	// default constructor (SAME NAME AS THE CLASS)
	//    to set your instance variable
	//    to a beginning default value
	public Decoder()
	{


	}

	
	// initializer constructor (SAME NAME AS THE CLASS)
	//    to set your instance variable
	//    to a beginning value
	// when another class calls our constructor, a
	// temporary variable let is created and
	// receives a new character value to store in the
	// instance variable letter
	public Decoder(char let)
	{


	}

	// modifier or setter method 
	//    to modify or set your instance variable
	//    to a new value
	// temporary variable let is created and
	// receives a new character to store in your
	// instance variable letter
	public void setLetter(char let)
	{


	}


	// look at the docs to see what needs to be returned
	// Remember 'A' is 65
	//          'a' is 97
	//          Note that they differ by 32
	//          '0' is 48
	//          These characters differ by 17 (48 to 65)
	public char deCode()
	{
		char result=0;

		if (letter >= 'a' && letter <= 'z')
			result = (char) (letter - 32);		
		// else if ????
		//     result = ????	
		// add all checks



		return result;
	}


	public String toString()
	{
		// look at your doc to see what should be returned
		
		// DO NOT USE out.println or out.print statements
		// in this method!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
		// ??? should be replaced with your instance variable
		// ???? should be replaced with a method call
		
		return ??? + " decodes to " + ????;  // change me

	} // end marker for the method toString()
	
	
}  // end marker for the class Decoder

