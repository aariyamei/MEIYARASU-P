package guvi;
import java.util.Scanner;
public class holiday {
	public static void main(String[] args){              
		Scanner ss=new Scanner(System.in);
		System.out.println("Enter the  string:");
		String str=ss.nextLine();
		if(str.equals("Sunday")||(str.equals("Saturday"))){
				System.out.println("FALSE");
			}
		    else{
				System.out.println("TRUE");
			}
		}

}
