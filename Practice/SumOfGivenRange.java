package Practice;

import java.util.Scanner;

public class SumOfGivenRange {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt ();
		
		int sum = 0;
		
		for(int i=A;i<=B;i++) {
			sum = sum + i;
		}
		System.out.println(sum);

	}

}
