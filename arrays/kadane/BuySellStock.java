package kadane;

public class BuySellStock {
    public static int getMaxProfit(int[] prices) {
        if (prices == null || prices.length == 0) return 0;

        // Assume day 0 is the cheapest baseline buy price
        int minPrice = prices[0]; 
        int maxProfit = 0;

        for (int i = 1; i < prices.length; i++) {
            // 1. Calculate potential profit if we sold right now
            int currentProfit = prices[i] - minPrice;
            if (currentProfit > maxProfit) {
                maxProfit = currentProfit;
            }

            // 2. Update our tracker if we find a cheaper buying day
            if (prices[i] < minPrice) {
                minPrice = prices[i];
            }
        }

        return maxProfit;
    }
}
