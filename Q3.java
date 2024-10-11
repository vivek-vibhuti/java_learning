package forexam;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
        System.out.println("enter two n ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int g = 1;
        for (int i =a; i <= a && i <= b; i++){
            if (a%i==0&&b%i==0)
               g = i ;
                System.out.printf("GCD of %d and %d is: %d", a, b, g);
            //System.out.println(i);
           // System.out.println("gcd"+g);
        }




    }
}
