package Practice;

import java.util.Scanner;

public class LCM {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt ();
		
		int l = 1;
		
		int m = (A > B) ? A : B;
		
		for(int i=m;i<=A*B;i++) {
			 if (i%A==0&&i%B==0) {
				  l=i;
			      break; 
			 }
		}
		System.out.println(l);
	}

}
