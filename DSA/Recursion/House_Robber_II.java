class House_Robber_II {
    public int f(int idx, int ep, int nums[], Map<Integer,Integer> map){
        if(idx<ep)
            return 0;
        if(map.containsKey(idx))
            return map.get(idx);
        int max = Integer.MIN_VALUE;
        //take 
        max = Math.max(max, nums[idx]+f(idx-2,  ep, nums, map));
        //not take
        max = Math.max(max, f(idx-1, ep,  nums, map));
        map.put(idx, max);
        return max;
    }
    public int rob(int[] nums) {
        if(nums.length==1)
            return nums[0];
        if(nums.length==2)
            return Math.max(nums[0], nums[1]);
        Map<Integer,Integer> map = new HashMap<>();
        int ans = f(nums.length-2, 0, nums, map);
        map = new HashMap<>();
        ans = Math.max(ans,f( nums.length-1, 1, nums, map));
        return ans;
    }
}
