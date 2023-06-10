class Median_of_Two_Sorted_Arrays {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int arr[] = new int[nums1.length+nums2.length];
        for(int i = 0, j = 0; i<arr.length; i++)
            if(i<nums1.length)
                arr[i] = nums1[i];
            else
                arr[i] = nums2[j++];
        Arrays.sort(arr);
        int n = arr.length;
        if(n%2!=0){
            double median = arr[(int)n/2];
            return median;
        }
        else{
            double median = arr[(int)n/2] + arr[(int)(n-1)/2];
            median = median/2;
            return median;
        }
            
    }
}