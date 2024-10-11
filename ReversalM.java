package Freshy;
import java.util.*;

public class ReversalM {
    static int reversal(int n){


           int ans = 0;

           int rem = n % 10;
           ans = ans * 10 + rem;
         int sum=  n / 10;


        return ans;
    }






    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        System.out.println("enter a number ");
         int num1 = sc.nextInt();
       int x = reversal(num1);
        System.out.println( x);

    }
}
