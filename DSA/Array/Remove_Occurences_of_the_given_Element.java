public class Remove_Occurences_of_the_given_Element {
    public int removeElement(int[] nums, int val) {
        int count  = 0;
        for(int i = 0; i<nums.length; i++){
            if(nums[i]!=val)
                nums[count++] = nums[i];
        }
        return count;
    }
}