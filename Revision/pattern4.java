package Revision;

import java.util.Scanner;

public class pattern4 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int i;
		int j;
		
		for(i=n;i>=1;i--) {
			for(j=1;j<=i;j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		
		}
	}

}
