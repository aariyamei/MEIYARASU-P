package string;

import java.util.Scanner;

public class rev {
	public static void main(String args[]){
	String s1 ;
	 Scanner in=new Scanner(System.in);
	 s1=in.next();
	 String rev=new StringBuffer(s1).reverse().toString();
	 System.out.println(rev);
	
	}
	

}
