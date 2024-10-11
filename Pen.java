package Arrays;

import java.util.Scanner;
//Write a method with the following header that returns a pentagonal number:
public class Pen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number to get the pentagonal number ");
        int n = sc.nextInt();
        sc.close();
        int pen=getPentagonalNumber(n);
        System.out.println(pen);
    }
        public static int getPentagonalNumber(int n,int ...v) {
            int sum = n * (3 * n - 1) / 2;

         return sum;
        }


    }

