package guvi;

import java.util.Scanner;

public class leapyear {
public static void main(String args[]){
	int year;
	System.out.println("enter year");
	Scanner s=new Scanner(System.in);
	year=s.nextInt();
	if(year%4==0){
	    System.out.println("is a leaf year");
	}
	    else{
	    System.out.println("is not leaf year");
	}
}
}

