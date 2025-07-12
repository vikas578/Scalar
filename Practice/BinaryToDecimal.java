package Practice;

import java.util.Scanner;

public class BinaryToDecimal {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int N = 0;
		int D = 0;
		
		while(A>0) {
			int temp = A%10;
			D += temp*Math.pow(2, N);
			A = A/10;
			N++;
		}
		System.out.println(D);
	}

}
