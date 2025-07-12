package Practice;

import java.util.Scanner;

public class AreaOfCircle {
	public static void main(String[] args) {
		int areaC;
		int areaR;
		double  areaT;
		Scanner sc = new Scanner(System.in);
		int R = sc.nextInt();
		int L = sc.nextInt();
		
		areaC = 2*R*(22/7);
		areaR = L*R;
		areaT = 0.5*R*L;
		System.out.println("area of circle " + areaC);
		System.out.println("area of Ractangle " + areaR);
		System.out.println("area of triangle " +areaT);
		
	}

}
