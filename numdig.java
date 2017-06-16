package guvi;

import java.util.Scanner;

public class numdig {
public static void main(String args[]){
	int number;
	int count=0;
	Scanner s=new Scanner (System.in);
	System.out.println("enter the numbers:");
	number=s.nextInt();
	while(number > 0) {
		number = number / 100;
		count = count+ 1; 
      }
	System.out.println("total digits:"+count);
    }
}