package Revision;

import java.util.Scanner;

public class OctToBin {
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
		int r;
		int b=0;
		int p=1;
		while(d>0) {
			r = d%2;
			b = b + r*p;
			p = p*10;
			d = d/2;	
		}
		System.out.println("Binary form "+b);
	}

}
