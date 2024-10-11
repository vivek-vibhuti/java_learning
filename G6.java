package Serious;

import java.util.Scanner;
/*
Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.
 */
public class G6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("do you want to calculate simple inmtrest?");
        System.out.print("Enter yes or no: ");
        String userInput = sc.nextLine().toLowerCase(); // Convert input to lowercase for case-insensitivity

        if (userInput.equals("yes")) {
            System.out.println("You entered 'yes'.");
            System.out.println("enter principal ");
            int p = sc.nextInt();
            System.out.println("enter rate");
            int r = sc.nextInt();
            System.out.println("enter time");
            int t = sc.nextInt();
            System.out.println("wait while si is calculated ");

            int simpleintrest = p * r * t / 100;
            System.out.println("here is your simple intrest" +" "+ simpleintrest);
        }
    }
}
