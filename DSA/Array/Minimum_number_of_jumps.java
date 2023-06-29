class Minimum_number_of_jumps {
    static int minJumps(int[] arr) {
        int n = arr.length;
        if (n == 0 || arr[0] == 0) // Edge cases: Empty array or first element is 0
            return -1;
        
        int jumps = 1; // Initialize the minimum number of jumps to 1
        int maxReach = arr[0]; // Store the maximum reachable index
        int steps = arr[0]; // Store the number of steps we can still take
        
        for (int i = 1; i < n; i++) {
            if (i == n - 1) // Reached the end of the array
                return jumps;
            
            maxReach = Math.max(maxReach, i + arr[i]); // Update the maximum reachable index
            
            steps--; // We used one step to reach the current index
            
            if (steps == 0) {
                jumps++; // Increment the number of jumps
                if (i >= maxReach) // Cannot reach further
                    return -1;
                steps = maxReach - i; // Update the steps with the remaining steps
            }
        }
        
        return -1; // If we cannot reach the end of the array
    }
}