class Minimum_Path_Sum {
      public int minPathSum(int[][] arr) {
        int row = arr.length;
        int col = arr[0].length;
        int[][] ans = new int[row][col];
        for(int[] r: ans)
            Arrays.fill(r, 0);
        for(int i = 0; i<row; i++){
            for(int j = 0; j<col; j++){
                if(i==0 && j==0){
                    ans[i][j] = arr[i][j];
                    continue;
                }
                int min = Integer.MAX_VALUE;
                if(i-1>=0){
                    min = Math.min(min, ans[i-1][j]+arr[i][j]);
                }
                if(j-1>=0){
                    min = Math.min(min, ans[i][j-1]+arr[i][j]);
                }
                ans[i][j] = min;
            }
        }
        return ans[row-1][col-1];
    }
}
