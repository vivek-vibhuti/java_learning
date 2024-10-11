package AllNum;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Q73 {
    public static void main(String[] args) {
       /* Write a method that finds the smallest element in an array of double values using the following
        header:
        public static double min(double[] array)
        Write a java program that prompts the user to enter ten numbers, invokes this method to return
                the minimum value, and displays the minimum value. Here is a sample run of the program:
        Enter ten numbers: 1.9 2.5 3.7 2 1.5 6 3 4 5 2

        */
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the 10  number");
      int   arr []= new int[10];
      for(int i = 0;i<arr.length;i++){
          arr [i]= sc.nextInt();
      }

        System.out.println(min(arr));


    }
    static  int min(int arr[]){
        int ans = arr[0];
        for (int i = 0;i <arr.length; i++){
            if (ans >arr[i]){
                ans =arr[i];
            }
            System.out.println();
        }



     return ans;
    }
}
