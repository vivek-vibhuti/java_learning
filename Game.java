package Serious;

import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        /*
        Make a simple game involving a computer and a user. The computer first guesses a
number between 1 and 9 inclusive, then ask the user to enter a number between 1 and
9 inclusive. If the user guess is correct then display “You got it right”, if the guess is
close (+1, -1) “Almost got it “, Otherwise “You got it wrong”.
         */
        Scanner sc= new Scanner(System.in);
        int max= 9;
        int min =0;

        int randomInRange = sc.nextInt((max - min) + 1) + min;



    }

}
