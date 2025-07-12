package Revision;

import java.util.Scanner;

public class AreaOhSphare {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int r = sc.nextInt();
		
		
		int a = (int)Math.ceil(Math.PI*r*r*r*4/3);
		
		
		System.out.println(a);
		
		
	}

}
