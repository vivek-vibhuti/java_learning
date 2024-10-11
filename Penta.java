package Arrays;

import java.util.Scanner;

//Write a java program that uses this method to display the first 100 pentagonal numbers with
//10 numbers on each line.
public class Penta {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
      //  System.out.println("enter a number to get the pentagonal number ");
       // int n = sc.nextInt();
        sc.close();
        for(int i= 1;i<=100;i++){
        int pen=getPentagonalNumber(i);
            System.out.printf("%-6d", pen);
            if (i % 10 == 0) {
                System.out.println();
            }
        }

    }
    private static int getPentagonalNumber(int n,int ...v) {
        int sum = n * (3 * n - 1) / 2;

        return sum;
    }


}
