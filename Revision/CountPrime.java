package Revision;

import java.util.Scanner;

public class CountPrime {
	public static int Prime(int n) {
		int flag =0;
		
		for(int i=2;i*i<n;i++) {
			if(n%i==0) {
				flag=1;
				break;
			}
		}
		if(flag==0)
			return 1;
		return 0;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		
		int c=0;
		for(int i=2;i<=a;i++) {
			
		}
	}

}

