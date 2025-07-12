package array;

import java.util.Scanner;

public class MinOddMaxEven {
	public static void main(String []args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		
		int [] A = new int [n];
		
		for(int i=0;i<n;i++) {
			A[i] = sc.nextInt();
		}
		
		for(int i=0;i<n;i++) { 
			if(A[i]%2==0 && max < A[i]) {
				max = A[i];
			}
			else if(A[i]%2==1 && min > A[i]){
				min = A[i];
			}
			
		}
		System.out.println(" maximum even is : "+max);
		System.out.println(" minimum odd is : "+min);
	}

}
