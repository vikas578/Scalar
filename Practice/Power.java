package Practice;

import java.util.Scanner;

public class Power {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt ();
		
		int P = 1;
		
		while(B!=0) {
			
			P*=A;
			B--;
		}
		System.out.println(P);
	}

}
