//© A+ Computer Science  -  www.apluscompsci.com
//Name - Sean Wangnick
//Date - 10/5/16
//Class - AP Computer Science
//Lab  - Quadratic Formula

import java.util.Scanner; 
import static java.lang.System.*;
import static java.lang.Math.*;

public class Quadratic
{
	private int a, b, c;
	private double rootOne;
	private double rootTwo;

	public Quadratic()
	{
		a = 0;
		b = 0;
		c = 0;
	}

	public Quadratic(int quadA, int quadB, int quadC)
	{
		a = quadA;
		b = quadB;
		c = quadC;
	}

	public void setEquation(int quadA, int quadB, int quadC)
	{
		a = quadA;
		b = quadB;
		c = quadC;
 	}

	public void calcRoot1()
	{
		double numerator;
		double denominator;
		double sqrt;
		
		sqrt = Math.sqrt((Math.pow(b, 2)) - 4 * a * c);
		numerator = -b + sqrt;
		denominator = 2 * a;
		
		rootOne = numerator / denominator;
	}

	public void calcRoot2()
	{
		double numerator;
		double denominator;
		double sqrt;
		
		sqrt = Math.sqrt((Math.pow(b, 2)) - 4 * a * c);
		numerator = -b - sqrt;
		denominator = 2 * a;
		
		rootTwo = numerator / denominator;
	}
	
	public void print( )
	{
		System.out.print("\nrootone :: ");
		System.out.printf("%.2f", rootOne);
		System.out.print("\n");
		System.out.print("roottwo :: ");
		System.out.printf("%.2f", rootTwo);
		System.out.print("\n\n\n");
	}
}