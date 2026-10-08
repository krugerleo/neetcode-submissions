class Solution {
    public int maxProfit(int[] prices) {
        if(prices.length <= 1 ){
            return 0;
        }
        int buy = 0;
        int sell = 1;
        int maxProfit = 0;
        int profit = 0;
        for(; sell< prices.length; sell++){
            if(prices[buy]< prices[sell]) {
                profit = prices[sell] - prices[buy];
                maxProfit = Math.max(profit,maxProfit);
            }else{
                buy = sell;
            }
        }
        
        return maxProfit;
    }
}
