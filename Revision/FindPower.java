package Revision;

import java.util.Scanner;

public class FindPower {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int p = 1;
		
		while(b!=0) {
			
			p*=a;
			b--;
		}
		System.out.println(p);
		
		
	}

}
