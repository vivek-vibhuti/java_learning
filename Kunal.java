import java.util.Scanner;
import java.io.*;

public class Kunal {
    public static void main(String[] args) throws IOException {
        /*
        prime number using buffer reader
         */
        BufferedReader bfn = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter a number to check prime");
        int n = Integer.parseInt(bfn.readLine());
        //int m = Integer.parseInt(bfn.readLine());
        if (n % 2 == 0) {

            System.out.println("is prime"+" "+n);
        }else {
            System.out.println("not prime"+" "+n);
        }
    }

}


