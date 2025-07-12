package bitManipulation;
// All elements are repeating exactly twice except 1 element. Find distinct element 
public class FindDistinct {
	public static void main(String[] args) {
		int[] A = {2,3,4,2,6,7,3,4,6};
		int result=0;
		for(int i=0;i<A.length;i++) {
			result = result^A[i];
		}
		
		System.out.println(result);
	}
}
