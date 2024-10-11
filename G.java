package forexam;

import java.util.Scanner;

public class G {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        System.out.println("enter 2 numbers to check");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int i, j, s = 0, sum = 0;
        for (i = 1; i < n1; i++) {
            if (n1 % i == 0)
                s = s + i;
        }
        for (j = 1; j < n2; j++) {
            if (n2 % j == 0)
                sum = sum + j;

        }
        if (s == n2 && sum == n1)
            System.out.println("amicable number");
        else
            System.out.println("not a amicable number");
    }

    }
