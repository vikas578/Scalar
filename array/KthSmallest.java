package array;

import java.util.ArrayList;
import java.util.Scanner;

public class KthSmallest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		ArrayList<Integer> A = new ArrayList<Integer>(N);
		for(int i=0;i<N;i++) {
			A.add(sc.nextInt());
		}
		System.out.println("enter term : ");
		int k=sc.nextInt();
		
		for(int i=0;i<k;i++) {
			int min_index=i;
			for(int j=i+1;j<N;j++) {
				if(A.get(min_index)>A.get(j)) {
					min_index=j;
				}
			}
			 int temp = A.get(i);
			 A.set(i, A.get(min_index));
			 A.set(min_index, temp);
		}
		System.out.println(A.get(k-1));	
	}
}
