public class Maximum_Difference_Between_Increasing_Elements {
    public int maximumDifference(int[] nums) {
        int diff = nums[1]-nums[0];
        int min = nums[0];
        for(int i = 1; i<nums.length; i++){
            diff = Math.max(diff, nums[i]-min);
            min = Math.min(nums[i], min);
        }
        if(diff>=1)
        return diff;
        else return -1;
    }
}