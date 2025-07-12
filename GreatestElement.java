package array;

import java.util.Scanner;

public class GreatestElement {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int [] A = new int [n];
		
		for(int i=0;i<n;i++) {
			A[i] = sc.nextInt();
		}
		
		int max = Integer.MIN_VALUE;
		
		for(int i=0;i<n;i++) {
			if(max < A[i]) {
				max = A[i];
			}
				
			
		}
		System.out.println(max);

		
	}

}
