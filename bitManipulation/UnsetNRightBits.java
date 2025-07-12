package bitManipulation;

public class UnsetNRightBits {
	public static void main(String[] args) {
		int A =22;
		int N = 3;
		int X = 0;
		int Y = ~((1<<N)-1);
		X = A&Y;
		System.out.println(X);
	}

}
