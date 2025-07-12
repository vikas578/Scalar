package array;

public class arrayReverseWithoutSpace {
	public static void main(String[] args) {
		int[] A = {23,5,2,5,32,23,2};
		int N =A.length;
		
//		 for(int i=0;i<(N-1)/2;i++){
//			int temp = A[i];
//			A[i] = A[N-1-i];
//			A[N-1-i] = temp;
//		}
		
		int i = 0;
		int j = N-1;
		
		while(i<j) {
			int temp = A[i];
			A[i] = A[j];
			A[j] = temp;
			i++;
			j--;
		}
		
		
		for(int k=0;k<N;k++) {
			System.out.print(A[k] + " ");
		}
		
		
	}
}
