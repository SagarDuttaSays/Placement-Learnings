class Permutations {
    public void helper(List<List<Integer>> permutations, int[] nums, int index){
        if(nums.length==index){
            List<Integer> list = new ArrayList<>();
            for(int n: nums)
                list.add(n);
            permutations.add(list);
            return;
        }
        for(int i = index; i < nums.length; i++){
            swap(nums, i, index);
            helper(permutations, nums, index+1);
            swap(nums, i, index);
        }
    }
    public void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> permutations = new ArrayList<>();
        helper(permutations, nums, 0);
        return permutations;
    }
}