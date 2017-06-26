package string;

import java.util.Scanner;

public class rev {
	public static void main(String args[]){
	String s1 ;
	String s2;
	 Scanner in=new Scanner(System.in);
	 s1=in.next();
	 s2=in.next();
	 String rev=new StringBuffer(s1).reverse().toString(); 
	 String s=new StringBuffer(s2).reverse().toString();
	 System.out.println(rev);
	 System.out.println(s);
	}
	

}
