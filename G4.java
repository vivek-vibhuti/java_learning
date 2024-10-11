package Serious;

import java.util.Scanner;

public class G4 {
    public static void main(String[] args) {
// Write a program to print whether a number is even or odd, also take input from the user.
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a new number ");
        int n = sc.nextInt();
        if (n%2==0){
            System.out.println("true"+"prime");

        }else {
            System.out.println("false"+"not odd");
        }


    }
}
