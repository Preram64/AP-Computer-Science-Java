//© A+ Computer Science  -  www.apluscompsci.com
//Name - Sean Wangnick
//Date - 10/24/16
//Class - AP Computer Science
//Lab  - Discount Determiner

import static java.lang.System.*;
import java.util.Scanner;

public class DiscountRunner
{
	public static void main( String args[] )
	{
		Scanner keyboard = new Scanner(System.in);
		
		out.print("Enter the original bill amount :: ");
		double amt = keyboard.nextDouble();
		out.print("Bill after discount :: ");
		out.printf("%.2f", Discount.getDiscountedBill(amt));
		out.println();
		out.println();
		
		out.print("Enter the original bill amount :: ");
		amt = keyboard.nextDouble();
		out.print("Bill after discount :: ");
		out.printf("%.2f", Discount.getDiscountedBill(amt));
		out.println();
		out.println();
		
		out.print("Enter the original bill amount :: ");
		amt = keyboard.nextDouble();
		out.print("Bill after discount :: ");
		out.printf("%.2f", Discount.getDiscountedBill(amt));
		out.println();
		out.println();
		
		out.print("Enter the original bill amount :: ");
		amt = keyboard.nextDouble();
		out.print("Bill after discount :: ");
		out.printf("%.2f", Discount.getDiscountedBill(amt));
		out.println();
		out.println();
		
		out.print("Enter the original bill amount :: ");
		amt = keyboard.nextDouble();
		out.print("Bill after discount :: ");
		out.printf("%.2f", Discount.getDiscountedBill(amt));
		out.println();
		out.println();
	}
}