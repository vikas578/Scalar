package array;

import java.util.Scanner;

public class MaxMin {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int l = sc.nextInt();
		int[] a = new int[l];
		int max=Integer.MIN_VALUE;
		int min=Integer.MAX_VALUE;
		
		for(int i=0;i<l;i++) {
			a[i] = sc.nextInt();
		}
		for(int i=0;i<l;i++) {
			max = Math.max(max, a[i]);
		}
		System.out.println(max);
		for(int i=0;i<l;i++) {
			min = Math.min(min, a[i]);
		}
		System.out.println(min);
	}

}
