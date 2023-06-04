class Remove_Duplicates_from_Sorted_Array {
    public int removeDuplicates(int[] nums) {
        //0 10 10 5 6 4 3 3 7
        int count = 1;
        for(int i = 1; i<nums.length; i++){
            if(nums[count-1]!=nums[i])
                nums[count++] = nums[i];
        }
        return count;
    }
}