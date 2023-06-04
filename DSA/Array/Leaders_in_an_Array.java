import java.util.*;
public class Leaders_in_an_Array{
    public static void rotate(int[] nums) {
        int max = Integer.MIN_VALUE;
        for(int i = nums.length-1; i>=0; i--){
            if(nums[i]>max){
                max = nums[i];
                System.out.print(max+" ");
            }
        }
        }
    public static void main(String []args){
        int arr[] = {7,10,4,10,6,5,2};
        rotate(arr);
     }
}