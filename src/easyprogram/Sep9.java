package easyprogram;

import java.util.ArrayList;
import java.util.Arrays;

public class Sep9 {

	public static void main(String[] args) {
		// Merge Two Sorted Lists
int a[]= {5,6,7};
int b[]= {6,7,8};

int a1=a.length;
int a2=b.length;
int a3=a1+a2;
int c[]= new int[a3] ;

for(int i=0;i<a1;i++) {
	c[i]=a[i];
	
}
for(int i=0;i<a2;i++) {
	c[a2+i]=b[i];
	
	
}

for(int j=0;j<c.length;j++) {
	System.out.println(c[j]);
	
}



	}

}
