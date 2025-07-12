package MYClass;

import array.findPrefixSum;

public class SubArrayprac {
	public static void main(String[] args) {
		int [] A = {3,4,5,6};
		int N = A.length;
		int total = 0;
		for(int start=0;start<=N;start++) {
			int sum=0;
			for(int end=start;end<=N-1;end++) {
				sum = sum+A[end];
				total = sum+=sum;
			}
				
			}
			
		
			
	}
		
		public static void printSumOfArray(int[] A)	{
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

		
//		TC = O(N^2) SC = O(1)
		public static void printSumOfSubarraysInNsqr(int[] A) {
			int N = A.length;
			for(int start=0;start<=N;start++) {
				int sum=0;
				for(int end=start;end<=N-1;end++) {
					sum=sum+A[end];
					System.out.println(sum);
				}
			}
		}
		
		
//		TC = O(N^2) SC = O(N)
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

//		TC = O(N^3) SC = O(1)
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

		
		
//		TC = O(1) SC = O(1)
		public static int countSubarray(int[] A) {
			int N = A.length;
			return N*(N+1)/2;
		}
		
		
//		TC = O(N^3) SC = O(1)
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


