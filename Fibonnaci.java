package forexam;

import java.util.Scanner;

public class Fibonnaci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ent no");
        int n = sc.nextInt();
        int i =0 ;
        int p = 1;
        int count = 2;
        while(count<=n){
            int temp = i ;
            i = i+p;
            p = temp;
            count++;
        }

    }
}
