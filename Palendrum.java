package Arrays;

import java.util.Scanner;

public class Palendrum {
    public static void main(String[] args) {
        //Use the reverse method to implement isPalindrome. A number is a palindrome if its reversal is
        //the same as itself. Write a java program that prompts the user to enter an integer and reports
        //whether the integer is a palindrome.
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the number ");
        int n= sc.nextInt();
        sc.close();
       int r= reverse(n);
        System.out.println(r);
        if (n == r) {
            System.out.println("The number is a palindrome.");
        } else {
            System.out.println("The number is not a palindrome.");
        }

    }
    public static int reverse(int n){
      int ans= 0;
      while (n>0) {
          int rem = n % 10;  // Corrected the calculation of the remainder
          ans = ans * 10 + rem;
          n = n / 10;

      }
        return n+ans;
    }

}
