package Practice;

import java.util.Scanner;

public class LeapYear {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		
		if((A%4==0 && A%100!=0)|| A%400==0) {
			System.out.println("Leap year");
		}
		else {
			System.out.println("Not a leap year");
		}
		
	}

}
