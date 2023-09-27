class Array_Subset_of_another_array {
      public static boolean checkSubset(int[] arr1, int[] arr2, int n, int m) { 
        // Write your code here.
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        int i = 0, j = 0;
        while(i<n && j<m){
            if(arr1[i]==arr2[j])
                j++;
            i++;
        }
        if(j==m)
            return true;
        return false;
    }
}
