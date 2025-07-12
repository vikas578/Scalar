package Practice;

import java.util.Scanner;

public class PerfectNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		
		int sum =0;
		
		for(int i=1;i<=A;i++) {
			if(A%i==0) {
			sum=sum+i;
			}
			
		}
		if(sum==A) {
			System.out.println("Perfect number");
		}
		else {
			System.out.println("Not a perfect number");
			
		}
		
	}
}


