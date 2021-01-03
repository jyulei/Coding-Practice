/**
 * 121. 买卖股票的最佳时机
 */
public class Solution0121 {
    public int maxProfit(int[] prices) {
        if (prices.length == 0) {
            return 0;
        }
        int min = prices[0];
        int maxProfile = 0;
        for (int i = 1;i < prices.length; i++){
            if (prices[i] - min > maxProfile) {
                maxProfile = prices[i] - min;
            }
            if (min > prices[i]){
                min = prices[i];
            }
        }
        return maxProfile;
    }
}
