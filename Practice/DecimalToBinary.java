package Practice;

import java.util.Scanner;

public class DecimalToBinary {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int R;
		int binary=0;
		int p=1;
		while(A>0) {
			R = A%2;
			binary = binary + R*p;
			p = p*10;
			A = A/2;	
		}
		System.out.println(binary);

	}

}
