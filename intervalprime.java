package guvi;
import java.util.Scanner;
public class intervalprime {
	public static void main(String args[]){
			Scanner in=new Scanner(System.in);
			int i;
			int a=in.nextInt();
			int b=in.nextInt();
			for(i=a;i<b;i++){
			  if(i%2!=0&&i%3!=0&&i%5!=0){ 
			  System.out.println(i);       

			}
		}
	}
		
}
	


