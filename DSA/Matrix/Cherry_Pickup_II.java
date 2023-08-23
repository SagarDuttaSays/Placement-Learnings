class Cherry_Pickup_II {
    public int f(int i, int aj, int bj, int[][] arr, int rows, int cols, int[][][] cache){
		if(aj<0 || aj>=cols || bj<0 || bj>=cols)
			return Integer.MIN_VALUE;
		if(i==rows-1){
			if(aj==bj)
				return arr[i][aj];
			else
				return arr[i][aj] + arr[i][bj];
		}
		if(cache[i][aj][bj]!=-1)
			return cache[i][aj][bj];
		int ans = 0;
		for(int daj = -1; daj<=1; daj++){
			for(int dbj = -1; dbj<=1; dbj++){
				if(aj==bj)
					ans = Math.max(ans, arr[i][aj]+f(i+1, aj+daj, bj+dbj, arr, rows, cols, cache));
				else
					ans = Math.max(ans, arr[i][bj]+arr[i][aj]+f(i+1, aj+daj, bj+dbj, arr, rows, cols, cache));
			}
		}
		cache[i][aj][bj] = ans;
		return ans;
	}
    public int cherryPickup(int[][] grid) {
        int r = grid.length;
        int c = grid[0].length;
        int[][][] cache = new int[r+1][c+1][c+1];
		for(int[][] twoD: cache)
			for(int[] oneD: twoD)
				Arrays.fill(oneD, -1);
		int ans = 0;
		return f(0,0,c-1, grid, r,c, cache);
    }
}
