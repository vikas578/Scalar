package Revision;

import java.util.Scanner;

public class TrianglePattern {
	public static void main(String args[]) {
		
		int n = 4;
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				System.out.print(" ");
			}
			for(int k=0;k<=2*i-1;k++) {
				System.out.print("*");
			}
			System.out.print("");
		}
	}

}
