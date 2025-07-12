package Revision;

import java.util.Scanner;

public class PrintNnumber {
	public static void main (String [] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		PrintN(n);
	}
	public static void PrintN(int n) {
		if(n==1)
			System.out.print(n+ " ");
		else
		{
			PrintN(n-1);
			System.out.print(n+ " "); 
		}
		
	}

}
