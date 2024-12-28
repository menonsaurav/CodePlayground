/*You are given an integer array prices where prices[i] is the price of NeetCoin on the ith day.

You may choose a single day to buy one NeetCoin and choose a different day in the future to sell it.

Return the maximum profit you can achieve. You may choose to not make any transactions, in which case the profit would be 0. */

class buySell2{
    public static int maxProfit(int[] prices){
        int maxP = Integer.MIN_VALUE;
        int l = 0, r = 1;
        while(r < prices.length){
                if(prices[l] < prices[r]){
                    int profit = prices[r] - prices[l];
                    maxP = Math.max(maxP, profit);
                }
                else{
                    l++;
                }
                r++;
            }
        return maxP;
    }
    public static void main(String[] args){
        int[] prices = {10,1,5,6,7,1};
        int profit = maxProfit(prices);
        System.out.println("max profit:" + profit); 
    }

}