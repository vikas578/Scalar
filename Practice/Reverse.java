package Practice;

import java.util.Scanner;

public class Reverse {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		
		int r = 0;
		
		while(A!=0) {
			int B = A%10;
			  r=r*10+B;

	            A=A/10;
		}
		System.out.println(r);
		
	}

}
