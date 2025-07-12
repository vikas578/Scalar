package _2DArray;

public class twoDarray {

	public static void main(String[] args) {
		
		int[] A[] = {{1,5,4},{2,3,4},{6,2,3},{9,2,3}};
		
		
		int M =  A.length;
		int N = A[0].length;
		
//		printing all elements of 2D array
		for(int i =0;i<M;i++) {
			for(int j=0;j<N;j++) {
				System.out.print(A[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.println();
		
//		getting row wise max sum
		int rowMax = Integer.MIN_VALUE;
		
		for(int i=0;i<M;i++) {
			int sum = 0;
			for(int j=0;j<N;j++) {
				sum+=A[i][j];
			}
			rowMax = Math.max(rowMax, sum);
		}
		
		System.out.println(rowMax);

		int colMax = Integer.MIN_VALUE;
		
		for(int i=0;i<N;i++) {
			int sum = 0;
			for(int j=0;j<M;j++) {
				sum+=A[j][i];
			}
			colMax = Math.max(colMax , sum);
		}
		
		System.out.println(colMax);

		
	}
	
	
}


