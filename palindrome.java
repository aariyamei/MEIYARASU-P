package program1;

public class palindrome {
	public static void main(String[] args) {
		int num=Integer.parseInt(args[0]);
		int copy=num;
		int t,rev=0,c=0;
		while( num>0){
			
			t=num%10;
			rev=rev*10+t;
			num/=10;
		}
		if(rev==copy){
			System.out.println("Palindrom");
		}else{
			System.out.println("not palindrom");
		}
	}

}
