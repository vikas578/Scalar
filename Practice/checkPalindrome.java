package Practice;

import java.util.Scanner;

public class checkPalindrome {
	public static void main(String[] args) {
		// reverse the no and compare with original 
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		
		int B = 0;
		int Rev =0;
		int C =A;
		
		while(A!=0) {
			B=A%10;
            Rev=Rev*10+B;
            A=A/10;
		}
		if(Rev==C) {
			System.out.println("Palindrom number");
		}
		else {
			System.out.println("Not a palindrom");
		}
	}
}
