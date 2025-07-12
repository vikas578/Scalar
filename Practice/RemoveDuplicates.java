package Practice;

import java.util.HashSet;

public class RemoveDuplicates {
	public static void main(String[] args) {
		int[] A = {21,32,12,21,42,42,5,54};
		HashSet<Array> hm = new HashSet<>();
		for(int i=0;i<A.length;i++) {
			hm.add(A[i]);
		}
		hm.toArray();
		
		for(int i=0;i<hm.size();i++) {
			System.out.println(hm[i]);
		}
		
		
	}
}
