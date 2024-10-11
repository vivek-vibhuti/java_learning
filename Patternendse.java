package Strung;

public class Patternendse {
    public static void main(String[] args) {
    /*

        //Write a program to print the following patterns:
        //5 4 3 2 *
        //5 4 3 * 1
        //5 4 * 2 1
        //5 * 3 2 1
        //* 4 3 2 1
        for (int i = 1; i <= 5; i++) {
         for( int j = 1;j==5-i;j++){
             System.out.print("*");
         }
            System.out.println();
*/

                int n = 5;

                // Outer loop for rows
                for (int i = 1; i <= n; i++) {
                    // Inner loop for printing numbers or asterisks
                    for (int j = n; j >= 1; j--) {
                        if (j == i || i == n || j == 1) {
                            System.out.print("* ");
                        } else {
                            System.out.print(j + " ");
                        }
                    }
                    // Move to the next line after each row
                    System.out.println();
                }
            }
        }
