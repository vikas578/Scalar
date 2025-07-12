package array;

public class specialIndex {
	public static void main(String[] args) {
		int[] A = {6,8,6,9,4,9,4};
		int N = A.length;
		int[]PSe = new int[N];
		int[]PSo = new int[N];
		
		PSe[0] = A[0];
		PSo[0] = 0;
		
		for(int i=1;i<N;i++) {
			if(i%2==0) {
				PSe[i] = PSe[i-1] + A[i];
				PSo[i] = PSo[i-1];
			}
			else {
				PSe[i] = PSe[i-1];
				PSo[i] = PSo[i-1] + A[i];
			}
		}
		int Se,So;
		for(int i=0;i<N;i++) {
			if(i==0) {
				Se = (PSo[N-1] - PSo[i]);
				So = (PSe[N-1] - PSe[i]);
			}
			else {
				Se = PSe[i-1] + (PSo[N-1] - PSo[i]);
				So = PSo[i-1] + (PSe[N-1] - PSe[i]);
			}
			if(Se==So) {
				System.out.println(i);
			}
		}
	}
}
