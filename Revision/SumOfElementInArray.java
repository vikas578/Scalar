package Revision;

import java.util.Scanner;

public class SumOfElementInArray {
	public static void main(String[]args) {
		int a [] = {2,6,8,3};
		int s = 0;
		int n = a.length;
		
		for(int i=0;i<n;i++) {
			s = s + a[i];
		}
		System.out.println(s);
		
	}

}
