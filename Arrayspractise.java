package Freshy;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class Arrayspractise {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
              int arr[];
                arr= new int[5];

       // input using for loop
        for (int i = 0;i <arr.length;i++){
            arr[i]=in.nextInt();

        }
       /* for (int i= 0;i <arr.length;i++){
            System.out.println(arr[i]);
            }

    // for each loop

        for (int num :arr){

            System.out.println( num +" ");
        }
*/
// string method
        System.out.println(Arrays.toString(arr));
// here i got the to string method of printing
    }
}
