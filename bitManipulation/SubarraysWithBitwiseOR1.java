package bitManipulation;

public class SubarraysWithBitwiseOR1 {
	public static void main(String[] args) {
		int[] A = {1,0,1,0,0,0};
		int N = A.length;
		int totalSub = N*(N+1)/2;
		int tZ=0;
		int z=0;
		
		for(int i=0;i<N;i++) {
			if(A[i]==0) {
				z++;
			}
			else {
				tZ+=z*(z+1)/2;
				z=0;
			}
		}
		tZ+=z*(z+1)/2;
		
		System.out.println(totalSub - tZ);
		
		
		
	}
}
