package Revision;

import java.util.Scanner;

public class SumOfDigitsAndPrime {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int sumA = 0;
		int sumB = 0;
		int r1 = 0;
		int r2 = 0;
		
		while(a!=0) {
			sumA = sumA + a%10;
			a = a/10;
		}
		System.out.println("Sum of first number " +sumA);
		
		while(b!=0) {
			sumB = sumB + b%10;
			b = b/10;
		}
		System.out.println("Sum of second number " +sumB);
		
		if(a<=1) {
			System.out.println("first number is not a prime");	
		}
		else {
			for(int i=0;i<=a;i++) {
				if(a%1==0) {
					r1++;
				}
		}
			if(r1>2) {
				System.out.println("first number is not a prime");
			}
			else {
				System.out.println("first number is a prime");
			}
				

		}
		if(b<=1) {
			System.out.println("second number is not a prime");	
		}
		else {
			for(int j=0;j<=b;j++) {
				if(b%1==0) {
					r2++;
				}
		}
			if(r2>2) {
				System.out.println("second number is not a prime");
			}
			else {
				System.out.println("second number is a prime");
			}
	}
		
	}
}
