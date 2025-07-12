package Revision;

import java.util.Scanner;

public class Sqroot {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(squareroot(n));
		
	}
	public static int squareroot(int a) {
		int ans=0;
		int s=0;
		int e=a;
		int mid;
		
		while(s<=e) {
			mid=(s+e)/2;
			if(mid*mid<=a) {
				s=mid+1;
				ans=mid;
			}
			else {
				e=mid-1;
			}			
		}
		return ans;
	}
}
