package guvi;
import java.util.Scanner;
public class reverseRemove {
	public static void main(String args[]){
		String s1;
		System.out.println("Enter the String:");
		Scanner in=new Scanner(System.in);
		s1=in.next();
		String s2=new StringBuffer(s1).reverse().toString();
		System.out.println("output1="+s2);
	    String s4=s2.replaceAll("[aeiouAEIOU]","");
	    System.out.println("output2="+s4);
	}

}
