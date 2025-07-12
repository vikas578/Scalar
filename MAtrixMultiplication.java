package _2DArray;

public class MAtrixMultiplication {
	public static void main(String[] args) {
		int[][] A = {{1,5,4,5},{2,3,4,2},{6,2,3,7}}; // 3 X 4
		int[][] B = {{1,5},{4,5},{9,2},{3,4}}; // 4  X 2
		int M = A.length;
		int N = A[0].length;
		int P = B[0].length;
		
		int[][] C = new int[M][P];
		
		for(int i=0;i<M;i++) {
			for(int j=0;j<N;j++) {
				for(int k=0;k<P;k++) {
					C[i][k] += A[i][j]*B[j][k];
				}
			}
		}
		
		print2DArray.printArray(C);
	}
}
