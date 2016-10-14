//© A+ Computer Science  -  www.apluscompsci.com
//Name - Sean Wangnick
//Date - 10/3/16
//Class - AP Computer Science
//Lab  - Heron's Formula

import java.util.Scanner; 
import java.lang.Math.*;

public class Triangle
{
	private int sideA, sideB, sideC;
	private double perimeter;
	private double theArea;

	public Triangle()
	{
	   setSides(0,0,0);
	   perimeter=0;
	   theArea=0;
	}

	public Triangle(int a, int b, int c)
	{
		sideA = a;
		sideB = b;
		sideC = c;
	}


	public void setSides(int a, int b, int c)
	{
		sideA = a;
		sideB = b;
		sideC = c;
	}

	public void calcPerimeter( )
	{
		perimeter = sideA + sideB + sideC;
	}

	public void calcArea( )
	{
		double s;
		
		s = perimeter / 2;
		theArea = Math.sqrt(s*(s-sideA)*(s-sideB)*(s-sideC));
	}

	public void print( )
	{
		System.out.print("\n\n");
		System.out.print(sideA);
		System.out.print(" ");
		System.out.print(sideB);
		System.out.print(" ");
		System.out.print(sideC);
		System.out.print("\n");
		System.out.print("Area == ");
		System.out.printf("%.5f", theArea);
		System.out.print("\n\n\n\n");
	}
}