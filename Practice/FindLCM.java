package Practice;

import java.util.Scanner;

public class FindLCM {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int l=0;
		int m = Math.max(a, b);
		
		for(int i=m;i<=a*b;i++) {
			if(i%a==0 && i%b==0) {
				l=i;
				break;
			}
		}
		System.out.println(l);
	}
}
