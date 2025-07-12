package Revision;

import java.util.Scanner;

public class OctToDec {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		int o = sc.nextInt();
		int n = 0;
		int d = 0;
		
		
		while(o>0) {
			int t = o%10;
			d += t*Math.pow(8, n);
			o = o/10;
			n++;
		}
		System.out.println("Decimal form "+d);
		
	}

}
