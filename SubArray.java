package array;

public class SubArray {
	public static void main(String[] args) {
		int A[] = {4,3,2,5};
		printTotalSumOfAllSubarraysUsingContribution(A);
	
	}

	
//	TC = O(N^2) SC = O(1)
	public static void printTotalSumOfAllSubarraysUsingContribution(int[] A) {
		int N = A.length;
		int totalSum=0;
		for(int i=0;i<N;i++) {
			totalSum+= getContibutionOfAnIndex(A, i); // O(1)
		}
		System.out.println(totalSum);
	}

	
//	TC = O(1) SC = O(1)
	public static int getContibutionOfAnIndex(int[] A,int i) {
		int N = A.length;
		int contribution = (i+1)*(N-i)*A[i];
//		System.out.println("Contribution of " + i + " is: " + contribution );
		return contribution;
	}
	
//	TC = O(N^2) SC = O(1)
	public static void printTotalSumOfAllSubarrays(int[] A) {
		int N = A.length;
		int totalSum=0;
		for(int start=0;start<=N;start++) {
			int sum=0;
			for(int end=start;end<=N-1;end++) {
				sum=sum+A[end];
				totalSum+=sum;
			}
		}
		System.out.println(totalSum);
	}

//	TC = O(N) SC = O(1)
	public static void printMaxSumOfSubarraysInN(int[] A) {
		int N = A.length;
		int sum=0;
		int max = Integer.MIN_VALUE;
		for(int i=0;i<N;i++) {
			sum=sum+A[i];
			max = Math.max(max, sum);
			if(sum<0) {
				sum=0;
			}
		}
		System.out.println(max);
	}

	
//	TC = O(N^2) SC = O(1)
	public static void printMaxSumOfSubarraysInNsqr(int[] A) {
		int N = A.length;
		int max = Integer.MIN_VALUE;
		for(int start=0;start<=N;start++) {
			int sum=0;
			for(int end=start;end<=N-1;end++) {
				sum=sum+A[end];
				if(max<sum) {
					max=sum;
				}
			}
		}
		System.out.println(max);
	}

	
//	TC = O(N^2) SC = O(1)
	public static void printSumOfSubarraysInNsqr(int[] A) {
		int N = A.length;
		for(int start=0;start<N;start++) {
			int sum=0;
			for(int end=start;end<N;end++) {
				sum=sum+A[end];
				System.out.println(sum);
			}
		}
	}
	
	
//	TC = O(N^2) SC = O(N)
	public static void printSumOfSubarraysUsingPS(int[] A) {
		int N = A.length;
		int[] PS = findPrefixSum.getPS(A);
		for(int start=0;start<=N;start++) {
			for(int end=start;end<=N-1;end++) {
				if(start==0) {
					System.out.println(PS[end]);
				}
				else {
					System.out.println(PS[end] - PS[start-1]);					
				}
			}
		}
	}

//	TC = O(N^3) SC = O(1)
	public static void printSumOfSubarrays(int[] A) {
		int N = A.length;
		
		for(int start=0;start<=N;start++) {
			for(int end=start;end<=N-1;end++) {
				int sum=0;
				for(int k=start;k<=end;k++) {
					sum+=A[k];
				}
				System.out.println(sum);
			}
		}
	}

	
//	TC = O(1) SC = O(1)
	public static int countSubarray(int[] A) {
		int N = A.length;
		return N*(N+1)/2;
	}
	
	
//	TC = O(N^3) SC = O(1)
	public static void printSubarray(int[] A) {
		int N = A.length;	
		for(int start=0;start<=N;start++) {
			for(int end=start;end<=N-1;end++) {
				for(int k=start;k<=end;k++) {
					System.out.print(A[k] + " ");
				}
				System.out.println();
			}
		}
	}
}
