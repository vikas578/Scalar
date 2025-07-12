package recursion;

import java.util.Scanner;

public class CommonDivisor {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println(CommonDivisor(a,b));
		System.out.println(gcd(a,b));
	}
	public static int CommonDivisor(int a,int b) {
		if(a==0) 
			return b;
		if(b==0) 
			return a;
		if(a==b)
			return a;
		if(a>=b)
			return CommonDivisor(a-b,b);
		else
			return CommonDivisor(b-a,a);	
	}
	
	
	//Euclied's Method
	public static int gcd(int A, int B) {
		if(B==0) 
			return A;
		return gcd(B,A%B);
		
	}
}
