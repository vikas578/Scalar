package _2DArray;

public class print2DArray {
//	printing all elements of 2D array
	public static void printArray(int[][] A) {

		for(int i =0;i<A.length;i++) {
			for(int j=0;j<A[0].length;j++) {
				System.out.print(A[i][j] + " ");
			}
			System.out.println();
		}
		
	}
}
