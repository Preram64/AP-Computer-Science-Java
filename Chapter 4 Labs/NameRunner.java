//© A+ Computer Science  -  www.apluscompsci.com
//Name - Sean Wangnick
//Date - 10/17/16
//Class - AP Computer Science
//Lab  - String Name

import static java.lang.System.*;

public class NameRunner
{
	public static void main ( String[] args )
	{
		Name person = new Name("Sally Baker");
		System.out.println(person.getFirst());
		System.out.println(person.getLast());
		person.getName();

		person.setName("John Doe");
		System.out.println(person.getFirst());
		System.out.println(person.getLast());
		person.getName();

		person.setName("Sammy Lammy");
		System.out.println(person.getFirst());
		System.out.println(person.getLast());
		person.getName();

		person.setName("Benny Programmer");
		System.out.println(person.getFirst());
		System.out.println(person.getLast());
		person.getName();

		person.setName("Sandy Painter");
		System.out.println(person.getFirst());
		System.out.println(person.getLast());
		person.getName();
	}
}