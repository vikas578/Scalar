package _2DArray;

import java.util.Scanner;

public class Transpose {
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
		int B[][] = new int[rows][cols];
		transpose(A,B);
		
		for(int i=0;i<rows;i++) {
			for(int j=0;j<cols;j++) {
				System.out.print(B[i][j]+" ");
		}
			System.out.println();
	}
	}
	public static void transpose(int[][] a, int[][] b) {
		for(int i=0;i<b.length;i++) {
			for(int j=0;j<b[0].length;j++) {
				b[i][j]=a[j][i];
				
			}
		}
		
	}
}
