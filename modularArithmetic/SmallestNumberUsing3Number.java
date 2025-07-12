package modularArithmetic;

import java.util.Arrays;

public class SmallestNumberUsing3Number {
	public static void main(String[] args) {
		int A = 15;
		int B = 35;
		int C = 20;
		
		int x,y,z;
		
		x = Math.min(A, Math.min(C, B));
		if(x==A) {
			y = Math.min(C, B);
			if(y==B) {
				z = C;
			}
			else {
				z = B;
			}
		}
		else if(x==B) {
			y = Math.min(A, C);
			if(y==A) {
				z = C;
			}
			else {
				z = A;
			}
		}
		else {
			y = Math.min(A, B);
			if(y==A) {
				z = B;
			}
			else {
				z = A;
			}
		}
		
		int num = x*10000 + y*100 + z;
		
//		int[] arr = {A,B,C};
//		Arrays.sort(arr);
//		int num = arr[0]*10000 + arr[1]*100 + arr[2];
		System.out.println(num);
	}

}
