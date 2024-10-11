package Serious;

import java.util.Arrays;

public class v {
    //when we dont know how many arguments are given
    public static void main(String[] args) {
      // for the integer output
        fun(12, 13, 14, 15,"mohan","sohan");
      // for string output
        //fun("mohan","sohan");
    }

    static void fun(int a,int b,int c,int d, String... v) {
        System.out.println(Arrays.toString(v));
    }
    static void fun(String... v){
        System.out.println(Arrays.toString(v));
   }
}