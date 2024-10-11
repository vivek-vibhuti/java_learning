package Loop;

import java.util.Scanner;

public class NUmber10 {
    public static void main(String[] args) {


                //Write a program that asks the user to enter a number between 1 and 10.
                // If the user enters a number outside this range,
                // the program should ask for a new input until the correct number is entered


                Scanner sc= new Scanner(System.in);
        System.out.println("enter the number between 1 to 10");

        int n = sc.nextInt();
               do {

               } while (n < 1 || n > 10) ;{
                       System.out.println("ente correct number");

                   }


    }

}

