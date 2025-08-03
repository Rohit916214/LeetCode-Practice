class Solution {

    /*

    public int maxProfit(int[] prices) {

        int profit = 0;

        for(int i = 1; i < prices.length;i++){
            if(prices[i-1] < prices[i]){
                profit += prices[i] - prices[i-1];
            }
        }

        return profit;
        
    }

    */

    // Memorization method

    public int maxProfit(int[] prices) {

        int n = prices.length;
        int[][] dp = new int[n+1][2];

        for(int[] row : dp){
            Arrays.fill(row,-1);
        }
        return maxProfitHelper(prices,0,0, dp);
    }


    private int maxProfitHelper(int[] prices, int i, int holding, int[][] dp) {
        // Base case: if we've gone through all days or no transactions are left
        if (i >= prices.length ) {
            return 0;
        }

        if(dp[i][holding] != -1){
            return dp[i][holding];
        }

        // Check memoized result
       

        int doNothing = maxProfitHelper(prices, i + 1,holding, dp); // Skip current day

        if (holding == 1) {
            // We have a stock, so we can sell it
            int sell = prices[i] + maxProfitHelper(prices, i + 1, 0, dp);
            return dp[i][holding] =  Math.max(doNothing, sell);
        } else {
            // We don't have a stock, so we can buy one
            int buy = -prices[i] + maxProfitHelper(prices, i + 1, 1, dp);
            return dp[i][holding] = Math.max(doNothing, buy);
        }

        
    }
}
