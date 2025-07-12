package recursion;

import java.util.Scanner;

public class MultiplyNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println(multiply(a,b));
	}
	public static int multiply(int a, int b) {
		if(b==1) 
			return a;
		return a+multiply(a,b-1);
	}
}


