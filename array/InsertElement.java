package array;

import java.util.ArrayList;

public class InsertElement {
	public static void main(String[] args) {
		int[] A = new int[] {1,2,3,4,5,7};
		ArrayList<Integer> AL = new ArrayList<>();
		AL.add(2);
		AL.add(3);
		AL.add(1);
		AL.add(5);
		AL.add(4);
		AL.add(0);
		AL.add(8);
		
		int newVal = 6;
		int pos = 3;
		
		int[] B = insertUsingArray(A, newVal, pos);
		
		for(int i=0;i<B.length;i++) {
			System.out.print(B[i] + " ");
		}
		
		insertUsingArrayList(AL, newVal, pos);
		
		System.out.println("ArrayList output: ");
		for(int i=0;i<AL.size();i++) {
			System.out.print(AL.get(i) + " ");
		}
		
	}
	
	static ArrayList<Integer> insertUsingArrayList(ArrayList<Integer> A, int newVal, int pos){
		
		A.set(pos-1, newVal);
		return A;
	}
	
	static int[] insertUsingArray(int[] A, int newVal, int pos) {
		int[] B = new int[A.length+1];

		for(int i=0;i<pos-1;i++) {
			B[i]=A[i];
		}
		B[pos-1]=newVal;
		
		for(int i=pos;i<B.length;i++) {
			B[i] = A[i-1];
		}
		
		return B;
	}
	
	
}
