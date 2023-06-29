class Minimize_the_Heights_II {
    int getMinDiff(int[] arr, int n, int k) {
        Arrays.sort(arr);
        int diff = arr[n-1] - arr[0];
        int min ,max;
        for(int i = 1; i<n; i++){
            if(arr[i]-k<0) continue;
            min = Math.min(arr[0]+k, arr[i]-k);
            max = Math.max(arr[n-1]-k, arr[i-1]+k);
            diff = Math.min(diff, max-min);
        }
        return diff;
    }
}