class Solution {
    public int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE; // Tracks the lowest price seen so far
        int maxProfit = 0; // Tracks the maximum profit found

        for (int price : prices) {
            if (price < minPrice) {
                minPrice = price; 
            } else {
                maxProfit = Math.max(maxProfit, price - minPrice); 
            }
        }

        return maxProfit;
    }
}
