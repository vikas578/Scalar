package Revision;

import java.util.Scanner;

public class PalindromicInteger {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int temp=0;
		int a=0;
		int b=n;
		
		while(n!=0) {
			temp=n%10;
			a=a*10+temp;
			n=n/10;
		}
		if(a==b) {
			System.out.println("palindrome");
		}
		else
			System.out.println("not a palindrome");
		
	}

}
