package _2DArray;

import java.util.Scanner;

public class Rotation {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int rows = sc.nextInt();
		int cols = sc.nextInt();
		
		int[][] A = new int[rows][cols];
		for(int i=0;i<rows;i++) {
			for(int j=0;j<cols;j++) {
				A[i][j] = sc.nextInt();	
			}
		}
		int B[][] = new int[cols][rows];
		rotate(A,B);
		for(int i=0;i<rows;i++) {
			for(int j=0;j<cols;j++) {
				System.out.print(B[i][j]+" ");
		}
			System.out.println();
	}
		
	}
	public static void rotate(int[][] a, int[][] b) {
		int rows = a.length;
		int cols = a[0].length;
		for(int i=0;i<rows;i++) {
			for(int j=0;j<cols;j++) {
				b[j][rows-i-1]=a[i][j];
			}
		}
	}
}


