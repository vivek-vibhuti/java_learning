package AllNum;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
//Input 10 integers from the keyboard into an array. The number to be searched is entered through
//the keyboard by the user. Write a java program to find if the number to be searched is present in
//the array and if it is present, display the number of times it appears in the array.
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the  target number");

        int arr[]= new int[10];
        int target = sc.nextInt();
        for (int i = 0; i<arr.length;i++){
            System.out.println("enter the number");
            arr[i]= sc.nextInt();

        }
        search( arr,target);
    }
    static void search(int []arr, int target){
        int count= 0;
        for(int i =0;i<arr.length;i++){
            if (arr[i]==target){
             count++;
                System.out.println(arr[i]);

            }
        }
        if (count > 0) {
            System.out.println("The number " + target + " is present in the array and appears " + count + " times.");
        } else {
            System.out.println("The number " + target + " is not found in the array.");
        }
    }
}

