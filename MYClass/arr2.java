package MYClass;

public class arr2 {
	public static void main(String[] args) {
		int[] arr = {3,8,9,6,8,4};
		int N = arr.length;
		
		reverseArray(arr, N-1, 0);
		
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i] + " ");
		}
		
		reverseArray(arr, 0, N-1);
		
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i] + " ");
		}
	}
	public static int[] reverseArray(int[] A, int start, int end) {
		int N =A.length;
		
		while(start<end) {
			int temp = A[start];
			A[start] = A[end];
			A[end] = temp;
			start++;
			end--;
		}
		
		return A;
	}

}
