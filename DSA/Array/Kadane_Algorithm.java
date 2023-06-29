class Kadane_Algorithm {
    long maxSubarraySum(int arr[], int n){
        long maxSoFar = Integer.MIN_VALUE, currMax = 0;
        for(int i = 0; i<arr.length; i++){
            currMax = currMax + arr[i];
            maxSoFar = Math.max(maxSoFar, currMax);
            if(currMax<0)
                currMax = 0;
        }
        return maxSoFar;
    }
}