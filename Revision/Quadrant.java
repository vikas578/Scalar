package Revision;

import java.util.Scanner;

public class Quadrant {
	
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		if (x > 0 && y > 0)

	        System.out.println(" first quadrant.");

	      else if (x < 0 && y > 0)

	      System.out.println(" second quadrant.");

	      else if (x < 0 && y < 0)

	      System.out.println(" third quadrant.");

	      else if (x > 0 && y < 0)

	     System.out.println(" fourth quadrant.");

	     else if (x == 0 && y == 0)

	     System.out.println(" orgin.");
	}

}
