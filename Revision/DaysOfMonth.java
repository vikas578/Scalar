package Revision;

import java.util.Scanner;

public class DaysOfMonth {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int y = sc.nextInt();
		
	    if(((m==2) && (y%400==0)) || ((y%100!=0)&&(y%4==0)))
	    {
	        System.out.println("Number of days is 29");
	    }
	    else if(m==2)
	    {
	        System.out.println("Number of days is 28");
	    }
	    else if(m==1 || m==3 || m==5 || m==7 || m==8 || m==10 || m==12)
	    {
	        System.out.println("Number of days is 31");
	    }
	    else
	    {
	        System.out.println("Number of days is 30");
	    }
	}

}
