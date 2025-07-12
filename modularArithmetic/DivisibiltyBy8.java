package modularArithmetic;

public class DivisibiltyBy8 {
	public static void main(String[] args) {
		String num = "4432400";
		int N = num.length();
		if(N<=3) {
			int number = Integer.parseInt(num);
			System.out.println(number%8==0);
		}
		
		else {
			int number = Integer.parseInt(num.substring(N-3, N));
			System.out.println(number%8==0);
		}
	}
}
