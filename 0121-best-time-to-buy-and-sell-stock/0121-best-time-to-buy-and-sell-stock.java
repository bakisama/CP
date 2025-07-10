class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0;
        int min = prices[0];
        int temp;
        for (int i = 1; i < prices.length; i++) {
            if(prices[i]<min){
                min = prices[i];
            }
            temp = (prices[i]-min);
            profit = temp>profit?temp:profit;
        }
        return profit;
    }
}