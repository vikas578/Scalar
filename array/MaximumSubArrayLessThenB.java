package array;

import java.util.Scanner;

public class MaximumSubArrayLessThenB {
	public static void main(String[] args) {
		int [] A = {3,6,8,9};
		int N = A.length;
		Scanner sc = new Scanner(System.in);
		int B = sc.nextInt();
		int total = 0;
		
		for(int i=0;i<=N;i++) {
			int sum = 0;
			for(int j=i;j<=N-1;j++) {
				sum=sum+A[j];
				if(sum<B) {
				total+=sum;
				}
			}
		}
		System.out.println(total);
	}

}
