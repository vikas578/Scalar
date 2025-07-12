package array;

public class ProductArrayPuzzel {
	public static void main(String[] args) {
		int [] A = {2,5,6,7,8};
		int N = A.length;
		int PF[] = new int [N];
		PF[0] = A[0];
		
		for(int i=1;i<N;i++) {
			PF[i] = PF[i-1] * A[i];
		}
		
		int[] x = new int [N];
		
		for(int i=0;i<N;i++) {
			x[i] = PF[N-1] / A[i];
		}
		for(int i=0;i<N;i++) {
			System.out.print(x[i] + " ");
		}
	}

}
