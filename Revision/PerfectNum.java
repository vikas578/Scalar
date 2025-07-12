package Revision;

import java.util.Scanner;

public class PerfectNum {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		
		int s = 0;
		
		for(int i=1;i<=a;i++) {
			if(a%i==0) {
			s=s+i;
			}
			
		}
		
		if(s==a) {
			System.out.println("Perfect number");
		}
		else {
			System.out.println("Not a perfect number");
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
