package AllNum;

import java.util.Scanner;

public class Practise1 {
    public static void main(String[] args) {
       // Write a Java program to initialize an array of integers and display its elements.
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the number of arry");
        int n = sc .nextInt();

        int []arr= new int[n];
        for (int i =0;i<arr.length;i++) {
            arr[i] = sc.nextInt();
        }
            for(int j = 0; j<arr.length;j++){
                System.out.println( arr[j]);
            }



        }
    }

