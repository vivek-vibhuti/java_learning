package Serious;

import java.util.Scanner;

public class G3 {
    public static void main(String[] args) {
        // multiplication table
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number whose table you want: ");

        int n = sc.nextInt();
        sc.close();

        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " * " + i + " = " + (n * i));
        }
    }
}
