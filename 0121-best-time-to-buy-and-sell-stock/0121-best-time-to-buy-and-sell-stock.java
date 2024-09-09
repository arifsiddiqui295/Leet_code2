class Solution {
    public int maxProfit(int[] prices) {
        int mini = Integer.MAX_VALUE;
        int profit = 0 ;
        for(int i =0;i<prices.length;i++){
            int difference = 0;
            mini = Math.min(mini,prices[i]);
            difference = prices[i]-mini;
            profit= Math.max(profit,difference);
        }
        return profit;
    }
}