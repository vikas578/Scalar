package recursion;

import java.util.Scanner;

public class fibbonacci {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.print(fibbo(n));
	}
	public static int fibbo(int n) {
		if(n==0) 
			return 0;
		if(n==1) 
			return 1;
		return fibbo(n-1) + fibbo(n-2);
	}
}
