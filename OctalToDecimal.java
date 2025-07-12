package Practice;

import java.util.Scanner;

public class OctalToDecimal {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int Oct = sc.nextInt();
		int N = 0;
		int D = 0;
		
		while(Oct>0) {
			int temp = Oct%10;
			D += temp*Math.pow(8, N);
			Oct = Oct/10;
			N++;
		}
		System.out.println(D);
	}

}
