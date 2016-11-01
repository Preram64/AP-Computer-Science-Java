//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*; 

public class Grade
{
	// instance variable (or attribute, property, field)
	private int numGrade;


	// default constructor (SAME NAME AS THE CLASS)
	//    to set your instance variable
	//    to a beginning default value
	public Grade()
	{
		
	}


	// initializer constructor (SAME NAME AS THE CLASS)
	//    to set your instance variable
	//    to a beginning value
	// when another class calls our constructor, a
	// temporary variable grade is created and
	// receives a new grade value to store in the
	// instance variable numGrade
	public Grade(int grade)
	{
		
	}


	// modifier or setter method 
	//    to modify or set your instance variable
	//    to a new value
	// temporary variable grade is created and
	// receives a new grade to store in your
	// instance variable numGrade
	public void setGrade(int grade)
	{
		
	}


	// DO NOT USE out.println or out.print statements
	// in this method!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
	//     the purpose of this method is to find the
	//     letter grade and return it
	// NOTE: you return the letter grade as a String
	public String getLetterGrade( )
	{
		String letGrade="";
		
		// DO NOT USE out.println or out.print statements
		// in this method!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
		
		// use an if else if else if ... statement
		//    in order to find the letter grade
		
		// if (numGrade >= 90)
		//     letGrade = "A";
		// else if (numGrade >= 80)
		//     letGrade = ???;
		
		
		
		
		
		
		return letGrade;
	}


	// this method has been done for you
	public String toString()
	{
		return numGrade + " is a " + getLetterGrade();
	}
}