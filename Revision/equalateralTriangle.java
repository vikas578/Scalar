package Revision;

import java.util.Scanner;

public class equalateralTriangle {
	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		int N = sc.nextInt();
		
		for(int i=1;i<=N;i++) {
			int space=N-i;
			for(int j=1;j<=space;j++) {
				System.out.print(" ");
				
			}
		
			for(int j=1;j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
