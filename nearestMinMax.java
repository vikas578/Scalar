package array;

public class nearestMinMax {
	public static void main(String[] args) {
		int[] A = {2,1,3,8,1,4,2,1,3,4,8,6,8,4};
		int N =A.length;
		int ans = N;
		int max=A[0],min=A[0];
		for(int i=0;i<N;i++) {
			if(max<A[i]) {
				max=A[i];
			}
			if(min>A[i]) {
				min=A[i];
			}
		}
		if(max==min) {
			System.out.println(0);
			return;
		}
		
		int min_i=-1,max_i=-1;
		for(int i=0;i<N;i++) {
			if(A[i]==min) {
				min_i=i;
				if(max_i!=-1) {
					int length=Math.abs(max_i-min_i) + 1;
					ans = Math.min(ans,length);
				}
			}
			
			else if(A[i]==max) {
				max_i=i;
				if(min_i!=-1) {
					int length=Math.abs(max_i-min_i) + 1;
					ans = Math.min(ans,length);
				}
			}
		}
				System.out.println(ans);
	}
}
