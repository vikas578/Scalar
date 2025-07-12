package Revision;

import java.util.Scanner;

public class FindVowelConstonent {
	
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		char  A =sc.next().charAt(0);
		
		if(A =='a'||A == 'e'||A == 'i'||A == 'o'||A == 'u') {
			System.out.println("its a vowel");
		}
		else {
			System.out.println("its a constant");
		}
		
		
	}

}
