class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0;
        int mini = Integer.MAX_VALUE;
        for (int i = 0; i < prices.length; i++) {
            int sum = 0;
            mini = Math.min(prices[i], mini);
            sum = prices[i] - mini;
            profit = Math.max(sum, profit);
        }
        return profit;
    }
}