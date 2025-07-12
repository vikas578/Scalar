package Revision;

import java.util.Scanner;

public class Prime {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		
		int b=0;
		if(a<=1) {
			System.out.println("not a prime");	
		}
		else {
			for(int i=0;i<=a;i++) {
				if(a%1==0) {
					b++;
				}
		}
			if(b>2) {
				System.out.println("not a prime");
			}
			else {
				System.out.println("its a prime");
			}
		}
	}
}
	
		
		
	


