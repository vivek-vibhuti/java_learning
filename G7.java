package Serious;

import java.util.Scanner;
//Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions)
public class G7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter two new number");

        int n= sc.nextInt();
        int y = sc.nextInt();
        System.out.println("enter operator ");
       char c=  sc.next().charAt(0);
       if (c=='+'){
           System.out.println(n+y);
       } else if (c=='-') {
           System.out.println(n-y);
       } else if (c=='*') {
           System.out.println(n*y);
       }else if (c=='%'){
           System.out.println(n%y);
       }else{
           System.out.println("enter valid operator");
       }

    }
}
