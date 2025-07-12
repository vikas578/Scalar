package Revision;

import java.util.Scanner;

public class ConsonantWithFuntion {
	public static boolean Checkpalindrom(char n) {
		char [] arr = {'a','e','i','o','u'};
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i] == n) 
				return true;
		}
		return false;
	}
	
	public static boolean CheckVowels(char n) {
		char [] vowels = {'a','e','i','o','u'};
		
		for(char vowel:vowels) {
			if(vowel==n)
				return true;
			}
		return false;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char a = sc.next().charAt(0);
		System.out.println(Checkpalindrom(a));
		System.out.println(CheckVowels(a));	
	}
	

}
