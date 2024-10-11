package Kunal;

import java.util.Scanner;

public class Return {
    public static void main(String[] args) {
        int ans = sum();
        System.out.println(ans);
    }

    static int sum() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a num 1");
        int num1 = sc.nextInt();
        System.out.println("enter number 2");
        int num2= sc.nextInt();
        sc.close();
        int sum= num1+num2;


     return sum ;
    }

}

