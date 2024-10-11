package Freshy;

import java.util.Arrays;

public class Passingoffunction {
    public static void main(String[] args) {
        int[] nums= {2, 3, 5, 8,9 };
        System.out.println(Arrays.toString(nums));
        changed(nums);
        System.out.println(Arrays.toString(nums));
    }
    // strings are immutable in java
  //  arrays are mutable in java
    static void changed(int[] arr) {
        arr[0] = 99;
    }



}
