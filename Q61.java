package AllNum;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Q61 {
    public static void main(String[] args) {
        //Write a java program to create an array of size N and store the random values in it and find the
        //sum and average.


                Scanner sc = new Scanner(System.in);
                System.out.println("enter number ");
                int n = sc.nextInt();

                // TODO Auto-generated method stub
                int []arr = new int[n];
                double sum = 0;
                for (int i = 0 ; i<n;i++) {
                    arr[i]=(int)(Math.random()*10)	;
                    System.out.println(arr[i]);
                    sum+=arr[i];



                }
                System.out.println(" the sum is "+sum);
                System.out.println("average "+sum/n);


            }
        }





