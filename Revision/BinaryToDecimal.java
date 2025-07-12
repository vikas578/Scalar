package Revision;

import java.util.Scanner;

public class BinaryToDecimal {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int b = sc.nextInt();
		
		int n=0;
		int d=0;
		
		while(b>0) {
			int temp = b%10;
			d += temp*Math.pow(2, n);
			b=b/10;
			n++;
		}
		System.out.println(d);
	}

}
