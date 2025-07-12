package Practice;

import java.util.Scanner;

public class NumberOfDigits {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		
		int c =0;
		
		if(A==0) {
			System.out.println("1 digit");
		}
		else {
			while(A!=0) {
				c++;
				A=A/10;
			}
			System.out.println("digits are "+c);
		}
	}

}
