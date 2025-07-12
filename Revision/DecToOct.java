package Revision;

import java.util.Scanner;

public class DecToOct {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int r;
		int o=0;
		int p=1;
		while(a>0) {
			r = a%8;
			o = o + r*p;
			p = p*10;
			a = a/8;	
		}
		System.out.println(o);

	}

}
