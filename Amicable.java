package Arrays;
// amicable without using the method calling
import java.util.Scanner;
// amicable pair check using two number
public class Amicable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = sc.nextInt();
        sc.close();
        int sum = 0;

        for (int i = 1; i <= num1 / 2; i++) {
            if (num1 % i == 0) {
                sum += i;
                if (sum == num2) {
                    System.out.println("amicable");


                }
                if (sum != num2) {
                    System.out.println("not amicable");
                }
            }
        }
        }


    }

