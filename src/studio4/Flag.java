package studio4;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {
		StdDraw.setPenColor(Color.RED);
		StdDraw.arc(0.5, 0.4, .2, 0, 180);
		
		StdDraw.setPenColor(Color.RED);
		StdDraw.arc(0.4, 0.4, .1, 180, 360);
		
		StdDraw.setPenColor(Color.BLUE); 
		StdDraw.arc(0.5, 0.4, 0.2, 180, 360);
		
		StdDraw.setPenColor(Color.BLUE); 
		StdDraw.arc(0.6, 0.4, 0.1, 0, 180);
		
		StdDraw.setPenColor(Color.BLACK); 
		StdDraw.filledRectangle(0.25, 0.7, 0.1, 0.03); 
		
		StdDraw.setPenColor(Color.BLACK); 
		StdDraw.filledRectangle(0.75, 0.7, 0.1, 0.03); 
		
		
	}
}