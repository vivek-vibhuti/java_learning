package forexam;

import java.net.StandardSocketOptions;
import java.sql.SQLOutput;

public class Rotate {
    public static void main(String[] args) {

        for (int i = 4 ; i >=0 ; i --){
            for (int j = 1 ; j <=5 ; j++){
                if(j<=i)
                System.out.print(" ");
                else
                    System.out.print(" * ");
            }
            System.out.println();

            }

        }
    }

