package _2DArray;

public class Multiplication {
	public static void main(String[] args) {
		int[][] A = {{1,5,4},{2,3,4},{6,2,3}}; 
		int[][] B = {{1,5,6},{4,5,8},{9,2,5}};
		int N = A.length;
		int M = A[0].length;
		int P = B[0].length;
		
		int[][] C = new int[N][P];
		
		for(int i=0;i<N;i++) {
			for(int j=0;j<M;j++) {
				for(int k=0;k<P;k++) {
					C[i][k] += A[i][j]*B[j][k];
				}
			}
		}
		for(int i=0;i<C.length;i++) {
			for(int j=0;j<C[0].length;j++) {
				System.out.print(C[i][j]+" ");
		}
			System.out.println();
	}
		
		
		
	}
	

}
