package array;

import java.util.Scanner;

public class Occurrence {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int l = sc.nextInt();
		int[] a = new int[l];
		
		for(int i=0;i<l;i++) {
			a[i] = sc.nextInt();
		}
		
		System.out.println("enter number");
		int n = sc.nextInt();
		System.out.println(frequency(a, l, n));
		
	}
	public static int frequency(int a[], int l, int n) {
		int res=0;
		for(int i=0;i<l;i++) 
			if(n==a[i]) 
				res++;
		return res;
	}

}
