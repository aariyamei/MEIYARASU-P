package mei;
import java.util.Scanner;
public class revnumber {
	public static void main(String args[]){
		String s1;
		System.out.println("enter the String:");
		Scanner in =new Scanner(System.in);
		s1=in.next();
		String s2=new StringBuffer(s1).reverse().toString();
		System.out.println(s2);
      }
	}
