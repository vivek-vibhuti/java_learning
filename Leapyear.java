package GRIND;

import java.util.Scanner;

public class Leapyear {
    public static void main(String[] args) {
        //Leap Year:
        //Write a Java program to check if a given year is a leap year or not.
        Scanner sc= new Scanner(System.in);
        System.out.println("entyer year");
        int n = sc.nextInt();
        sc.close();
        if (n%4==0){
            System.out.println("leapyear"+n);
        }else{
            System.out.println("no not leap year");
        }

    }
}
