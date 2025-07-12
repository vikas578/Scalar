package Revision;

import java.util.Scanner;

public class SumOfDigits {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int s=0;
		
		while(a!=0) {
			s=s+a%10;
			a=a/10;
		}
		System.out.println(s);
	}

}
