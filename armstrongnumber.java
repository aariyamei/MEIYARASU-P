package guvi;

import java.util.Scanner;

public class armstrongnumber {
	public static void main(String args[]){
	int c=0,a,temp;  
    int n;
    System.out.println("enter the number:");
    Scanner in=new Scanner(System.in);
    n=in.nextInt();
    temp=n;  
    while(n>0) { 
    a=n%10;  
    n=n/10;  
    c=c+(a*a*a);  
    }  
    if(temp==c)  
    System.out.println("armstrong number");   
    else  
        System.out.println("Not armstrong number");   
   }  

}
