package modularArithmetic;

public class NumberModuler {
	public static void main(String[] args) {
		int [] A = {7,3,2,5,1};
		int N = A.length;
		int p = 4;
		int ans = 0;
		
		for(int i=0;i<N;i++) {
			ans= ans + ((A[i]%p) * Power.power(10, N-1-i, p))%p;
			ans=ans%p;
		}
		
		System.out.println(ans);
		
	}

}
