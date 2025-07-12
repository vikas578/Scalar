package array;

public class equiliberiumIndexOfArray {
	public static void main(String[] args) {
		
		int[] A = {5,4,3,5,2,6,8,2,1};
		int N =A.length;
		int[] PS = findPrefixSum.getPS(A);
		int sl;
		int sr;
		for(int i=0;i<N;i++) {
			if(i==0) {
				sl=0;
			}
			else
				sl = PS[i-1];
			if(i==N-1) {
				sr=0;
			}
			else
				sr = PS[N-1] - PS[i];
			if(sl==sr) {
				System.out.println(A[i]);
				
			}
		}
		
		
	}
}
