package _2DArray;

import java.util.Scanner;

public class spiralMatrix4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N  = sc.nextInt();
		int[][] A  = new int[N][N];
		
		if(N==1) {
			A[0][0]=1;
		}
		else {
			int i=0,j=0;
			int count = 1;
			while(N>1) {
				// left to right
				for(int k=0;k<N-1;k++) {
					A[i][j]=count;
					j++;
					count++;
				}
				
				// top to bottom
				for(int k=0;k<N-1;k++) {
					A[i][j]=count;
					i++;
					count++;
				}
				
				// right to left
				for(int k=0;k<N-1;k++) {
					A[i][j]=count;
					j--;
					count++;
				}
				
				// bottom to top
				for(int k=0;k<N-1;k++) {
					A[i][j]=count;
					i--;
					count++;
				}
				
				N=N-2;
				i++;
				j++;
				if(N==1) {
					A[i][j] = count;
				}
				
			}
		}
		System.out.println();
		print2DArray.printArray(A);
	}
}
