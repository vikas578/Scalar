package Practice;

public class SumOfAnArray {
	public static void main(String[] args) {
		int A [] = {6,7,4};
		int sum = 0;
		int N = A.length;
		
		for(int i=0;i<N;i++) {
			sum = sum + A[i];
		}
		System.out.println(sum);
	}

}
