package Revision;

import java.util.Scanner;

public class GreatestLowestInArray {
	public static void main(String[]args) {
		int []a = {7,9,6,5,7,10,3};
		int n = a.length;
		int max = Integer.MAX_VALUE;
		int min = Integer.MIN_VALUE;
		
		for(int i=0;i<n;i++) {
			if(max > a[i]) {
				max = a[i];
			}
		}
		for(int i=0;i<n;i++) {
			if(min < a[i]) {
				min = a[i];
			}
		}
		System.out.println("Minimum number is "+max);
		System.out.println("Maximum number is "+min);
	}

}
