package Revision;

import java.util.Scanner;

public class DigitsInAnInteger {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		
		int c =0;
		if(x==0)
			System.out.print("Number of Digits = 1");
			else{
			while(x!=0)
			{
			c++;
			x=x/10;
			}
			System.out.print("Number of Digits is "+c);
		
		}
}
}
