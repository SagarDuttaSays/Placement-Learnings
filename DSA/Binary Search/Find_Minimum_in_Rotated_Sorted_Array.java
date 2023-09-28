class Find_Minimum_in_Rotated_Sorted_Array { 
    public int findMin(int[] nums) {
        int min = Integer.MAX_VALUE;
        int left = 0, right = nums.length-1;
        while(left<=right){
            int mid = (left+right)/2;
            if(nums[mid]<min)
                min=nums[mid];
            if(nums[left]<nums[right])
                right=mid-1;
            else
                left=mid+1;
        }
        return min;
    }
}
