package array;

public class LeaderInArray {
	public static void main(String[] args) {
		int A[] = {41,42,21,23,22,16,21,18,14};
		int N	= A.length;
		int count=1;
		int max = A[N-1];
		
		for(int i=N-2;i>=0;i--) {
			if(A[i]>max) {
				count++;
				max=A[i];
			}
		}
		
		System.out.println(count);
		
	}
}



//for(int i=0;i<N;i++) {
//	int flag=0;
//	for(int j=i+1;j<N;j++) {
//		if(A[i]<=A[j]) {
//			flag=1;
//			break;
//		}
//	}
//	if(flag==0)
//		count++;
//}
