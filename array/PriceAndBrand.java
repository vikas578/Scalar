package array;

public class PriceAndBrand {
	public static void main(String[] args) {
		int[] A = new int[] {4,6,7,8,9,10,16};
		int[] B = new int[] {20,40,60,55};
		
		int[] res = solve(A,B);
		
		for(int i=0;i<res.length;i++) {
			System.out.print(res[i]+" ");
		}
	}
	public static int[] solve(int[] A, int[] B) {
		int res[] = new int[B.length];
		for(int i=0;i<B.length;i++) {
			int sum=0;
			for(int j=0;j<A.length;j++) {
				if(sum+A[j]<=B[i]) {
					sum=A[i];
					res[i]=j+i;
				}
			}
		}
		return res;
	}
}
