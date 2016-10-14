//© A+ Computer Science  -  www.apluscompsci.com
//Name - Sean Wangnick
//Date - 10/6/16
//Class - AP Computer Science
//Lab  - Adding Strings

import static java.lang.System.*;

public class AddRunner
{
	public static void main ( String[] args )
	{
		AddStrings demo = new AddStrings("hello","world");
		//demo.addStrings();
		demo.add();
		out.println(demo);

		demo.setStrings("jim","bob");
		demo.add();
		out.println(demo);

		demo.setStrings("sally","sue");
		demo.add();
		out.println(demo);
		
		demo.setStrings("computer","science");
		demo.add();
		out.println(demo);	
			
		demo.setStrings("uil","contests");
		demo.add();
		out.println(demo);
	}
}