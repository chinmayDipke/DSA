package Questions;

public class LeetCode121 {
    public static void main(String[] args) {
        int[] arr = {7,1,5,3,6,4};
        System.out.println(maxProfit(arr));
    }
    static  int maxProfit(int[] prices) {
        if (prices.length <= 1) {
            return 0;
        }

        int buy = prices[0];
        int sell = prices[0];
        int maxProfit = 0;

        for (int i = 1; i < prices.length; i++) {
            if (prices[i] < buy) {
                buy = prices[i];
                sell = buy;
            }

            if (prices[i] > sell) {
                sell = prices[i];
            }

            maxProfit = Math.max(maxProfit, sell - buy);
        }

        return maxProfit;
    }
}
