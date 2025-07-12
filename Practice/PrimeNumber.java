package Practice;

import java.util.Scanner;

public class PrimeNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		
		int count = 0;
		
		if(A<=1) {
			System.out.println("Not a prime number");
		}
		else {
			for(int i=0;i<=A;i++) {
				if(A%1==0) {
					count++;
				}
			}
			if(count>2) {
				System.out.println("Not a prime number");
			}
			else {
				System.out.println("A prime number");
			}
		}
	}

}
