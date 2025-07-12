package Practice;

import java.util.Scanner;

public class SumOfDigits {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		
		int sum = 0;
		
		while(A!=0) {
			sum = sum + A%10;

			A = A / 10;
		}
		System.out.println(sum);
	}

}
