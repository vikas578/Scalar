package array;

public class maximizeElements {
public static void main(String[] args) {
	int[] A = {2,4,1,3,2};
	int max = A[0];
	int sum=0;
	int N = A.length;
	for(int i=0;i<N;i++) {
		if(max<A[i]){
			max=A[i];
		}
	}
	
	int[] PS = findPrefixSum.getPS(A);
	sum = max*N-PS[N-1];
	
//	for(int i=0;i<N;i++) {
//		sum+=max-A[i];
//	}
	
	System.out.println(sum);
	
}


}
