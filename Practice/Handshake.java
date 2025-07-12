package Practice;

import java.util.Scanner;

public class Handshake {
	public static void main(String[] args) {
		int HS = 0;
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		
		HS = A*(A-1)/2;
		System.out.println("Total number of handshakes");
		System.out.println(HS);
		
		
	}

}
