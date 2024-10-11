package forexam;
import java.util.Scanner;

public class PRIMEC {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter a number ");
        int n = sc.nextInt();
       int b = sc.nextInt();
        /*(
        prime checker logic n squARE AOR MATH .POW

         */
          for (int r= n;r<b;r++) {


              for (int i = 2; i <= Math.sqrt(r); i++) {
                  if (r % i == 0) {
                      System.out.println(i+" ");
                  }
              }
          }
    }
}
