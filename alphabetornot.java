package guvi;

import java.util.Scanner;

public class alphabetornot {
 
	        public static void main(String args[]){
	        	Scanner s=new Scanner(System.in);
	        	char ch ;
	        	System.out.println("enter a character :");
	        	 ch=s.next().charAt(0);
				if((ch>='a' && ch<='z') || (ch>='A' && ch<='Z')){
	        		System.out.println("alphabet");
	        	}
	        	else 
	        		System.out.print("not a alphabet");
	        	}

	}
