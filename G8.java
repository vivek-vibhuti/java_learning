package Serious;
import java.util.*;

public class G8 {
    public static void main(String[] args) {
        /*
        Take 2 numbers as input and print the largest number.
         */
        Scanner sc = new Scanner (System.in);
        System.out.println("enter num 1");
        int num1 = sc.nextInt();
        System.out.println("enter num2");
        int num2 = sc.nextInt();
        sc.close();

        if (num1 >num2){
            System.out.println(num1 +" "+ "is largest number" );
        }else {
            System.out.println(num2+" "+ "is largest number" );
        }
    }
}
