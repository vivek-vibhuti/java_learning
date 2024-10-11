package Loop;

import java.util.Scanner;

public class factorial {
    //Write a program to calculate the factorial of a given number.
    //Hint: Use a for loop to iterate from 1 to the given number.
  //  5!=5*4*3*2*1
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        System.out.println("enter a number");
        int ans=1;
        int n = sc.nextInt();
        for(int i =1;i<=n;i++){

             ans*=i;
            System.out.println(ans);
        }
    }
}
