package bitManipulation;

public class Find2DistinctNo {
	public static void main(String[] args) {
		int[] A = {1,2,3,4,3,6,2,1};
		
		int xor =0;
		
		for(int i=0;i<A.length;i++) {
			xor=xor^A[i];
		}
		
		int rightSet = xor&-xor;
		
		int zeroes=0,ones=0;
		
		for(int i=0;i<A.length;i++) {
			if((rightSet&A[i])==0) {
				zeroes = zeroes^A[i];
			}
			else {
				ones = ones^A[i];
			}
		}
		
		System.out.println(zeroes + " and " + ones);
		
	}

}
