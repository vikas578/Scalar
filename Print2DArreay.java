package _2DArray;

import java.util.Scanner;

public class Print2DArreay {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int r = sc.nextInt();
		int c =  sc.nextInt();
		
		int[][] A = new int[r][c];
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				A[i][j] = sc.nextInt();	
			}
		}
		print(A);
	}
	public static void print(int [][] a){
		int r = a.length;
		int c = a[0].length;
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		
	}

}
