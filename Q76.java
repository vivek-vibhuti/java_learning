package AllNum;

import java.util.Scanner;

public class Q76 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Write a java program that implements the array reversal algorithm suggested in Note 1.
        //Note 1: There is a simpler algorithm for array reversal that starts
        //out with two indices, i=0 and j=n-1. With each iteration i is
        //increased and j is decreased for i<j.


                int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};

                System.out.println("Original Array:");
                printArray(array);

                reverseArray(array);

                System.out.println("\nReversed Array:");
                printArray(array);
            }

            // Function to reverse an array using the two indices approach
            private static void reverseArray(int[] arr) {
                int i = 0;
                int j = arr.length - 1;

                while (i < j) {
                    // Swap elements at indices i and j
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;

                    // Move indices towards the center
                    i++;
                    j--;
                }
            }

            // Function to print the elements of an array
            private static void printArray(int[] arr) {
                for (int num : arr) {
                    System.out.print(num + " ");
                }
                System.out.println();
            }
        }

