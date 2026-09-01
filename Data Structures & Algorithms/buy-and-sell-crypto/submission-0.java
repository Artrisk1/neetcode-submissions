class Solution {
    public int maxProfit(int[] prices) {
        int prof=0;
        
        int left=0;
        int right=1;
        while(right<prices.length){
            if(prices[left]<prices[right]){
                prof=Math.max(prof,prices[right]-prices[left]);
            
            right++;
            }
            else{
                left=right;
                right++;
            }
        }
       return prof; 
    }
}
