package array;

import java.util.Scanner;

public class FirstRepeatingElementIndex{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] a = new int[N];
		
		for(int i=0;i<N;i++) {
			a[i] = sc.nextInt();
		}
		int rep;
		rep = FindRepeatative(a,N);
		System.out.println(rep);
		
	}
	public static int FindRepeatative(int a[], int N) {
		for(int i=0;i<N;i++) {
			for(int j=i+1;j<N;j++) {
				if(a[i]==a[j]) {
					return i;
				}
			}
		}
		return -1;
	}

}
