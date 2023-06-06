class Longest_Consecutive_Sequence {
    public int longestConsecutive(int[] nums) {
        int len = nums.length;
        if(len==0)
            return 0;
        if(len==1)
            return 1;
        Arrays.sort(nums);
        int count = 1;
        int max = 1;
        for(int i = 1; i<len; i++){
            if (nums[i-1]==nums[i])
                continue;
            else if(nums[i-1]+1!=nums[i]){
                count = 1;
            }
            else if(nums[i-1]+1==nums[i]){
                count++;
            }
            max = Math.max(max, count);
        }
        return max;
    }
}