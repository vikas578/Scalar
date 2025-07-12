package recursion;

import java.util.Scanner;

public class SumOfDigits {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		System.out.println(SumD(a));
		
	}
	public static int SumD(int a) {
		if(a==0) 
			return 0;
		return a%10 + SumD(a/10);
	}

}
