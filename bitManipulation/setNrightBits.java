package bitManipulation;

public class setNrightBits {
	public static void main(String[] args) {
		int A =32;
		int N = 3;
		int X  = 0;
//		for(int i=0;i<N;i++) {
//			X=A|(1<<i);
//		}
		X=A|(1<<N)-1;
		
		System.out.println(X);
		
		
	}
	
	
}
