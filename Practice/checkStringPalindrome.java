package Practice;

public class checkStringPalindrome {
	public static void main(String[] args) {
//		int N = 12321;
		String S = "wErtrew";
		int i = 0, j = S.length()-1;
		int flag=0;
		
		while(i<=j) {
			if(Character.toUpperCase(S.charAt(i))!= Character.toUpperCase(S.charAt(j))) {
				flag=1;
				break;
			}
			i++;
			j--;
		}
		if(flag==0)
			System.out.println("Palidrome");
		else
			System.out.println("Not a palidrome");
	}
}
