package forexam;

public class Check {
    public static void main(String[] args) {
        int n = 5;
        int m = 20;
        for (int i = n ; i <m ; i++){
            if (i %2==0){
                System.out.println("even"+i);
            }else {
                System.out.println("odd");
            }
        }
    }
}
