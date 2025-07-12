package array;

import java.util.Scanner;

public class NegetiveOneSide {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] a = new int[N];
		
		for(int i=0;i<N;i++) {
			a[i] = sc.nextInt();
		}
		int j=0;
		int temp;
		
		for(int i=0;i<N;i++) {
			if(a[i]<0) {
				if(i!=j) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
				j++;
			}
		}
		for(int i=0;i<N;i++) {
			System.out.print(a[i] + " ");
		}
	}

}
