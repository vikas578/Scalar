package Practice;

import java.util.Scanner;

public class PositiveOrNegetive {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		
		if(A<0) {
			System.out.println("Negetive");
		}
		else {
			System.out.println("Positive");
		}
	}

}
