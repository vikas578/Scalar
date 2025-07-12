package array;

public class findPrefixSum {
	public static void main(String[] args) {
		int [] A = {3,2,4,5,3,2,9,8};
		int N = A.length;
		
		int PS[] = new int [N];
		
		PS[0] = A[0];
		
		for(int i=1;i<N;i++) {
			PS[i] = (PS[i-1]+A[i]);
		}
		
		for(int i=0;i<N;i++) {
			System.out.print(PS[i] + " ");
		}
		
	}
	
	public static int[] getPS(int[] A) {
		int N = A.length;
		int PS[] = new int [N];
		PS[0] = A[0];
		for(int i=1;i<N;i++) {
			PS[i] = (PS[i-1]+A[i]);
		}
		return PS;
	}

}
