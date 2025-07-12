package _2DArray;

import java.util.Scanner;

public class Rotation180Degree {
	public static void main (String []args) {
		Scanner sc = new Scanner(System.in);
		int r = sc.nextInt();
		int c = sc.nextInt();
		
		int A[][] = new int[r][c];
		for(int i=0;i<r;r++) {
			for(int j=0;j<c;j++) {
				A[i][j] = sc.nextInt();			
			}
		}
		
	}

}
