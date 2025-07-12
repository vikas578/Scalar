package Practice;

import java.util.Scanner;

public class Pattern {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int R = sc.nextInt();
		
		for(int i=0;i<=R;i++) {
			for(int j=i;j<R;j++) {
				System.out.println(" ");
				for(int k=1; k<=(2*i-1);k++) {
					System.out.print("*");
					
				}
			}
		}
	}

}
