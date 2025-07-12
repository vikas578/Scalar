package MYClass;

import java.util.Scanner;

public class MYClass {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array.");
		int N = sc.nextInt();
		int[] a = new int[N];
		
		for(int i=0;i<N;i++){
			a[i]= sc.nextInt();
			
		}
		
		int greatest = a[0];
		
		for (int i=0;i<N;i++){  
			if(greatest>a[i]) {
				greatest = a[i];
			}
        }  
		System.out.println(greatest);
		
		int sum = 0;
		
		for(int i=0;i<N;i++){
			sum += a[i];
		}
		
		System.out.println(sum);
		
	}
}


