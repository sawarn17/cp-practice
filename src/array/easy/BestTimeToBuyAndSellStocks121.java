package array.easy;

public class BestTimeToBuyAndSellStocks121 {
    
    public static int maxProfit(int[] prices) {
        int max = 0;
        int min = prices[0];

        for(int i=1; i<prices.length; i++){
            if(prices[i] < min){
                min = prices[i];
            }else{
                max = Math.max(max, (prices[i] - min));
            }
        }

        return max;
    }

    public static void main(String[] args) {
        int [] prices = {7,1,5,3,6,4};
        System.out.println(maxProfit(prices));
    }
}
