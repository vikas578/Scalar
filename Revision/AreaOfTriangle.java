package Revision;

import java.util.Scanner;

public class AreaOfTriangle {
	
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int s = (a+b+c)/2;
		float area = (float) Math.sqrt(s*(s-a)*(s-b)*(s-c));
		
		System.out.println(area);
		
	}

}
