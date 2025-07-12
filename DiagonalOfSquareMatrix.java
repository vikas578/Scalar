package _2DArray;

public class DiagonalOfSquareMatrix {
	public static void main(String[] args) {
		int[][] A = {{1,5,4,5},{2,3,4,2},{6,2,3,7},{9,2,3,0}};
		
		System.out.println();
		
		for(int i=0;i<A.length;i++) {
			System.out.print(A[i][i]+" ");
		}
		
		System.out.println();
		
		for(int i=0;i<A.length;i++) {
			System.out.print(A[i][A.length-1-i]+" ");
		}
	}

	

}
