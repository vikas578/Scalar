package array;

public class array {
	public static void main(String[] args) {
		int[] A = {2,3,52,2,5324,123,12,2,5};
		int num = 2;
		int occurence = 0;
		for(int i=0;i<A.length;i++) {
			if(A[i]==num) {
				occurence++;	
			}
		}
		System.out.println(occurence);
 	}
}
