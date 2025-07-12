package Revision;

import java.util.Scanner;

public class MagicNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int r;
		int b=0;
		int p=1;
		while(a>0) {
			r = a%2;
			b = b + r*p;
			p = p*10;
			a = a/2;
		}
		int m = 0;
		int n=0;

		while(b>0) {
			int t = b%10;
			m += t*Math.pow(5, n);
			b = b/10;
			n++;
		}
		System.out.println(m);
		
		
		
	}

}
