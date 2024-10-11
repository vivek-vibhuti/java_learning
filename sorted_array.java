package code;

public class sorted_array {
    public static void main(String[] args) {
        int []arr= {1,2,3,4,5,6,7};
        fun( arr, 3);
    }

    private static int fun(int[] arr, int target) {
        for( int i= 0 ;i<arr.length;i++) {
            if (arr[i] == target) {
                return arr[i];
            }else if (target<arr[i+1]|| arr[i]<target){
                return arr[i+1];
            }
        }


        return target;
    }
}
