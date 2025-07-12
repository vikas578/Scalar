package Revision;

import java.util.Scanner;

public class BinToOct {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int n = 0;
		int d = 0;
		
		while(a>0) {
			int temp = a%10;
			d += temp*Math.pow(2, n);
			a = a/10;
			n++;
		}
		System.out.println(d);
		
		int r;
		int octal=0;
		int p=1;
		while(d>0) {
			r = d%8;
			octal = octal + r*p;
			p = p*10;
	}
	}

}
