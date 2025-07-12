package Revision;

import java.util.Scanner;

public class power5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int d=0;
		int n=0;

		while(a>0) {
			int t = a%10;
			d += t*Math.pow(5, n);
			a = a/10;
			n++;
		}
		System.out.println(d);
	}

}
