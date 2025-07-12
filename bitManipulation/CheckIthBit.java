package bitManipulation;
// Given N & i, check if ith bit position in N is set

public class CheckIthBit {
	public static void main(String[] args) {
		int N = 25, i =6;
		System.out.println((N>>i)&1);
	}
}
