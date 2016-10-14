//© A+ Computer Science  -  www.apluscompsci.com
//Name - Sean Wangnick
//Date - 10/5/16
//Class - AP Computer Science
//Lab  - Quadratic Formula

import java.util.Scanner; 
import static java.lang.System.*;
import static java.lang.Math.*;

public class QuadraticRunner
{
	public static void main( String[] args )
    {
    	Scanner keyboard = new Scanner(System.in);
    	
    	System.out.print("Enter a :: ");
    	int a = keyboard.nextInt();
    	
    	System.out.print("Enter b :: ");
    	int b = keyboard.nextInt();
    	
    	System.out.print("Enter c :: ");
    	int c = keyboard.nextInt();
    	
    	Quadratic test = new Quadratic();
    	//test.Quadratic();
    	test.setEquation(5, -8, 3);
    	test.calcRoot1();
    	test.calcRoot2();
    	test.print();
    	
    	
    	System.out.print("Enter a :: ");
    	a = keyboard.nextInt();
    	
    	System.out.print("Enter b :: ");
    	b = keyboard.nextInt();
    	
    	System.out.print("Enter c :: ");
    	c = keyboard.nextInt();
    	
    	Quadratic test2 = new Quadratic();
    	//test.Quadratic();
    	test2.setEquation(3, 2, -7);
    	test2.calcRoot1();
    	test2.calcRoot2();
    	test2.print();
    	
    	
    	System.out.print("Enter a :: ");
    	a = keyboard.nextInt();
    	
    	System.out.print("Enter b :: ");
    	b = keyboard.nextInt();
    	
    	System.out.print("Enter c :: ");
    	c = keyboard.nextInt();
    	
    	Quadratic test3 = new Quadratic();
    	//test.Quadratic();
    	test3.setEquation(9, 6, 1);
    	test3.calcRoot1();
    	test3.calcRoot2();
    	test3.print();
	}
}