package Practice;

public class GreatestAndLowest {
	public static void main(String[] args) {
		int []A = {7,9,6,5,9,3};
		int N = A.length;
		int max = Integer.MAX_VALUE;
		int min = Integer.MIN_VALUE;
		
		for(int i=0;i<N;i++) {
			if(max > A[i]) {
				max = A[i];
			}
		}
		for(int i=0;i<N;i++) {
			if(min < A[i]) {
				min = A[i];
			}
		}
		System.out.println(max);
		System.out.println(min);
	}

}
