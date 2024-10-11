package Loop;

public class Sumeven {
    public static void main(String[] args) {
      int count = 0;


    //Write a program to find the sum of even numbers between 1 and 20.
    //Hint: Use a for loop with a step size.
    for(int i = 2;i<=20;i++) {
      if (i%2==0)  {
          count+=i;
          System.out.println(count);
      }else{
          System.out.println("odd"+i);
      }

     }

    }
}
