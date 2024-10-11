package forexam;

import java.util.Scanner;

public class Fiboclass2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
      //  int n = 10;
       int  n1= sc.nextInt();

        int n2 = sc.nextInt();;
        for (int i = n1; i<=n2; i++){
            System.out.print(n1 + " ");
            int num3 = n2 + n1;
            n1 = n2;
            n2 = num3;
        }
    }
}
