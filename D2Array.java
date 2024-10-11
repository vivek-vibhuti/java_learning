package Strung;

import java.util.Scanner;

public class D2Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of rows:");
        int r = sc.nextInt();
        System.out.println("Enter the number of columns:");
        int c = sc.nextInt();

        int[][] number = new int[r][c];

        System.out.println("Enter the elements of the 2D array:");

        // Input loop
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                number[i][j] = sc.nextInt();
            }
        }

        // Output loop
        System.out.println("2D Array:");

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(number[i][j] + " ");
            }
            System.out.println();
        }
    }
}
