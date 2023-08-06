House_Robber
  class Solution {
    public int rob(int[] nums) {
        int cache[] = new int[nums.length+1];
        for(int i = 0; i<nums.length; i++){
            int max = 0;
            //take
            int take = (i-2>=0)?cache[i-2]:0;
            max = Math.max(max, nums[i]+take);
            //not take
            int nottake = (i-1>=0)?cache[i-1]:0;
            max = Math.max(max, nottake);
            cache[i] = max;
        }
        return cache[nums.length-1];
    }
}
