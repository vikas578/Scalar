package Practice;

import java.util.Scanner;

public class SumOfNnumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int sum =0;
		
		for(int i=0;i<=A;i++) {
			sum = sum+i;
		}
		System.out.println(sum);
	}

}
