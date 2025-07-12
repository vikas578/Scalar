package Revision;

import java.util.Scanner;

public class LongestPlindromInArray {
	public static void main(String[]args) {
		int A[] = {310050013,690096,4506059,101};
		int max = Integer.MIN_VALUE;
		for(int i=0;i<A.length;i++) {
			
			if(CheckPalindrome(A[i])) {
				if(max<A[i]) {
					max=A[i];
				}
			}	
		}
		System.out.println(max);

	}

	public static boolean CheckPalindrome(int A) {
		int R = 0;
		int B = A;
		int C = 0;

		while(A!=0) {
			C = A%10;
			R = R*10+C;
			A = A/10;

		}
		if(R==B) {
			return true;
		}
		else {
			return false;
		}

	}

}
