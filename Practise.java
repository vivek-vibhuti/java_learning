package Kunal;
import java.util.*;

public class Practise {
    public static void main(String[] args) {
        greet();
    }    // returning value is given then return otherwise do void

        static void greet(){
        Scanner sc= new Scanner(System.in);
            System.out.println("enter a ur name");
            String s = sc.nextLine();
            System.out.println("welcome"+" "+s);
        }
    }

