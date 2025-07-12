package Practice;

import java.util.Scanner;

public class OctalToBinary {
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
		int R;
		int binary=0;
		int p=1;
		while(D>0) {
			R = D%2;
			binary = binary + R*p;
			p = p*10;
			D = D/2;	
		}
		System.out.println(binary);

		

	}
}	
