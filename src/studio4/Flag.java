package studio4;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.JFileChooser;
import javax.swing.SwingUtilities;


public class Flag {
	public static void main(String[] args) {
		norway();
	}
	private static void mother() {
		   StdDraw.clear();
		   StdDraw.setPenColor(255, 255, 0);
		   StdDraw.filledRectangle(2, 11, 2.5, 22);
		   StdDraw.setPenColor(0, 200, 0);
		   StdDraw.filledRectangle(20, 11, 2.5, 22);
		  
		   StdDraw.setPenColor(139, 69, 19);
		   
		   StdDraw.filledCircle(11, 11, 3);
		   
		   StdDraw.setPenColor(85, 107, 47);
		   StdDraw.filledCircle(11, 11, 1.5);
	}
		

		public static void norway() {
		   StdDraw.setXscale(0, 22);
		   StdDraw.setYscale(0, 22);
		   mother();
		}
}