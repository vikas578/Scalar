package array;

import java.util.Scanner;

public class negetivePositive {
	public static void main(String []args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int [] A = new int [n];
		
		for(int i=0;i<n;i++) {
			A[i] = sc.nextInt();
		}
		int j =0;
		int temp ;
		
		for(int i=0;i<n;i++) {
			if(A[i]<0) {
				if(i!=j) {
					temp = A[i];
					A[i] = A[j];
					A[j] = temp;
				}
				j++;
			}
		}
		for(int i=0;i<n;i++) {
			System.out.print(A[i]+" ");
		}
		
	}

}
