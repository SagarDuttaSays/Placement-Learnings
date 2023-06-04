import java.util.*;
public class Rotate_Array{
    public static void rotate(int[] nums, int k) {
        int n = nums.length;
        if(n==1 || k==0)
            return;
        //[1,2] k = 3, n = 2
        //[2,1] k = k-n;
        while(k>n)
            k = k-n;
        
        reversal(nums,0,n-k-1);
        reversal(nums,n-k,n-1);
        reversal(nums,0,n-1);
    }
    public static void reversal(int nums[], int low, int high){
        while(low<high){
            int temp = nums[low];
            nums[low++] = nums[high];
            nums[high--] = temp;
        }
    }
    public static void main(String []args){
        int arr[] = {-1,2};
        rotate(arr, 5);
        for(Object ob: arr)
            System.out.print(ob+" ");
     }
}
