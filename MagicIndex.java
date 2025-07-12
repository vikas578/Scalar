package array;

public class MagicIndex {
	public static void main(String[] args) {
		int [] A = {2,1,3,4,6};
		int N = A.length;
		int [] PSe = new int [N];
		int [] PSo = new int [N];
		
		PSo[0] = 0;
		PSe[0] = A[0];
		
		for(int i=1;i<N;i++) {
			if(i%2==0) {
				PSe[i] = PSe[i-1] + A[i];
				PSo[i] = PSo[i-1];
				
			}
			else {
				PSe[i] = PSe[i-1];
				PSo[i] = PSo[i-1] + A[i];
			}
		}
		int SUMe;
		int SUMo;
		
		for(int i=0;i<N;i++) {
			if(i==0) {
				SUMe = PSo[N-1] - PSo[i];
				SUMo = PSe[N-1] - PSe[i];
				
			}
			else {
				SUMe = PSe[i-1] + (PSo[N-1] - PSo[i]);
				SUMo = PSo[i-1] + (PSe[N-1] - PSe[i]);
				
			}
			if(SUMe==SUMo) {
				System.out.println(i);
			}
			
		}
		
	}
	
}
		
		
	


