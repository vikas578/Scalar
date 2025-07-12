package _2DArray;

import java.util.Scanner;

public class DiagonalElements {
	public static void main (String []args) {
		Scanner sc = new Scanner(System.in);
		int r  = sc.nextInt();
		int c = sc.nextInt();
		
		int A[][] = new int[r][c];
		
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				A[i][j] = sc.nextInt();	
			}
		}
		int B[][] = Diagonal(A);
		r= B.length;
		c= B[0].length;
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				System.out.print(B[i][j]+" ");
			}
			System.out.println();
		}
	}
	public static int [][] Diagonal(int[][] a){
		int r = a.length;
		
		int b[][] = new int [2][r];
		
		for(int i=0;i<r;i++) {
			b[0][i] = a[i][i];
			
			b[1][i] = a[i][r-1-i];
		}

		return b;
		
	}

}
