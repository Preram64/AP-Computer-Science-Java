//© A+ Computer Science  -  www.apluscompsci.com
//Name - Sean Wangnick
//Date - 10/17/16
//Class - AP Computer Science
//Lab  - String Name

import static java.lang.System.*;

public class Name
{
	private String name;

	public Name()
	{
		name = "";
	}

	public Name(String s)
	{
		name = s;
	}

    public void setName(String s)
    {
    	name = s;
    }

	public String getFirst()
	{
		return name.substring(0, name.indexOf(" "));
	}

	public String getLast()
	{
		return name.substring(name.indexOf(" ") + 1, name.length());
	}
	
	public void getName() {
		System.out.println(name + "\n\n");
	}

 	public String toString()
 	{
 		return "";
	}
}