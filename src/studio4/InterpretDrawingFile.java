package studio4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.JFileChooser;
import javax.swing.SwingUtilities;

import edu.princeton.cs.introcs.StdDraw;

/**
 * @author Dennis Cosgrove (http://www.cse.wustl.edu/~cosgroved/)
 */
public class InterpretDrawingFile {

	public static void main(String[] args) throws FileNotFoundException {
		JFileChooser chooser = new JFileChooser("resources");
		chooser.showOpenDialog(null);
		File f = new File(chooser.getSelectedFile().getPath());
		Scanner in = new Scanner(f); //making Scanner with a File
		
		String shapeType = in.nextLine();
		int r;
		int g;
		int b;
		double x;
		double y;
		double halfWidth;
		double halfHeight;
		
		boolean isFilled = true;
		
		if (shapeType.equals("rectangle")) {
			r = in.nextInt();
			g = in.nextInt();
			b = in.nextInt();
			isFilled = in.nextBoolean();
			
			x = in.nextDouble();
			y = in.nextDouble();
			halfWidth = in.nextDouble();
			halfHeight = in.nextDouble();
			
			if (isFilled = true) {
				StdDraw.filledRectangle(x, y, halfWidth, halfHeight);
			} else {
				StdDraw.rectangle(x, y, halfWidth, halfHeight);
			}
			StdDraw.setPenColor(r,g,b);
			StdDraw.rectangle (x, y, halfWidth, halfHeight);
		}
	}
}
