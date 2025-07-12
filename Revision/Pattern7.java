package Revision;

import java.util.Scanner;

public class Pattern7 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int a=1;
		
		for(int i=n;i>=1;i--) {
			for(int j=n-i+1;j<=n-1;j++) {
				System.out.print(a+" ");
				a++;
			}
			System.out.println();
		}
	}

}
