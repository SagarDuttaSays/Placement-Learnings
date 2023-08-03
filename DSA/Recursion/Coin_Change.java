public class Coin_Change {

    public static long f(int idx, int[] coins, int amt, int[][] store){
        if(idx==coins.length)
            return Integer.MAX_VALUE;
        if(amt<0)
            return Integer.MAX_VALUE;
        if(amt==0)
            return 0;
        if(store[idx][amt]!=-1)
            return store[idx][amt];
        long ans = Integer.MAX_VALUE;
        //take
        if(amt-coins[idx]>=0)
            ans = Math.min(ans, 1+f(idx, coins, amt-coins[idx], store));
        //not take
        ans = Math.min(ans, f(idx+1, coins, amt, store));
        store[idx][amt] = (int)ans;
        return ans;
    }
    public static int coinChange(int[] coins, int amount) {
        int [][] store = new int[coins.length+1][amount+1];
        for(int i = 0; i<store.length; i++)
            for(int j = 0; j<store[0].length; j++)
                store[i][j] = -1;
        long ans = f(0, coins, amount, store);
        if(ans>=Integer.MAX_VALUE)
            ans = -1;
        return (int)ans;
    }
}
