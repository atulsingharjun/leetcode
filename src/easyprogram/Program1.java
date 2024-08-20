package easyprogram;

public class Program1 {

	public static void main(String[] args) {
//		Given an array of integers nums and an integer target, 
//		return indices of the two numbers such that they add up to target.
//		Input: nums = [2,7,11,15], target = 9
//				Output: [0,1]
//				Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
		
		int a[]= {2,7,5,11},	target=9	;
		for( int i=0;i<a.length;i++) {
             for(int j=i+1;j<a.length;j++) {
            	 if(a[i]+a[j]==target) {
            		System.out.println("no is"+a[i]+ "and"+a[j]); 
            		System.out.println("index is "+i+"and "+j);
            	 }
             }

	}
		
	}

}
