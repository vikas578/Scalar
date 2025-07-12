package Practice;

import java.util.Scanner;

public class VowelsConsonants {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		 char  A= sc.next().charAt(0);
		
		
		if((A>='a' && A<='z') || (A>='A' && A<='Z')) {
			System.out.println("Alphabet");
			if((A=='a') || (A == 'e') || (A == 'i') || (A=='o') || (A == 'u')
					|| (A=='A') || (A == 'E') || (A == 'I') || (A=='O') || (A == 'U')) {
						System.out.println("its a vowel");
					}
					else {
						System.out.println("its a consonant");
					}
		}
		else {
			System.out.println("Not an alphabet");
		}
	}

}