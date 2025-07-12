package modularArithmetic;

public class AModuloB {
	public static void main(String[] args) {
		int[] A = {2,3,4,2,4,1,8,0,2};
		int B = 4;
		
		int N = A.length;
		int ans = 0;
		int p =1;
		for(int i=N-1;i>=0;i--) {
			ans = (ans%B + (A[i]*p)%B)%B;
			p=p*10;
		}
		ans = ans%B;
		
		System.out.println(ans);
		
	}
}
