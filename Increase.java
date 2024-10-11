package Serious;
import java.sql.SQLOutput;
import java.util.*;
public class Increase {
    public static void main(String[] args) {
/*
    Write a program that reads three integers from the user and prints "Increasing" if the
numbers are in increasing order, "Decreasing" if the numbers are in decreasing order,
and "Neither increasing nor decreasing order" otherwise.
 */
        Scanner sc= new Scanner(System.in);
        System.out.println("enter  number 1 ");
        int num1 = sc.nextInt();
        System.out.println("enter  number 2 ");
        int num2 = sc.nextInt();
        System.out.println("enter  number 3 ");
        int num3 = sc.nextInt();
        sc.close();
        if (num1>num2&&num2>num3){
            System.out.println("increasing");
        } else if (num1>num3||num2>num1||num3>num1) {
            System.out.println("Neither Increasing nor decreasing");
        }else if (num1<num2&&num2<num3){
            System.out.println("decreasing");
        }


    }
}