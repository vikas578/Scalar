package MYClass;

public class a2 {

	public static void main(String[] args) {
		int a[] = {4,5,6,3,7,8,9};
		for(int i=0;i<a.length;i++){
			System.out.print(a[i]);
		
		}
		System.out.println(" reverse array");
		
		for(int i=a.length-1;i>=0;i--) {
			
			System.out.print(a[i]);
		}
		
		for(int i=0;i<a.length;i++){
			for(int j=i;j<a.length;j++) {
				int s=0;
				if(a[i]>a[j]) {
					s=a[i];
					a[i]=a[j];
					a[j]=s;
				}
			}
			System.out.println(a[i]);
		}
		
		
	}

}
