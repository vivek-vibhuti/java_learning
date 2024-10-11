package forexam;

import java.util.Scanner;

public class Degree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the degree in fareheit");
        Double f = sc.nextDouble();
         Double c = 0.0;
         c= (f-32)*(5.0/9);
        System.out.println("in celcius "+c);

    }
}
