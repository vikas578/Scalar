package array;

import java.util.Scanner;

public class arrayReversalfunction {
	public static void main(String[] args) {
		int[] arr = {12,34,2,24,21,42,425,253,53,3};
		int N = arr.length;
		Scanner sc = new Scanner(System.in);
		int R = sc.nextInt();
		R = R%N;
		
//		Left to right
		reverseArray(arr, 0, N-1);
		reverseArray(arr, 0, N-R-1);
		reverseArray(arr, N-R, N-1);

//		Right to Left
//		reverseArray(arr, 0, N-1);
//		reverseArray(arr, 0, R-1);
//		reverseArray(arr, R, N-1);

		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i] + " ");
		}
	}
	
	public static int[] reverseArray(int[] A, int start, int end) {
		int N =A.length;
		
		while(start<end) {
			int temp = A[start];
			A[start] = A[end];
			A[end] = temp;
			start++;
			end--;
		}
		
		return A;
	}
}
