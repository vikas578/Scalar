package array;

import java.util.Scanner;

public class LowestElement {
	public static void main(String []args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int [] A = new int [n];
		
		for(int i=0;i<n;i++) {
			A[i] = sc.nextInt();
		}
		
		int min = Integer.MAX_VALUE;
		
		for(int i=0;i<n;i++) {
			if(min > A[i] ) {
				min = A[i];
			}
		}
		System.out.println(min);	
		
	}

}
