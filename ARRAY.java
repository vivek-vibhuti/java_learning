package Serious;

import java.util.ArrayList;
import java.util.Scanner;

public class ARRAY {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
// array list
        ArrayList<Integer> list = new ArrayList<>(10);
     list.add(6237);
        list.add(611587);
        list.add(67811);
        list.add(6117);
        list.add(67115);
        list.add(65117);
        list.add(61177);
        list.add(6007);
        list.add(6787);
        list.add(5267);
        list.add(607);
        list.add(6457);
        list.add(637);
        System.out.println( list.contains(654));
        list.set(0,654);
        list.remove(2);
        System.out.println(list);
for ( int i = 0;i<5;i++){
    System.out.println(list.get(i));
}





    }

}
