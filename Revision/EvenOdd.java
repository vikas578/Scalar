package Revision;

import java.util.Scanner;

public class EvenOdd {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		
		if(a%2==0) {
			System.out.println("the number is even");
			
		}
		else {
			System.out.println("the number is odd");
		
			
		}
		
		//Positive Negative
		
		if(a==0) {
			System.out.println("Number is zero");
		}
		else if(a>0) {
			System.out.println("Number is positive");
		}
		else {
			System.out.println("Number is positive");
		}
		
		//Display 1 to 10 using do while loop
		
		int x = 1;
		do {
			System.out.println(x);
			x++;
		}
		while(x<=10);
		
		// using while loop
		
		while(x<=10) {
			System.out.println(x);
			x++;
		}
		
		// using for loop
		
		for(x=1;x<=10;x++) {
			System.out.println(x);
		}
		
		// Infinite for loop
		
		
		
	}

}
