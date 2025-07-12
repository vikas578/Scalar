package _2DArray;

public class DiagonalMatrix {
	public static void main(String[] args) {
		int[][] A = {{1,2,3},{4,5,6},{7,8,9m}};

		int M = A.length;
		int N = A[0].length;
		
//		printing all elements of 2D array
		for(int i =0;i<M;i++) {
			for(int j=0;j<N;j++) {
				System.out.print(A[i][j] + " ");
			}
			System.out.println();
		}
		

		System.out.println();
		for(int i=0; i<N;i++) {
			int x=0,y=i;
			
			while(x<M && y>=0) {
				System.out.print(A[x][y] + " ");
				x++;
				y--;
			}
			
			System.out.println();
		}
		
		
		for(int i=1;i<M;i++) {
			int x=i,y=N-1;

			while(x<M && y>=0) {
				System.out.print(A[x][y] + " ");
				x++;
				y--;
			}			
			System.out.println();

			
		}
	}
}


