package GRIND;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Shape {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Implement a program that calculates the area of different geometric shapes
        // (circle, square, rectangle) based on user input
        //  Ask the user to enter the shape type and then appropriate parameters
        //  (radius, side length, length, and width). Use a switch statement to perform the calculation
        //  and print the result.
        System.out.println("1 for rectangle,2 for square,3for circle");

        System.out.println("enter the shape number from 1 to 3");
        int shapenum = sc.nextInt();
        String shape;
        switch(shapenum){
            case 1 :
                    shape ="rectangle";
                System.out.println("enter length");
                int l = sc.nextInt();
                System.out.println("enter breadth");
                int b = sc.nextInt();
                int area= l*b;
                System.out.println(area
                );
            break;
            case 2:
                shape ="square";
                 l = sc.nextInt();
                System.out.println("enter breadth");
                b = sc.nextInt();
                 area= l*b;
                System.out.println(area);
                break;
            case 3:
                shape ="circle";

                System.out.println("enter radius");
                int r = sc.nextInt();
                 area= (int) (Math.PI*r*r);
                System.out.println(area);
                break;
            default:
                System.out.println("enter number between 1 to 3");
                sc.close();
        }
    }
}
