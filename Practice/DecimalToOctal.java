package Practice;

import java.util.Scanner;

public class DecimalToOctal {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int R;
		int Oct=0;
		int p=1;
		while(A>0) {
			R = A%8;
			Oct = Oct + R*p;
			p = p*10;
			A = A/8;	
		}
		System.out.println(Oct);

	}
	}


