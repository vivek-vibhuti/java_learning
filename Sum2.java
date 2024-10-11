package AllNum;

import java.util.Scanner;

public class Sum2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("ente the num");


        int n= sc. nextInt();
        int sum =0;
        int arr[ ]= new int [n];
        for (int i = 0;i<arr.length;i++ ){

            arr[i]=(int)(Math.random()*10);
            System.out.println(arr[i]);
            sum+=arr[i];


        }
        System.out.println("sum"+sum);
        System.out.println("average"+sum/n);
    }
}
