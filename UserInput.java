package _2DArray;

import java.util.Scanner;

public class UserInput {
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
			//print2d(A);
			printcolumnWise(A);
			System.out.println();
			printrowWise(A);
	

}
	public static void print2d(int[][] A) {
		int rows = A.length;
		int cols = A[0].length;
		for(int i=0;i<rows;i++) {
			for(int j=0;j<cols;j++) {
				System.out.print(A[i][j]+" ");
		}
			System.out.println();
	}
		
	}
	public static void printcolumnWise(int[][] A) {
		int rows = A.length;
		int cols = A[0].length;
		for(int i=0;i<cols;i++) {
			for(int j=0;j<rows;j++) {
				if(i%2==0)
					System.out.print(A[j][i]+" ");
				else
					System.out.print(A[rows-1-j][i]+" ");
		}
			//System.out.println();
	}
		
	}
	public static void printrowWise(int[][] A) {
		int rows = A.length;
		int cols = A[0].length;
		for(int i=0;i<rows;i++) {
			for(int j=0;j<cols;j++) {
				if(i%2==0)
					System.out.print(A[i][j]+" ");
				else
					System.out.print(A[i][cols-1-j]+" ");
		}
			//System.out.println();
	}
	}
}
