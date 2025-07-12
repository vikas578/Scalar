package Practice;

public class Changing0TO1 {
	public static void main(String[] args) {
		int N = 64654;
		int result=0;
		int power=1;
		while(N>0) {
			int x = N%10;
//			if(x==0) {
//				x=1;
//			}
			result = result*10 + x;
			power*=10;
			N/=10;	
		}
		System.out.println(result);		
	}
}
