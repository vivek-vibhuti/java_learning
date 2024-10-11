package Loop;

import java.util.Scanner;

public class Reversal {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter a number ");
        int n= sc.nextInt();
      int ans=  rewversal(n);
        System.out.println(ans);

    }
    static int rewversal(int a){
        int ans=0;
       int temp = a%10;
        ans = ans*10+temp;
        int sum=  a/=10;


        return ans;
    }



}
