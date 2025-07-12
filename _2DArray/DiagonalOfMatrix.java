package _2DArray;

public class DiagonalOfMatrix {
	
	public static void main(String[] args) {
		int[][] A = {{1,5,4,5},{2,3,4,2},{6,2,3,7},{9,2,3,0},{6,1,6,3},{1,3,6,8}};

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
		
//		print all diagonals from right to left
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

		System.out.println();
		
//		print all diagonals from left to right
		
		for(int i=N-1; i>=0;i--) {
			int x=0,y=i;
			
			while(x<M && y<N) {
				System.out.print(A[x][y] + " ");
				x++;
				y++;
			}
			
			System.out.println();
		}
		
		for(int i=1;i<M;i++) {
			int x=i,y=0;

			while(x<M && y<N) {
				System.out.print(A[x][y] + " ");
				x++;
				y++;
			}			
			System.out.println();

			
		}

		
		
	}
}
