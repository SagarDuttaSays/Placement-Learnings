class Majority_Element_II {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> list = new ArrayList<>();
        int target = nums.length/3;
        Map<Integer,Integer> map = new HashMap<>();
        for(int key: nums)
            map.put(key, map.getOrDefault(key, 0)+1);
        Iterator<Integer> it = map.keySet().iterator();
        while(it.hasNext()){
            int key = (int)it.next();
            if(target<map.get(key))
                list.add(key);
        }
        return list;
    }
}