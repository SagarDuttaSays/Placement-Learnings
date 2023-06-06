class _3Sum {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(nums);
        for(int i = 0; i<nums.length; i++){
            int head = i+1;
            int tail = nums.length-1;
            while(head<tail){
                if(nums[head]+nums[tail]==-nums[i]){
                    list.add(Arrays.asList(nums[i], nums[head], nums[tail]));
                    head++;
                    tail--;
                }
                else if(nums[head]+nums[tail]<-nums[i])
                    head++;
                else if(nums[head]+nums[tail]>-nums[i])
                    tail--;
            }
        }
        list = new ArrayList<>(new HashSet<>(list));
        return list;
    }
}