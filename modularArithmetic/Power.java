package modularArithmetic;

public class Power {
	public static void main(String[] args) {
		power(5,4,6);
	}
	
	public static int power(int a,int n, int P) {
		int ans = 1;
		for(int i=1;i<=n;i++) {
			ans = (ans%P * a%P)%P;
		}
		ans%=P;		
		return ans;
	}
}
