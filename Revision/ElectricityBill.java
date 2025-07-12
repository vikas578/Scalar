package Revision;

import java.util.Scanner;

public class ElectricityBill {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int u = sc.nextInt();
		double r = 0;
		
		if(u<=50) {
			r = 0.50*u;
		}
		else if(u<=150) {
			r = 0.50*50 + (u-50)*0.75;
		}
		else if(u<=250) {
			r = 0.50*50 + 100*0.75 + (u-150)*1.2;
		}
		else{
			r = 0.50*50 + 100*0.75 + 250*1.2 + (u-250)*1.50;
		}
		r = Math.floor(r*1.2);
		System.out.println("The final amount is " +(int)r);
	}

}
