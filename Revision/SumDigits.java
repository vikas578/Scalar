package Revision;

import java.util.Scanner;

public class SumDigits {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		
		int s=0;
		
		while(x!=0) {
			s=s+x%10;
			x=x/10;
		}
		System.out.println("Sum of the elements of the digits are "+s);
	}


}
