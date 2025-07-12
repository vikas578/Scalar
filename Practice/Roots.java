package Practice;

import java.util.Scanner;

public class Roots {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double A = sc.nextDouble();
		double B = sc.nextDouble();
		double C = sc.nextDouble();
		
		double D = Math.pow(B,2) - 4*A*C;
		
		if(D>0) {
			System.out.println("two real roots");
			System.out.println("Roots are " + (-B+Math.sqrt(D))/(2*A) + " and " + (-B-Math.sqrt(D))/(2*A));
		}
		else if(D==0) {
			System.out.println("Equal roots");
			System.out.println("Roots are " + -B/(2*A));
		}
		else {
			System.out.println("no roots");
			System.out.println("Roots are " + -B/(2*A) + "+i" +  Math.sqrt(-D)/(2*A) + " and "+ -B/(2*A) + "-i" + Math.sqrt(-D)/(2*A));
		}
		
	}

}
