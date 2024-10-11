package forexam;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        /*
        even number
         */
        Scanner sc = new Scanner (System.in);
        System.out.println("enter new number ");
        int n = sc.nextInt();

       if (n%2==0){
           System.out.println("even" );


       }else {
           System.out.println("odd");
       }

    }
}

