package Arrays;

public class Linear {
    public static void main(String[] args) {
        int []nums = {1,2,8,19,-3,-11,22,28};
        int target = 28;
        int ans = linearsearch(nums,target);
        System.out.println(ans);
    }
    static int linearsearch ( int []arr,int target) {
        if (arr.length == 0) {

            return -1;
        }
        for (int index = 0; index < arr.length; index++) {
            int element = arr[index];
            if (element == target) {
            return index;
            }

        }


        return -1;
    }
}
