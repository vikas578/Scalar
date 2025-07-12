package Revision;

import java.util.Scanner;

public class DecimalToBinary {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int d = sc.nextInt();
		
		int b=0;
		int p=1;
		int r=0;
		while(d>0) {
			r = d%2;
			b = b + r*p;
			p = p*10;
			d = d/2;	
		}
		System.out.println(b);
	}

}
