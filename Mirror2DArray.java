package _2DArray;

public class Mirror2DArray {
	public static void main(String[] args) {
		int[][] A = {{1,5,4,5},{2,3,4,2},{6,2,3,7},{9,2,3,0}};
		print2DArray.printArray(A);
		
		VerticalMirrorArray(A);
		System.out.println();
		
		print2DArray.printArray(A);
		
		System.out.println();
		
		HorizontalMirrorArray(A);
		print2DArray.printArray(A);
		
	}
	
	public static void VerticalMirrorArray(int[][] A) {
		int M = A.length;
		int N = A[0].length;
		
		for(int i=0;i<M;i++) {
			int start = 0, end=N-1;
			while(start<end) {
				int temp = A[i][start];
				A[i][start] = A[i][end];
				A[i][end] = temp;
				start++;
				end--;
			}
		}
		
	}
	

	public static void HorizontalMirrorArray(int[][] A) {
		int M = A.length;
		int N = A[0].length;
		
		for(int i=0;i<N;i++) {
			int start = 0, end=M-1;
			while(start<end) {
				int temp = A[start][i];
				A[start][i] = A[end][i];
				A[end][i] = temp;
				start++;
				end--;
			}
		}
		
	}

}
