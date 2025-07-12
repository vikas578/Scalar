package Revision;

import java.util.Scanner;

public class Pattern3 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		char c = 65;
		
		int i;
		int j;
		
		for(i=1;i<=n;i++) {
			for(j=1;j<=i;j++) {
				System.out.print(c+ " ");
			}
			c++;
			System.out.println();
		
		}
	}

}
