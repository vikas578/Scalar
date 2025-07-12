package Revision;

import java.util.Scanner;

public class SumOfFraction {
	public static void main(String[]args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first Fraction number");
		int n1 = sc.nextInt();
		int d1 = sc.nextInt();
		System.out.println("Enter second Fraction number");
		int n2 = sc.nextInt();
		int d2 = sc.nextInt();
		
		int Divide;
		int n3;
		int d3;
		n3 = (n1*d2)+(n2*d1);
        d3=d1*d2;
        
        if(n3>d3) {
        	Divide=d3;
        }
        else {
        	Divide=n3;
        }
        for(int i=Divide;i>0;i--) {
        	if(n3%i==0 && d3%i==0) {
        		 n3=n3/i;

                 d3=d3/i;
        	}
        }
        System.out.println("Sum of fractions is "+n3+"/"+d3);
		
		
	}

}
