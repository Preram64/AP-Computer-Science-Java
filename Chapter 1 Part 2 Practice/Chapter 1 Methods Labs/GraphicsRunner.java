//© A+ Computer Science  -  www.apluscompsci.com
//Name - Sean Wangnick
//Date - 9/19/16
//Class - AP Computer Science
//Lab  - All Labs

import javax.swing.JFrame;

public class GraphicsRunner extends JFrame
{
	// WIDTH and HEIGHT are constants	
	private static final int WIDTH = 800;
	private static final int HEIGHT = 600;

	public GraphicsRunner()
	{
		super("Graphics Runner");

		setSize(WIDTH,HEIGHT);

		//getContentPane().add(new SmileyFace());
		//getContentPane().add(new BigHouse());
		//getContentPane().add(new Robot());
		getContentPane().add(new ShapePanel());
		
		setVisible(true);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main( String args[] )
	{
		GraphicsRunner run = new GraphicsRunner();
	}
}