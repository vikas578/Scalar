package Revision;

import java.util.Scanner;

public class CircleArea {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int r = sc.nextInt();
		
		float a = (float) (3.1416*r*r);
		System.out.printf("%.3f",a);
	}

}

