package guvi;
import java.util.Scanner;
public class stackstower {
	public void solve(int n, String first, String auxiliary, String last) {
	       if (n == 1) {
	           System.out.println(first + " -> " +last);
	       } else {
	           solve(n - 1, first,last, auxiliary);
	           System.out.println(first + " -> " +last);
	           solve(n - 1, auxiliary, first,last);
	       }
	   }

	   public static void main(String[] args) {
	      stackstower towersOfHanoi = new stackstower();
	       System.out.print("Enter number of discs: ");
	       Scanner scanner = new Scanner(System.in);
	       int discs = scanner.nextInt();
	       towersOfHanoi.solve(discs, "A", "B", "C");
	       scanner.close();
	   }
}
