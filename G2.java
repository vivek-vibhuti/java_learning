package Serious;




public class G2 {
    static int c = 20;//static variable
    int b = 20;//instance variable

    public static void main(String[] args) {
     int a  = 10;
        System.out.println(a);
        System.out.println(G2.c);
        G2 obj = new G2();
        System.out.println(obj.b);

    }
    }

