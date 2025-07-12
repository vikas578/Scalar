package recursion;

import java.util.Scanner;

public class SumOfEvens {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(sum(n));
	}
	public static int sum(int n) {
		int a=0;
		if(n==2) 
			return 2;
		
		if(n%2==0) {
			a= a+n;
			}
		return a+sum(n-1);
	}
}