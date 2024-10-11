package GRIND;

import java.util.Scanner;

public class CHECKeven {
    //Create a Java program that reads an integer and determines whether it is an even or odd number.
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter a number");
        int n = sc.nextInt();
        sc.close();
        if (n%2==0){
            System.out.println("even");
        }else{
            System.out.println("odd");
        }
    }




}
