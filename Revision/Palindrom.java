package Revision;

import java.util.Scanner;

public class Palindrom {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		
		 int b=0;
		 int r=0;
		 int c=a;
		 
		 while(a!=0) {
			 b=a%10;
	         r=r*10+b;
	         a=a/10;
		 }
		 if(r==c) {
			 System.out.println("Palindrom number");
		 }
		 else {
			 System.out.println("Not a palindrom");
		 }
	}

}
