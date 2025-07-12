package array;

import java.util.Scanner;

public class Reverse {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int l = sc.nextInt();
		int[] a = new int[l];
		int r[]= new int[l];
		
		for(int i=0;i<l;i++) {
			a[i] = sc.nextInt();
		}
		
		for(int i=0;i<l;i++) {
			r[i] = a[l-i-1];
			
		}
		
//		for(int i=0;i<l;i++) {
//			System.out.print(r[i] + " ");
//		}
		System.out.println();
		reverse(a);
		for(int i=0;i<l;i++) {
			System.out.print(a[i] + " ");
		}
	}
	
	static int[] reverse(int[] A) {
		int N = A.length;
		for(int i=0;i<N/2;i++) {
			int temp = A[i];
			A[i] = A[N-1-i];
			A[N-1-i] = temp;	
		}
		return A;
	}


}
