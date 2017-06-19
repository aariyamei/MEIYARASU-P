package guvi;

import java.util.Scanner;

public class powernum {
	public static void main(String args[]){  
		double a,b;
		double c;
		Scanner x=new Scanner(System.in);
		System.out.println("ENTER THE NUMBER:");
		a=x.nextDouble();
		System.out.println("ENTER THE POWER VALUE;");
		b=x.nextDouble();
		c= Math.pow(a, b);
		System.out.println("ANSWER:"+c);
	}

}
