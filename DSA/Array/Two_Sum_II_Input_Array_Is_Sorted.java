class Two_Sum_II_Input_Array_Is_Sorted {
    public int[] twoSum(int[] nums, int target) {
        int head = 0, tail = nums.length-1;
        int arr[] = new int[2];
        while(head<tail){
            if(nums[head]+nums[tail]==target){
                arr[0] = head+1;
                arr[1] = tail+1;
                break;
            }
            else if(nums[head]+nums[tail]<target)
                head++;
            else if(nums[head]+nums[tail]>target)
                tail--;
        }
        return arr;
    }
}