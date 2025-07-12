package array;

import java.util.ArrayList;
import java.util.Scanner;

public class RemoveFromX {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
 		ArrayList<Integer> A = new ArrayList<Integer>(N);
		for(int i=0;i<N;i++) {
			A.add(sc.nextInt());
		}
		
		int X = sc.nextInt();
		A.remove(X-1);
		
		for(int i=0;i<N-1;i++) {
			System.out.println(A.get(i));
		}
	}
}
