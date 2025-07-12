package Practice;

import java.util.Scanner;

public class FindPower {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int p = sc.nextInt();
		int r =0;
		
		for(int i=1;i<=p;i++) {
			r = (int) Math.pow(a,i);
		}
		System.out.println(r);
	}

}
