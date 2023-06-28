class Kth_smallest_element{
    public static int kthSmallest(int[] arr, int l, int r, int k) 
    { 
       Arrays.sort(arr);
       return arr[k-1];
    } 
}