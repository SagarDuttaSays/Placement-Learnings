class Find_the_Duplicate_Number {
    public int findDuplicate(int[] nums) {
        for(int n: nums){
            int index = Math.abs(n);
            if(nums[index]<0)
                return index;
            nums[index] = -nums[index];
        }
        return -1;
    }
}