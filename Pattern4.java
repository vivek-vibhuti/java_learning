package Strung;

public class Pattern4 {
    public static void main(String[] args) {
        for (int i = 1; i <= 4; i++) {
         for(int j = 0; j<=i;j++ ){
             System.out.print(" ");
         }
         for(int k = 1; k <= 5- i; k++){
             System.out.print("  $");
         }
            System.out.println();
        }
    }
}
