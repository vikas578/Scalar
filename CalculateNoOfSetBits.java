package bitManipulation;

public class CalculateNoOfSetBits {
	public static void main(String[] args) {
		int N = 65;
		int setCount=0;
		while(N>0) {
			if((N&1)==1) {
				setCount++;
			}
			N = N>>1;
		}
		if(setCount==1) {
			System.out.println("Its a power of 2");
		}
		else {
			System.out.println("Its not power of 2");
		}
		
		System.out.println(setCount);
	}
}
