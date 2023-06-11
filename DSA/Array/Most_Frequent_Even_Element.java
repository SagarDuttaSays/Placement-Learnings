class Most_Frequent_Even_Element {
    public int mostFrequentEven(int[] nums) {
        int even = -1, freq = -1;
        Map<Integer,Integer> map = new HashMap<>();
        for(int key: nums)
            map.put(key, map.getOrDefault(key, 0)+1);
        Iterator<Integer> it = map.keySet().iterator();
        while(it.hasNext()){
            int key = (int)it.next();
            if(key%2==0 && freq<=map.get(key)){
                if(freq==map.get(key))
                    even = Math.min(even, key);
                else {
                even = key;
                freq = map.get(key); }
            }
        }
        return even;
    }
}
