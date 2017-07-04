package guvi;

import java.util.Scanner;
public class armstronginterval {
    public static void main(String[] args) {
       int n, count = 0, a, b, c, sum = 0;
       Scanner in=new Scanner(System.in);
       System.out.println("enter the interval:");
       a=in.nextInt();
       b=in.nextInt();
       for(int i = a; i <= b; i++)

       {

           n = i;

           while(n > 0)

           {

               a = n % 10;

               sum = sum + (a* a * a);

               n = n / 10;

           }

           if(sum == i)

           {
               System.out.print(i+" ");

           }

           sum = 0;
        }

   }
}
