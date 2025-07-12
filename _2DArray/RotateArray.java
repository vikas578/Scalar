package _2DArray;

public class RotateArray {
	public static void main(String[] args) {
		int[][] A = {{1,5,4,5},{2,3,4,2},{6,2,3,7},{9,2,3,0}};
		print2DArray.printArray(A);
		rotate180DegreeClockwise(A);
		System.out.println();
		print2DArray.printArray(A);
	}
	
	public static void rotate90DegreeClockwise(int[][] A) {
		transposeSquareMatrix.transposeArray(A);
		Mirror2DArray.VerticalMirrorArray(A);
	}

	public static void rotate180DegreeClockwise(int[][] A) {
		Mirror2DArray.VerticalMirrorArray(A);
		Mirror2DArray.HorizontalMirrorArray(A);
	}

}
