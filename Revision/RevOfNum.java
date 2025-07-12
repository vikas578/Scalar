package Revision;

import java.util.Scanner;

public class RevOfNum {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		
		int r = 0;
		
		while(a!=0) {
			int b = a%10;
			  r=r*10+b;

	            a=a/10;
		}
		System.out.println(r);
	}

}






