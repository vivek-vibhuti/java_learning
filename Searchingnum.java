package Arrays;

public class Searchingnum {
    public static void main(String[] args) {
      int []arr = {1,2,3,45,65,6,7,777,- 997}  ;

        System.out.println(min(arr));
    }
    static int min (int []n) {
        int ans = n[0];
        for (int i = 1; i < n.length; i++) {
            if (n[i] < ans) {
                ans = n[i];
            }
        }
     return ans;
    }
}
