package array;

public class linearSearch {
	public static void main(String[] args) {
		int[] A = new int[] {2,2,2,2,2,2,2,3};
		
		int[] occ = findOccurence(A, 2);
		
		for(int i: occ) {
			if(i==-1)
				break;
			System.out.println(i);
		}
	}
	static int[] findOccurence(int[] A, int key) {
		int N = A.length;
		int[] occ = new int[N+1];
		int j=0;
		for(int i=0;i<N;i++) {
			if(A[i]==key) {
				occ[j]=i;
				occ[j+1]=-1;
				j++;
			}
		}
		
		return occ;
	}
}

