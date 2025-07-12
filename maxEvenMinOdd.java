package array;

public class maxEvenMinOdd {

	public static void main(String[] args) {
		int[] A = {32,67,87,453,12,2};
		int maxEven=Integer.MIN_VALUE;
		int minOdd=Integer.MAX_VALUE;
		int N = A.length;
		for(int i =0;i<N;i++) {
			if(A[i]%2==0 && maxEven<A[i]) {
					maxEven=A[i];
			}
			else if(A[i]%2==1 && minOdd>A[i]){
					minOdd=A[i];
			}
		}
		
		System.out.println(maxEven);
		System.out.println(minOdd);
		
		System.out.println(Math.abs(maxEven-minOdd));
	}
	
	
}
