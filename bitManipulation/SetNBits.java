package bitManipulation;

public class SetNBits {
	public static void main(String[] args) {
		int N =4;
//		int result = (int) Math.pow(2, N) -1;
		int result = (1<<N) -1;
		System.out.println(result);
	}
}








//for(int i=0;i<A;i++) {
//	sum+=Math.pow(2, i);
//}

