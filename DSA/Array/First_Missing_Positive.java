class First_Missing_Positive {
      public boolean bs(int[] arr, int target){
        int low = 0, high = arr.length-1;
        while(low<=high){
            int mid = low + (high-low)/2;
            if(arr[mid]==target)
                return true;
            else if(arr[mid]<target)
                low = mid+1;
            else
                high = mid-1;
        }
        return false;
    }
    public int firstMissingPositive(int[] nums) {
        Arrays.sort(nums);
        if(nums[nums.length-1]<=0)
            return 1;
        for(int i = 1; i<nums[nums.length-1]; i++){
            if(!bs(nums, i))
                return i;
        }
        return nums[nums.length-1]+1;
    }
}
