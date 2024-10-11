package GRIND;

public class Linearserching {
    public static void main(String[] args) {
int []nums = {23,45,1,2,8,19,-3,16,-11,29};
int  target = 19;
int ans = linear(nums,target);
        System.out.println(ans);
    }
    //search in array
    //statement if true false if not found
    static int linear(int [] arr,int target){
        if (arr.length==0){
            return -1;
        }
        for (int index = 0; index<arr.length;index++){
            int element = arr[index];
            if( element ==target) {
                return index;
            }

        }
        return target;
    }

}
