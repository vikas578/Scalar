package array;
// 1,3,5,24,32,5
// 5,32,24,5,3,1



public class arrayReverse {
	public static void main(String[] args) {
		int[] A = {1,3,5,24,32,5};
		int[] reverse = new int[A.length];
		
		// with extra space
		for(int i=0;i<A.length;i++) {
			reverse[i] = A[A.length-i-1];
		}
		
		for(int i=0;i<A.length;i++) {
			System.out.print(reverse[i] + " ");
		}
		
		
		
		
	}
}
