package forexam;
import java.util.*;

public class Pyramidal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number ");
        int numrow = sc.nextInt();

        for (int i = 1; i < numrow; i++) {
            for (int j = 1; j<=i-1; j++) {
                System.out.print(" ");

            }
           // for (int k = 1; k = < 2 * i - 1; k++)
            for (int k = 1; k <= 2 * i - 1; k++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}

/*
package forexam;
import java.util.*;

public class Pyramidal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int numrow = sc.nextInt();

        for (int i = 1; i <= numrow; i++) {
            // Loop for printing spaces before '*'
            for (int j = 1; j <= numrow - i; j++) {
                System.out.print(" ");
            }

            // Loop for printing '*'
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }

            // Move to the next line after each row
            System.out.println();
        }
    }
}

 */