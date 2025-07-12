package Revision;

import java.util.Scanner;

public class star_triangle {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		for(int i=1;i<=N;i++) {
			int space = N-i;
			for(int j=1;j<=space;j++) {
				System.out.print(" ");
			}
			int lim=2*i-1;
			for(int j=1;j<=lim;j++) {
				System.out.print("*");
			}
				
			System.out.println();
		}
		
		for(int i=N-1;i>=1;i--) {
			int space = N-i;
			for(int j=1;j<=space;j++) {
				System.out.print(" ");
			}
			
			int lim=2*i-1;
			for(int j=1;j<=lim;j++) {
				System.out.print("*1q	AQ	");
			}
				
			System.out.println();
		}
	}
}
