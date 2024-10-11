package Freshy;

import java.util.Scanner;

public class Multidimesional {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);



        /*
        1 2 3
        4 5 6
        7 8 9
         */

        int [][] arr= new int[3][];
      //  int [][]arr= {
      //          {1,2,3},
      //          {4,5,},
       //         {7,8,9,4},
       // };
/*
        if we take a arr.length it always  user row

 */
        for (int i=0;i<arr.length;i++){
            for (int col=0; col<arr[i].length;col++){
               arr[i][col]=in.nextInt();
            }
        }
    }
}
