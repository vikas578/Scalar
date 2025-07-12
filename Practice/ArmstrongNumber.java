package Practice;

import java.util.Scanner;

public class ArmstrongNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		double B = 0;
		double c =0;

		if(A==0) {
		}
		else {
			while(A!=0) {
				c++;
				A=A/10;
			}	
		}
		while(A>0) {
			double x = A%10;
			B = B + Math.pow(x, c);
			A = A/10;
		}
		if(A==B) {
			System.out.println("Armstrong");
		}
		else {
			System.out.println("Not armstrong");
		}
	}

}
