class Solution {
    public int maxProfit(int[] prices) {
        int l = 0;
        int r = 1;

        int max = 0;
        
        while (l < r && r < prices.length) {
            int curr = prices[r] - prices[l];
            if (curr > max) {
                max = curr;
            }
            if (curr < 0) {
                l = r;
            } 
            r++;          
        }
        return max;
    }
}
