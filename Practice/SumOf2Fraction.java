package Practice;

import java.util.Scanner;

public class SumOf2Fraction {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first Fraction number");
		int N1 = sc.nextInt();
		int D1 = sc.nextInt();
		System.out.println("Enter second Fraction number");
		int N2 = sc.nextInt();
		int D2 = sc.nextInt();
		
		int Divide;
		int N3;
		int D3;
		N3 = (N1*D2)+(N2*D1);
        D3=D1*D2;
        
        if(N3>D3) {
        	Divide=D3;
        }
        else {
        	Divide=N3;
        }
        for(int i=Divide;i>0;i--) {
        	if(N3%i==0 && D3%i==0) {
        		 N3=N3/i;

                 D3=D3/i;
        	}
        }
        System.out.println("Sum of fractions is "+N3+"/"+D3);
		
		
	}

}
