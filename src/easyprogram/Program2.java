package easyprogram;

public class Program2 {

	public static void main(String[] args) {
		//Palidrome no 
		int n=121;int pal=0,rem;
		int temp=n;
		while(n>0) {
			rem=n%10;  //1,2,1
			pal =(pal*10)+rem;//1,12,121
			n=n/10;//12,2,0
			 
		}
		if (pal==temp) {
			System.out.println("aplidrome");
		}else {
			System.out.println("not palidrome");
		}

	}

}
