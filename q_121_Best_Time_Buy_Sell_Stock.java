// Best Time to Buy and Sell Stock

public class q_121_Best_Time_Buy_Sell_Stock {

    public static void main(String[] args) {

        int[] prices = {7,1,5,3,6,4};
        maxProfit(prices);

        // System.out.println(maxProfit(prices));
        System.out.println(maxProfit2(prices));
    }

    public static int maxProfit(int[] prices) {

        // Brute force approach: 2 iterations, O(n*n)
        int n = prices.length;
        int res = 0;

        for (int i=0; i < n-1; i++) {
            for (int j= i+1; j < n; j++) {
                res = Math.max(res, prices[j] - prices[i]);
            }
        }
        return res;
    }

    public static int maxProfit2(int[] prices) {

        // Brute force approach: 2 iterations, O(n*n)
        int n = prices.length;
        int res = 0;
        int minSoFar = prices[0];

        for (int i=0; i < n; i++) {
            minSoFar = Math.min(minSoFar, prices[i]);

            res = Math.max(res, prices[i] - minSoFar);
        }

        return res;
    }
}
