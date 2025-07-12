package array;

import java.util.Scanner;

public class ReverseAnArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int l = sc.nextInt();
		int[] a = new int[l];
		
		for(int i=0;i<l;i++) {
			a[i] = sc.nextInt();
		}
		for(int i=0;i<l;i++) {
			if(a[i]<0) {
			System.out.print(a[i] + " ");
			}
		}
	}
}
