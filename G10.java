package Serious;

import java.util.Scanner;

public class G10 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a = sc.nextInt();

        int b =  sc.nextInt();

        String result = a > b ? "a is greater than b" : "b is greater than or equal to a";

        System.out.println(result);


    }
}



