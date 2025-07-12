package recursion;

import java.util.Scanner;

public class CheckPalindrome {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
		String S = sc.next();
		System.out.println(checkPalindrome(S));
		
	}
	public static boolean checkPalindrome(String S) {
		int l = S.length();
		if(l==0 || l==1)
			return true;
		if(l==2)
			return S.charAt(0) == S.charAt(1);
		return (S.charAt(0)==S.charAt(l-1)) && checkPalindrome(S.substring(1, l-1));
	}

}
