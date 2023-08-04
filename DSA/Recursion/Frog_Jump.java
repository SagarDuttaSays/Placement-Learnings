class Frog_Jump {
    public int bs(int[] arr, int low, int high, int target){
        while(low<=high){
            int mid = low + (high-low)/2;
            if(arr[mid]==target)
                return mid;
            else if(arr[mid]<target)
                low = mid+1;
            else high = mid-1;
        }
        return -1;
    }
    public boolean f(int index, int k, int[] stones, Map<String, Boolean> map){
        if(index==stones.length-1)
            return true;
        if(index>=stones.length)
            return false;
        String key = index+"-"+k;
        if(map.containsKey(key))
            return map.get(key);
        //k-1 steps
        int next = bs(stones, index+1, stones.length-1, stones[index]+k-1);
        if(next!=-1 && f(next, k-1, stones, map))
            return true;
        //k steps
        next = bs(stones, index+1, stones.length-1, stones[index]+k);
        if(next!=-1 && f(next, k, stones, map))
            return true;
        //k+1 steps
        next = bs(stones, index+1, stones.length-1, stones[index]+k+1);
        if(next!=-1 && f(next, k+1, stones, map))
            return true;
        else {
            map.put(key, false);
            return false;}
    }
    public boolean canCross(int[] stones) {
        if(stones[1]>1)
            return false;
        Map<String, Boolean> map = new HashMap<>();
        boolean ans = f(1, 1, stones, map);
        return ans;
    }
}
