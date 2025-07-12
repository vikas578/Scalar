package Practice;

import java.util.Scanner;

public class Quad {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		
		if(A>0&&B>0) {
			System.out.println("In first quad");
		}
		else if(A<0&&B>0) {
			System.out.println("In second quad");
		}
		else if(A<0&&B<0) {
			System.out.println("In third quad");
		}
		else if(A>0&&B<0) {
			System.out.println("In forth quad");
		}
	}

}
