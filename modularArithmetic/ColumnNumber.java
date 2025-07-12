package modularArithmetic;

public class ColumnNumber {
	public static void main(String[] args) {
		String column = "XFC";
		int N = column.length();
		int sum=0;
		for(int i=0;i<N;i++) {
			sum += (column.charAt(i) - 'A'+1)* Math.pow(26, N-1-i);
		}
		System.out.println(sum);
	}
}

