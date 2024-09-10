package easyprogram;

import java.util.Arrays;
import java.util.HashSet;

public class Sep102 {

	public static void main(String[] args) {
		// Remove duplicacy from unsorted array 
		int a[]= {9,9,3,4,6,6,9};
	HashSet<Integer> hs = new HashSet<Integer>();
	 for (int num : a) {
         hs.add(num);
     }
	 System.out.println(hs);
		

	}

}
