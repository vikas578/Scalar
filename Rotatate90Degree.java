package _2DArray;

import java.util.Scanner;

public class Rotatate90Degree {
	public static void main (String []args) {
		Scanner sc = new Scanner(System.in);
		int r = sc.nextInt();
		int c =  sc.nextInt();
		
		int[][] A = new int[r][c];
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				A[i][j] = sc.nextInt();	
			}
		}
		
		// rotate 180
		int[][] res = rotate90degree(rotate90degree(A));
		
		// transpose
		int[][] transpose = mirror2D(rotate90degree(A));
		r = res.length;
		c = res[0].length;
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				System.out.print(res[i][j]+" ");
			}
			System.out.println();
		}
	}
	public static int[][] rotate90degree(int[][] a) {
		int r = a.length;
		int c = a[0].length;
		int[][] b = new int[c][r];
		for(int i=0;i<r;i++){
			for(int j=0;j<c;j++) {
				b[j][r-i-1] = a[i][j];
			}
		}
		return b;

		}
	
	public static int[][] mirror2D(int[][] a){
		int r = a.length;
		int c = a[0].length;
		int[][] b = new int[r][c];
		
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				b[i][j] = a[i][c-1-j];
			}
		}
		return b;
		
		
	}
	}

