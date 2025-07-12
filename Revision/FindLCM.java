package Revision;

import java.util.Scanner;

public class FindLCM {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		int L=0;
		
		int m=(x>y) ? x:y;
		
		for(int i=m;i<=x*y;i++) {
			if(i%x==0&&i%y==0) {
				L=i;
				break;
			}
		}
		System.out.println("the LCM is "+L);
		
	}

}
