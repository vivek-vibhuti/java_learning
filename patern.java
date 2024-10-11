package Strung;

public class patern {
    public static void main(String[] args) {
        for(int i = 1; i<=4; i++){
            for (int j=4;j>=i; j--){
                System.out.print(" ");
            }
            for(int r = 1;r<=i; r++){
                System.out.print(" *");
            }
            System.out.println();
        }
    }
}
