package MYClass;

public class getprefixsum {
	public static void main(String[] args) {
		int [] A = {5,6,7,4,3,5,6,5,4};
		int N = A.length;
		int [] PS = new int [N];
		PS[0] = A[0];
		for(int i=1;i<N;i++) {
			PS[i] = PS[i-1]+A[i];
		}
		for(int i=0;i<N;i++) {
			System.out.print(PS[i] + " ");
		}
	}

}
