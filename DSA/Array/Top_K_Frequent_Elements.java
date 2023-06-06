class Top_K_Frequent_Elements {
    public int[] topKFrequent(int[] nums, int k) {
        if(nums.length==1)
            return nums;
        Map<Integer, Integer> map = new LinkedHashMap<>();
        for(int i = 0; i<nums.length; i++)
            map.put(nums[i], map.getOrDefault(nums[i], 0)+1);
        Comparator<Integer> c = (a,b) -> {
            return map.get(b).compareTo(map.get(a));
        };
        Integer[] temp = new Integer[nums.length];
        for(int i = 0; i<temp.length; i++)
            temp[i] = nums[i];
        Arrays.sort(temp, c);
        map.clear();
        for(int i = 0; i<nums.length; i++)
            map.put(temp[i], map.getOrDefault(temp[i], 0)+1);
        int arr[] = new int[k];
        Iterator<Integer> it = map.keySet().iterator();
        while(it.hasNext() && k!=0){
            int key = (int)it.next();
            arr[k-1] = key;
            k--;
        }
        return arr; 
    }
}