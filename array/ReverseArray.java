package array;

import java.util.Scanner;

public class ReverseArray {
	public static void main(String []args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int [] A = new int [n];
		
		for(int i=0;i<n;i++) {
			A[i] = sc.nextInt();
		}
		int [] B = new int [n];
		
		for(int i=0;i<n;i++) {
			B[i] = A[n-i-1];
		}
		for(int i=0;i<n;i++) {
			System.out.print(B[i]+" ");
		}
	}

}
