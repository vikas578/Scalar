package Practice;

import java.util.Scanner;

public class Fibonacci {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		
		if(A>0) {
			int x = 0;
			int y = 1;
			int z;
			System.out.print("Fibonacci Series : "+x+", "+y+", ");
			while(y<A){
				z=x+y;
				x=y;
				y=z;
				if(y<=A) {
					System.out.print(y+", ");
				}
				else {
					System.out.println("invalid output");
				}
			}
			
		}
		
		
	}

}
