package Revision;

import java.util.Scanner;

public class AreaOfCircle {
	
	public static void main(String[] args) {
		int area;
		
		Scanner sc = new Scanner(System.in);
		int R = sc.nextInt();
		
		area = 2*R*(22/7);
		
		System.out.println("area of circle " + area);
	}

}
