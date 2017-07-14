package mei;
import java.util.Scanner;
public class stringtointeger {
	public static void main(String args[]){
		int intoInt;
		String s;
		System.out.println("enter the string:");
		Scanner scan=new Scanner(System.in);
		s=scan.next();
		intoInt=Integer.parseInt(s);
		System.out.println("This is an integer: "+intoInt);
		}
}
