package _2DArray;

import java.util.Scanner;

public class SpiralMatrix2D {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		Print2DArreay.print(getSpiral(N));
		
	}
	
	public static int[][] getSpiral(int N){
		int[][] A = new int[N][N];
		int count = 1;
		int i = 0;
		int j = 0;
		
		while(N>1) {
//		left to right
		for(int k=0;k<N-1;k++)
		{
			A[i][j] = count;
			j++;
			count++;
		}
//		top to bottom
		for(int k=0;k<N-1;k++)
		{
			A[i][j] = count;
			i++;
			count++;
		}
//		right to left
		for(int k=0;k<N-1;k++)
		{
			A[i][j] = count;
			j--;
			count++;
		}
//		bottom to top
		for(int k=0;k<N-1;k++)
		{
			A[i][j] = count;
			i--;
			count++;
		}
		
		N=N-2;
		i++;
		j++;
		if(N==1)
			A[i][j]=count;
		}
		return A;
		
	}

}
