class Solution {
    public int maxProfit(int[] prices) {
        
        int n=prices.length;
        int maxprice=0;
        int minprice=Integer.MAX_VALUE;


        for(int price:prices){
            if(price<minprice){
                minprice=price;
            }else{
                maxprice=Math.max(maxprice,price-minprice);
            }

        }

        return maxprice;

        
        
        
    }
}