package Serious;



public class FuncOver {
    public static void main(String[] args) {
        //two or more function of same name
        chain(67);
        chain("mohan");
        add(2,5);
        add(2,3,6);
    }

    //if name is same the number of arguments or thre arguments should be differrent
    static void chain(int a, int... v) {
        System.out.println(a);
        System.out.println("first");

    }

    static void chain(String name, String... v) {
        System.out.println(name);
        System.out.println("secomd");
    }

    // let me give example of the same name but different number of arguments
    static  int add(int a,int c) {
        System.out.println("ac");
   return a+c;

    }
    static int add(int a,int x, int c) {
        System.out.println("axc");
        return a+x+c;

    }
    }


