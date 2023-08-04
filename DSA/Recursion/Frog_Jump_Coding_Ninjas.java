import java.util.* ;
import java.io.*; 
public class Frog_Jump_Coding_Ninjas {
    public static int f(int i, int n, int[] heights, int[] cache){
        if(i==n-1)
            return 0;
        if(i>=n)
            return Integer.MAX_VALUE;
        if(cache[i]!=-1)
            return cache[i];
        int min = Integer.MAX_VALUE;
        //one step
        if(i+1<=n-1){
            int eng = Math.abs(heights[i]-heights[(i+1)]);
            min = Math.min(min, eng+f(i+1, n, heights, cache));
        }
        //two steps
        if(i+2<=n-1){
           int eng = Math.abs(heights[i]-heights[(i+2)]);
           min = Math.min(min, eng+f(i+2, n, heights, cache));
        }
        cache[i] = min;
        return min;
    }
    public static int frogJump(int n, int heights[]) {
        // Write your code here..
        int[] cache = new int[n+1];
        Arrays.fill(cache, -1);
        int ans = f(0, n, heights, cache);
        return ans;
    }

}
