package Arrays;

public class A1 {
    static int x= 90;
// shadowing
    public static void main(String[] args) {
        System.out.println(x);
        int x;
        x= 80;
        System.out.println(x);
        fun();


    }
    static void fun(){
        System.out.println(x);
    }


    }

