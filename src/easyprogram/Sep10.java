package easyprogram;

public class Sep10 {

	public static void main(String[] args) {
		// Remove duplicacy all aspects

		int a[]= {1,3,3,6,6,8,9,9};
		int [] temp = new int[a.length];
		int j=0;
		for(int i=0;i<a.length-1;i++) {
			
			if(a[i]!=a[i+1]) {
				temp[j]=a[i];
				j++;
			}
			
		}
		temp[j]=a[a.length-1];
	
	for(int i=0;i<temp.length;i++) {
		System.out.println(temp[i]);
		
	}

}
}
