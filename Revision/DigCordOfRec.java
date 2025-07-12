package Revision;

import java.util.Scanner;

public class DigCordOfRec {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		int A1 = sc.nextInt();
		int B1 = sc.nextInt();
		int A2 = sc.nextInt();
		int B2 = sc.nextInt();
		int area = 0;
		
		area = Math.abs((A1-A2)*(B1-B2));
		System.out.println(area);
	}

}
