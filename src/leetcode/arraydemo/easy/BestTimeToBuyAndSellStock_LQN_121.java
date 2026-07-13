package leetcode.arraydemo.easy;

public class BestTimeToBuyAndSellStock_LQN_121 {


    public static int maxProfit(int[] prices) {
        int profit =0, min = prices[0];
        for(int i=1; i<prices.length;i++){
            profit = Math.max(profit, prices[i]-min);
            if(prices[i] < min)
                min = prices[i];
        }
        return profit;
    }

    public int maxProfitV2(int[] prices) {
        int minPrice = prices[0];
        int maxProfit = 0;

        for (int i = 1; i < prices.length; i++) {
            if (prices[i] < minPrice) {
                minPrice = prices[i];
            } else {
                maxProfit = Math.max(maxProfit, prices[i] - minPrice);
            }
        }

        return maxProfit;
    }
    
    /*
        Very Important

        Approach : Buying product on min price and sell on maxm profit

        -if you are selling on ith day then, we have to buy the at min i-1 days

    
    */
    public static void main(String[] args) {
        int [] prices = {7,1,5,3,6,4};
        System.out.println(maxProfit(prices));
    }
}
