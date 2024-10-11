package GRIND;
import java.util.*;

public class Numbercheck {
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        System.out.println("enter a number ");
        int n = sc.nextInt();
        sc.close();
        if (n<0){
            System.out.println("number is negative");
        }if (n>0){
            System.out.println("number is positive");
        }
    }
}
