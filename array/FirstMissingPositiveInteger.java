package array;

import java.util.ArrayList;
import java.util.HashSet;

public class FirstMissingPositiveInteger {
	public static void main(String[] args) {
		ArrayList<Integer> A = new ArrayList<>();
		A.add(2);
		A.add(3);
		A.add(1);
		A.add(5);
		A.add(4);
		A.add(0);
		A.add(8);	
		
		System.out.println(firstMissing(A));
		
//		insert(A, 3, 6);
//		
//		for(int i=0;i<A.size();i++)
//			System.out.println(A.get(i));
	}
	public static void insert(ArrayList<Integer> A, int X, int Y) {
		
		int N = A.size();
		for(int i=N-1;i>X;i--) {
			A.set(i+1, A.get(i));
		}
		A.set(X, Y);
	}
	
	public static int firstMissing(ArrayList<Integer> A) {
		
		
		HashSet<Integer> H = new HashSet<Integer>(A);
		int N = H.size();
		for(int i=1;i<N;i++) {
			if(!H.contains(i)) {
				return i;
			}
		}
		return N;
	}
}
