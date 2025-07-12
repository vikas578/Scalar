package _2DArray;

public class transposeSquareMatrix {
	public static void main(String[] args) {

		int[][] A = {{1,5,4,5},{2,3,4,2},{6,2,3,7},{9,2,3,0}};
		print2DArray.printArray(A);
		System.out.println();
		
		transposeArray(A);
		
		print2DArray.printArray(A);
	}
	
	
	public static void transposeArray(int[][] A){
		int M = A.length;
		int N = A[0].length;
		for(int i=0;i<M;i++) {
			for(int j=0;j<N;j++) {
				if(i>j) {       				// to avoid double swapping
					swap(i, j, A);
				}
			}
		}
	}
	
	public static void swap(int i,int j, int[][] A) {
		int temp = A[i][j];
		A[i][j]=A[j][i];
		A[j][i]=temp;
	}
}
