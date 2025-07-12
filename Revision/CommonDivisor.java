package Revision;

import java.util.Scanner;

public class CommonDivisor {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int f =0;
		int l = a<=b?a:b;
		
		for(int i=1;i<=l;i++) {
			if(a%i==0 && b%i==0) {
				f=i;
			}
		}
		System.out.println(f);
	}
}
