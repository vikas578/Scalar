package Practice;

import java.util.Scanner;

public class DoubleOfNo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		int doubleResult = N<<1;
		int halfResult = N>>1;
		
		System.out.println(doubleResult);
		System.out.println(halfResult);
		
	}
}
