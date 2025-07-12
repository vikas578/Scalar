package _2DArray;

public class rowToColumnZero {
	public static void main(String[] args) {
		int[][] A = {{1,5,4,5},{2,3,4,2},{6,0,3,7},{9,2,3,0},{6,1,6,3},{1,3,6,8}};
		int M = A.length;
		int N = A[0].length;
		
		boolean row[]    = new boolean[M];
		boolean column[] = new boolean[N];
		print2DArray.printArray(A);
		
		for(int i=0;i<M;i++) {
			for(int j=0;j<N;j++) {
				if(A[i][j]==0) {
					row[i]=true;
					column[j]=true;
				}
			}
		}
		System.out.println();
		
		for(int i=0;i<M;i++) {
			for(int j=0;j<N;j++) {
				if(row[i]==true || column[j] == true) {
					A[i][j] =0;
				}
			}
		}
		print2DArray.printArray(A);
		
	}
}
