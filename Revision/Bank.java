package Revision;

import java.util.Scanner;

public class Bank {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int o = sc.nextInt();
		int a = sc.nextInt();
		
		if(o==1) {
			n = n+a;
		}
		else if(o==2){
			n = n-a;
		}
		else {
			System.out.println("invalid option");
		}
		if(n<=0 && o>2) {
			System.out.println(n);
		}
		else {
			System.out.println("Insufficient Balance");
		}
		
	
		
	}

}
