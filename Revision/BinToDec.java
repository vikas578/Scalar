package Revision;

import java.util.Scanner;

public class BinToDec {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int n = 0;
		int d = 0;
		
		while(a>0) {
			int t = a%10;
			d += t*Math.pow(2, n);
			a = a/10;
			n++;
		}
		System.out.println(d);
	}

}
