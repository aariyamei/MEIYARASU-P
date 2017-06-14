package guvi;

import java.util.Scanner;

public class largestnum {
public static void main(String args[]){
	int a,b,c;
	System.out.println("enter the numbers:");
	Scanner s=new Scanner(System.in);
	a=s.nextInt();
	b=s.nextInt();
	c=s.nextInt();
	
	if(a>=b && a>=c){
		System.out.println(""+a);
	}
	 if(b>=a && b>=c){
		System.out.println(""+b);
	}
	 else{
		System.out.println(""+c);

	}
}
}