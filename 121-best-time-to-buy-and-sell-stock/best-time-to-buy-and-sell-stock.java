class Solution {
    public int maxProfit(int[] prices) {
        
        int n=prices.length;
        int maxProfit=0;
        int min=prices[0];
        for(int i=1;i<n;i++){
            if(prices[i]>min){
                maxProfit= Math.max(maxProfit,prices[i]-min);
            }
            min=Math.min(min,prices[i]);
            
        }
        return maxProfit;
    }
}