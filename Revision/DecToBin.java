package Revision;

import java.util.Scanner;

public class DecToBin {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		
//		System.out.println(decimalToBinary(a));	
	}
	
	public int decimalToBinary(int a) {
		int r;
		int b=0;
		int p=1;
		while(a>0) {
			r = a%2;
			b = b + r*p;
			p = p*10;
			a = a/2;	
		}
		return b;
	}

}
