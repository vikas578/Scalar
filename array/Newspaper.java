package array;

import java.util.Scanner;

public class Newspaper {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		int[] a = new int[7];
		
		for(int i=0;i<7;i++) {
			a[i] = sc.nextInt();
		}
		
		System.out.println(calDay(a, t)[1]);
	}
	
	public static int[] calDay(int A[], int B) {
		int sum=0;
		int day=0;
		int NoOfDay=0;
		while(sum<=B) {
			sum+=A[day];
			day++;
			NoOfDay++;
			if(day==7)
				day=0;
		}
		int[] C = {day,NoOfDay};
		return C;
	}

}
