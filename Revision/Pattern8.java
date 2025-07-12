package Revision;

import java.util.Scanner;

public class Pattern8 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int x=1;
		char a=65;
		
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				if(i%2==0) {
					System.out.print(a+ " ");
					a++;
				}
				else {
					System.out.print(x+" ");
					x++;
				}
				
				
			}
			System.out.println();
		}
		

	}
}
