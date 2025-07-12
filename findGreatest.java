package array;

public class findGreatest {
	public static void main(String[] args) {
		int[] a = {4,6,7,82,36,8,9,8,6,8,4,76,98,2};
		int n = a.length;
		int max = Integer.MAX_VALUE;
		int min = Integer.MIN_VALUE;
		
		for(int i=0;i<n;i++){
			if(max > a[i]) {
				max=a[i];
				
			}
		}
		for(int i=0;i<n;i++){
			if(min < a[i]) {
				min=a[i];
			}
		}
		System.out.println("kajal");
		System.out.println(" ");
		System.out.println(max);
		System.out.println(min);
	}
	
	
}
