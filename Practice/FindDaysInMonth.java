package Practice;

import java.util.Scanner;

public class FindDaysInMonth {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int M = sc.nextInt();
		int Y = sc.nextInt();
		
		if(Y%4==0&&M==2&&Y%4==0) {
			System.out.println("29 Days");
		}
		else if(M==2) {
			System.out.println("28 Days");
		}
		else if((M==1) || (M==3) || (M==5) || (M==7) || (M==8)
					|| (M==10) || (M==12) ) {
			System.out.println("31 Days");
		}
		else {
			System.out.println("30 Days");
		}
	}

}
