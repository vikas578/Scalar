package Revision;

import java.util.Scanner;

public class PrimeInRange {	
	
	public static int getPrimeCount(int A) {
		int count=0;
		for(int i=2;i<=A;i++) {
			if(CheckPrime(i))
				count++;
		}
		return count;
	}
	
	public static boolean CheckPrime(int n) {		
		for(int i=2;i*i<=n;i++) {
			if(n%i==0) 
				return false;
		}
		return true;
	}
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int b = sc.nextInt();

		System.out.println("count : " + getPrimeCount(b));
		
	}
}


