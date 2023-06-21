class Best_Time_to_Buy_and_Sell_Stock {
    public int maxProfit(int[] prices) {
        int profit = 0, min = Integer.MAX_VALUE;
        for(int i: prices){
            min = Math.min(min, i);
            profit = Math.max(profit, i - min);
        }
        return profit;
    }
}