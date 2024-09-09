package easyprogram;

import java.util.ArrayList;

public class Program3 {

	public static void main(String[] args) {
		//Dplicate by collection
ArrayList<Integer> dup = new ArrayList<Integer>();
dup.add(5);
dup.add(5);
dup.add(7);
//System.out.println(dup);
for(int dups :dup) {
	System.out.println(dups);
}

for(int i=0;i< dup.size();i++) {
	 if( dup.contains(dup.get(i))){
		 System.out.println(dup.get(i));
		 
	 }
	
}
	}
}