package Practice;

import java.util.Scanner;

public class Factorial {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		
		int F = 1;
		
		if(A<0) {
			System.out.println("invalid");
		}
		else {
			for( int i=1;i<=A;i++) {
				F=F*i;
			}
			System.out.println("Factorial is "+F);
		}
	}

}
