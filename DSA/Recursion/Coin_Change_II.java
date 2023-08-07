class Coin_Change_II {
      public static int f( int idx, int[] coins, int amt, int[][] store){
		if(amt==0)
			return 1;
		if(idx==coins.length)
			return 0;
		if(store[idx][amt]!=-1)
			return store[idx][amt];
		int c = 0;
		//taking
		if(amt-coins[idx]>=0)
			c = c + f(idx, coins, amt-coins[idx], store);
		
		//not taking
		c = c+ f(idx+1, coins, amt, store);
		store[idx][amt] = c;
		return c;
		}
    public int change(int value, int[] coins) {
        int[][] store = new int[coins.length+1][value+1];
		for(int i = 0; i<store.length; i++)
            for(int j = 0; j<store[0].length; j++)
                store[i][j] = -1;
		int ans = f(0, coins, value, store);
		return ans;
    }
}
