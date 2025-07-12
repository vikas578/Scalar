package Revision;

import java.util.Scanner;

public class ReverseT {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		while(T>0) {
			int n = sc.nextInt();
			int r = 0;
			
			while(n!=0) {
				int B = n%10;
				  r=r*10+B; 

		            n=n/10;
			}
			T--;
			System.out.println(r);
		}
	}

}
