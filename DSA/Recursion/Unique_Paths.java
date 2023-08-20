class Unique_Paths {
      public int f(int row, int col, int m, int n, int[][] cache){
        if(row==m-1 && col==n-1){
			return 1;
		}
        if(row>=m || col >=n)
            return 0;
        if(cache[row][col]!=-1)
			return cache[row][col];
        int ans = 0;
		//move right
		if(row+1<=m-1){
			ans = ans + f(row+1, col, m, n, cache);
        }
		//move down
		if(col+1<=n){
			ans = ans + f(row, col+1, m, n, cache);
        }
		cache[row][col] = ans;
        return ans;
	}
    public int uniquePaths(int m, int n) {
        int[][] cache = new int[m][n];
		for(int[] row: cache)
			Arrays.fill(row, -1);
		return f(0, 0, m, n, cache);
    }
}
