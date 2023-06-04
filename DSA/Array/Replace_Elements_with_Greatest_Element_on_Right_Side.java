class Replace_Elements_with_Greatest_Element_on_Right_Side {
    public int[] replaceElements(int[] nums) {
        int max = Integer.MIN_VALUE;
        for(int i = nums.length-1; i>=0; i--){
            if(nums[i]>max)
                max = nums[i];
            nums[i] = max;
        }
        for(int i = 0; i<nums.length-1; i++)
            nums[i] = nums[i+1];
        nums[nums.length-1] = -1;
        return nums;
    }
}