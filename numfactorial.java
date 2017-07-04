package guvi;

import java.util.Scanner;

public class numfactorial {
	public static void main(String args[]){
		int n1;
		int fact=1;
		System.out.println("Enter the number:");
		Scanner in=new Scanner(System.in);
		n1=in.nextInt();
		for(int i=1;i<=n1;i++){
			fact=fact*i;
		}
			System.out.println("factorial is:"+fact);
		}
		

}
