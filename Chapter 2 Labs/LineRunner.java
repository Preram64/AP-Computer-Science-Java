//© A+ Computer Science  -  www.apluscompsci.com
//Name - Sean Wangnick
//Date - 9/30/16
//Class - AP Computer Science
//Lab  - Slope Of A Line

public class LineRunner
{
	public static void main( String[] args )
    {
    	Line set1 = new Line(1, 9, 14, 2);
    	
    	set1.setCoordinates(1, 9, 14, 2);
    	set1.calculateSlope();
    	set1.print();
    	
    	Line set2 = new Line(1, 7, 18, 3);
    	
    	set2.setCoordinates(1, 7, 18, 3);
    	set2.calculateSlope();
    	set2.print();
    	
    	Line set3 = new Line(6, 4, 2, 2);
    	
    	set3.setCoordinates(6, 4, 2, 2);
    	set3.calculateSlope();
    	set3.print();
    	
    	Line set4 = new Line(4, 4, 5, 3);
    	
    	set4.setCoordinates(4, 4, 5, 3);
    	set4.calculateSlope();
    	set4.print();
    	
    	Line set5 = new Line(1, 1, 2, 9);
    	
    	set5.setCoordinates(1, 1, 2, 9);
    	set5.calculateSlope();
    	set5.print();
	}
}