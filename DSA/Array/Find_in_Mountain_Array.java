
/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */
 
class Find_in_Mountain_Array {
    public int bsAscn(MountainArray mountainArr, int low, int high, int target){
        if(low>high)
            return -1;
        int mid = low + (high-low)/2;
        int val = mountainArr.get(mid);
        if(val==target)
            return mid;
        else if(val<target)
            return bsAscn(mountainArr, mid+1, high, target);
        else return bsAscn(mountainArr, low, mid-1, target);
    }
    public int bsDscn(MountainArray mountainArr, int low, int high, int target){
        //5 4 2 1
        if(low>high)
            return -1;
        int mid = low + (high-low)/2;
        int val = mountainArr.get(mid);
        if(val==target)
            return mid;
        else if(val>target)
            return bsDscn(mountainArr, mid+1, high, target);
        else return bsDscn(mountainArr, low, mid-1, target);
    }
    public int findInMountainArray(int target, MountainArray mountainArr) {
        int low = 0, high = mountainArr.length()-1;
        int mid = (low+high)/2;
        int index = -1;
        //find the mid value = peak of the mountain
        while(low<high){
            mid = (low+high)/2;
            if(mountainArr.get(mid)<mountainArr.get(mid+1))
                low = mid+1;
            else high = mid;
        }
        int peak = mid;
        index = bsAscn(mountainArr, 0, peak, target);
        if(index!=-1)
            return index;
        index = bsDscn(mountainArr, peak+1, mountainArr.length()-1, target);
        return index;
    }
}