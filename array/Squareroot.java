package array;

import java.util.Scanner;

public class Squareroot {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(findroot(n));
	}
	public static int findroot(int a) {
		int res=0;
		int start=0;
		int end=a;
		int mid;
		
		while(start<=end) {
			mid=(start+end)/2;
			if(mid*mid<=a) {
				start=mid+1;
				res=mid;
			}
			else
				end=mid-1;
		}
		return res;
		
	}

}
