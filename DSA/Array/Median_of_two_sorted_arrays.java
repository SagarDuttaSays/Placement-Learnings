class Median_of_two_sorted_arrays {
      public double findMedianSortedArrays(int[] arr1, int[] arr2) {
        int n = arr1.length;
        int m = arr2.length;
        if(n>m)
            return findMedianSortedArrays(arr2, arr1);

        int i = n-1, j = 0;
        while(i>=0 && j<m){
            if(arr1[i]>arr2[j]){
                int temp = arr1[i];
                arr1[i--] = arr2[j];
                arr2[j++] = temp;
            } else break;
        }
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        
        int len = n+m;
        if(len%2!=0){
            int med = len/2;
            med = med-n;
            return arr2[med];
        } else {
            if(n<len/2){
                double v1 = arr2[(len/2)-n-1];
                double v2 = arr2[(len/2)-n];
                return (v1+v2)/2; 
            } else {
                double v1 = arr1[n-1];
                double v2 = arr2[0];
                return (v1+v2)/2; 
            }
        }
    }
}
