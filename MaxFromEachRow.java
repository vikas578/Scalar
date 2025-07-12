package _2DArray;

import java.util.Scanner;

public class MaxFromEachRow {
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
		System.out.println(maxelement(A));
	}
	public static int maxelement(int[][] a) {
		int rows = a.length;
		int cols = a[0].length;
		int max =0;
	}
	

}
