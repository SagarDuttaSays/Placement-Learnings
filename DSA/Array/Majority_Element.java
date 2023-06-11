class Majority_Element{
    public int majorityElement(int[] nums) {
        int target = nums.length/2;
        Map<Integer,Integer> map = new HashMap<>();
        for(int key: nums)
            map.put(key, map.getOrDefault(key, 0)+1);
        Iterator<Integer> it = map.keySet().iterator();
        while(it.hasNext()){
            int key = (int)it.next();
            if(target<map.get(key))
                return key;
        }
        return target;
    }
}