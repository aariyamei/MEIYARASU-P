package mei;

import java.util.Scanner;

public class arrraynum {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter Number of elements in array");
		int len=in.nextInt();
		int[] arr=new int[len];
		int len1=len/2;
		int val1=0,val2=0;
		float avg1,avg2;
		System.out.println("Enter Values");
		for(int i=0;i<len;i++){
			arr[i]=in.nextInt();
			if(i>=len1)
			val2+=arr[i];
			else
				val1+=arr[i];
		}
 


avg1=val1/len1;
avg2=val2/(len-len1);
if(avg1==avg2)
	System.out.println("Possible");
else
	System.out.println("Not Possible");
}

}
