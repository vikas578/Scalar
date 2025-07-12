package array;

public class BinarySearch {
	public static void main(String[] args) {
		int[] A = new int[] {2,3,4,5,7,7,7,7,7,7,7,7,34,55,67,87,89,90,96,123};
		System.out.println(binarySearch(A, 2));
		
		System.out.println(firstOccurenceBinarySearch(A, 7));
		System.out.println(lastOccurenceBinarySearch(A, 7));

	}
	
	static boolean binarySearch(int[] A, int key) {
		int N = A.length;
		int s=0;
		int e= N-1;
		int mid;
		
		while(s<=e) {
			mid = (s+e)/2;
			if(A[mid] == key)
				return true;
			if(A[mid]> key) {
				e=mid-1;
			}
			if(A[mid]<key) {
				s=mid+1;
			}
		}
		return false;
	}
	
	static int firstOccurenceBinarySearch(int[] A, int key) {
		int ans =-1;
		int N = A.length;
		int s=0;
		int e=N-1;
		int mid;
		
		while(s<=e) {
			mid = (s+e)/2;
			if(A[mid]==key) {
				ans=mid;
				e=mid-1;
			}
			if(A[mid]<key) {
				s=mid+1;
			}
			if(A[mid]>key) {
				e=mid-1;
			}
		}
		return ans;
	}
	static int lastOccurenceBinarySearch(int[] A, int key) {
		int ans=-1;
		int N=A.length;
		int s=0;
		int e=N-1;
		int mid;
		
		while(s<=e) {
			mid = (s+e)/2;
			if(A[mid]==key) {
				ans=mid;
				s=mid+1;
			}
			if(A[mid]<key)
				s=mid+1;
			if(A[mid]>key)
				e=mid-1;
				
		}
		return ans;
	}
}
