package Practice;

import java.util.Scanner;

public class Vowel {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		 char  A= sc.next().charAt(0);
		
		if(A =='a'||A == 'e'||A == 'i'||A == 'o'||A == 'u') {
			System.out.println("its a vowel");
		}
		else {
			System.out.println("its a constant");
		}
		if(A>='a' && A<='z') {
			System.out.println("Alphabet");
		}
		else {
			System.out.println("Not an alphabet");
		}
	}

}
