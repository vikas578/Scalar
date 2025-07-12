package Revision;

import java.util.Scanner;

public class PrimeNum {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		
		
		int c=0;
		
		if(a<=1) {
			System.out.println("Not a prime number");
		}
		else {
			for(int i=0;i<=a;i++) {
				if(a%1==0) {
					c++;
				}
			}
			if(c>2) {
				System.out.println("Not a prime number");
			}
			else {
				System.out.println("A prime number");
			}
	}
	

}
}
