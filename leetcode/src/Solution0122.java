public class Solution0122 {
    public static int maxProfit(int[] prices) {
        if (prices.length == 0) {
            return 0 ;
        }
        int profile = 0;
        int left , right;
        left = right = 0;

        for (int i = 1;i < prices.length; i++){
            if (prices[i] < prices[right]){
                profile += prices[right] - prices[left];
                left = i;
                right = i;
            } else {
                right = i;
            }
            if (i == prices.length-1){
                profile += prices[right] - prices[left];
            }
        }
        return profile;
    }

    public static void main(String[] args) {
        int [] a = {7,1,5,3,6,4,5};
        System.out.println(maxProfit(a));
    }
}
