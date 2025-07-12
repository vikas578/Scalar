package Practice;

import java.util.Scanner;

public class TypeOfarray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("size of the array");
		int n=sc.nextInt();
		int[]arr=new int[n];
		
		System.out.println("enter the elements");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		
		int e=0;
		int o=0;
		
		for(int i=0;i<n;i++){
			if((arr[i]%2)==0) 
				e +=1;
				
			else
				o +=1;
			
		}
		if(o==0) {
			System.out.println("odd");
		}
		else if(e==0) {
			System.out.println("even");
		}
		else {
			System.out.println("Mixed");
		}
	}
}
			
	
	


