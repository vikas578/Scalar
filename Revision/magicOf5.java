package Revision;

public class magicOf5 {

	public static void main(String[] args) {
		int a= 5;
		System.out.println(MagicNo(a));
	}
	
	public static int MagicNo(int N) {
//		int bin = new DecToBin().decimalToBinary(N);
		int bin = DecToBin(N);
		int magic=0;
		int power=1;
		while(bin>0) {
			magic += (bin%10)*Math.pow(5, power);
			power++;
			bin/=10;
		}
		return magic;
	}
	
	public static int DecToBin(int N) {
		int bin=0;
		int power=1;
		while(N>0) {
			bin= bin + (N%2)*power;
			power*=10;
			N/=2;
		}
		return bin;
	}
}
