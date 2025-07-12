package Revision;

import java.util.Scanner;

public class factorial {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		
		int f=1;
		if(a>0) {
			for(int i=1;i<=a;i++) {
				f=f*i;
			}
			System.out.println(f);
		}
		else
			System.out.println("invalid");
	}

}
