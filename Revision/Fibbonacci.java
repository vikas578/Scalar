package Revision;

import java.util.Scanner;

public class Fibbonacci {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		
		if(a>0) {
			int x = 0;
			int y = 1;
			int z;
			System.out.print("Fibonacci Series : "+x+" "+y+" ");
			while(y<a){
				z=x+y;
				x=y;
				y=z;
				if(y<=a) {
					System.out.print(y+" ");
				}
			}
		}
		else {
			System.out.println("invalid output");
		}

		
	}

}
