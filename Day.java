package GRIND;

import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.concurrent.Flow;

//Write a Java program that takes a number representing the day of the week
// (1 for Sunday, 2 for Monday, etc.) and prints the corresponding day using a switch statement.
public class Day {
    public static void main(String[] args) {
     Scanner sc= new Scanner(System.in);
        System.out.println("enter number from 1 to 7");
        int n= sc.nextInt();
        sc.close();
        String day;
        switch(n){
            case 1:
           day="sunday";
           break;
           case 2:
            day="monday";
            break;
            case 3:
                day = "Tuesday";
                break;
            case 4:
                day = "Wednesday";
                break;
            case 5:
                day = "Thursday";
                break;
            case 6:
                day = "Friday";
                break;
            case 7:
                day = "Saturday";
                break;
            default:
                day = "Invalid day number";
        }
        System.out.println("The day corresponding to the given number is: " + day);
        }
    }

