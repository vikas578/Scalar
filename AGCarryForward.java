package array;

public class AGCarryForward {
	public static void main(String[] args) {
		char [] A = {'a','s','g','a','r','s','g','y','d','a','g'};
		int N = A.length;
		int c = 0;
		int sum = 0;
		
//		for(int i=0;i<N;i++) {
//			if(A[i]=='a') {
//				for(int j= i+1;j<N;j++) {
//					if(A[j]=='g') {
//					c++;	
//					}
//					
//				}
//			}
//		}
		
		for(int i=N-1;i>=0;i--) {
			if(A[i]=='g') {
				c++;
			}
			if(A[i]=='a') {
				sum += c;
			}
		}
		System.out.println(sum);
	}

}
