package array;

public class BulbsCarryForward {
	public static void main(String[] args) {
		int[] A = {0,1,1,0,0,1,0,0,1};
		int N = A.length;
		int count=0;
		
		for(int i=N-1;i>=0;i--) {
			if(A[i]==0 && i==0) {
				count++;
			}
			else {
				if(A[i-1]!=A[i]) {
					count++;
				}
			}
		}
		
		System.out.println(count);
	}
}
