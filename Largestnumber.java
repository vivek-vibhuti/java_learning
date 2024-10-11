package GRIND;

import java.util.Scanner;

public class Largestnumber {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter number 1");
        int a= sc.nextInt();
        System.out.println("enter number 2");
        int b= sc.nextInt();
        System.out.println("enter number 3");
        int c= sc.nextInt();
        if(a>b&&a>c){
            System.out.println(a+"is max");
        }if(a<b&&b>c){
            System.out.println(b+"is max");
        }if(c>a&&c>b){
            System.out.println(c+"is max");
        }

    }
}
