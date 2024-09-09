package easyprogram;

public class Program4 {

	public static void main(String[] args) {
		// find the duplicte element in array 
		int a[] = {6,4,3,6,3};
		for(int i=0;i<a.length-1;i++) {		
			
			for(int j=i+1;j<a.length;j++) {
			
				if(a[i] == a[j]) {
					
					System.out.println(a[j]);
				}
			}
		}
	}
}