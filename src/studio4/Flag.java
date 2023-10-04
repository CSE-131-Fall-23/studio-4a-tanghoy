package studio4;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {
		
		StdDraw.setPenColor(StdDraw.MAGENTA);
		StdDraw.filledRectangle(0.5, 0.5, 0.4, 0.2);
		StdDraw.setPenColor(StdDraw.YELLOW);
		double[] x = {0.1, 0.2, 0.3, 0.2};
		double[] y = {0.6, 0.7, 0.6, 0.5};
		
		StdDraw.filledPolygon(x, y);
		
		StdDraw.setPenColor(StdDraw.PRINCETON_ORANGE);
		StdDraw.filledCircle(0.7, 0.5, 0.15);
		
		StdDraw.setPenColor(StdDraw.GREEN);
		double[] a = {0.75, 0.71, 0.75};
		double[] b = {0.5, 0.5, 0.6};
		StdDraw.filledPolygon(a, b);
		
		StdDraw.setPenColor(1, 50, 3);
		double[] c = {0.7, 0.76, 0.77};
		double[] d = {0.45, 0.51, 0.5};
		StdDraw.filledPolygon(c, d);
	
	}
}