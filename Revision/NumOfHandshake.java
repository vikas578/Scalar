package Revision;

import java.util.Scanner;

public class NumOfHandshake {
	public static void main(String[]args) {
		int h = 0;
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		
		h = a*(a-1)/2;
		System.out.println("Total number of handshakes");
		System.out.println(h);
		
	}

}
