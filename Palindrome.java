package AllNum;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter a number ");
        int num = sc.nextInt();
        // palindrome check
        int a = palindrome(num);
        sc.close();
       // System.out.println(a);
        if (num ==a){
            System.out.println("palindrome"+" "+a);
        }else{
            System.out.println("not palindrome");
        }

    }
    static int palindrome(int a){
     int ans = 0;
     while (a>0){
         int rem = a%10;

         ans =ans*10+ rem;
        a =a/10;
     }
     return a+ans;
    }
}
