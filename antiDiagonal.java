package _2DArray;

public class antiDiagonal {
	public static void main(String[] args) {
		
		int[][] A = {{1,5,4,5},{2,3,4,2},{6,2,3,7},{9,2,3,4}};
		int N = A.length;
		int[][] B = new int[2*N-1][N];
		
		print2DArray.printArray(A);
		
//		print all diagonals from right to left
		for(int i=0; i<N;i++) {
			int x=0,y=i;
			while(x<N && y>=0) {
				B[i][x]= A[x][y];
				x++;
				y--;
			}
		}
		
		System.out.println();
		for(int i=1;i<N;i++) {
			int x=i,y=N-1;
			while(x<N && y>=0) {
				B[N-1+i][N-1-y] = A[x][y];
				x++;
				y--;
			}			
		}
		System.out.println();
		print2DArray.printArray(B);
	}
}