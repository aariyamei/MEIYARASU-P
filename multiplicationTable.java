package guvi;

import java.util.Scanner;

public class multiplicationTable {
	public static void main(String[] args) {
		int num;
		int n=100;
		System.out.println("Enter a number");
        Scanner input = new Scanner(System.in);
        num = input.nextInt();
        for(int i = 1;i<=n;i++){
        	System.out.println(i +"*"+ num +"=" + (num * i));
        }
	}

}
