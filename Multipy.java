package Loop;

import java.util.Scanner;

public class Multipy {
    public static void main(String[] args) {
        //Generate the multiplication table for a given number (up to a certain range).
        //Hint: Use a nested for loop.
        Scanner sc= new Scanner(System.in);
        System.out.println("enter a number ");
        int n= sc.nextInt();
        for (int i=1;i<=10;i++){
                System.out.println(n+"*"+i+"="+i*n);

        }

    }
}
