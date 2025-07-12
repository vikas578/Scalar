package Practice;

import java.util.Scanner;

public class BinaryToOctal {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int N = 0;
		int D = 0;
		
		while(A>0) {
			int temp = A%10;
			D += temp*Math.pow(2, N);
			A = A/10;
			N++;
		}
		System.out.println(D);
		
		int R;
		int octal=0;
		int p=1;
		while(D>0) {
			R = D%8;
			octal = octal + R*p;
			p = p*10;
			D = D/8;	
		}
		System.out.println(octal);
		
	}

}
