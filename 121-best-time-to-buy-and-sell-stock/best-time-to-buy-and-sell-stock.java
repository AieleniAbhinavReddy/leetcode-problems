class Solution {
    public int maxProfit(int[] prices) {
        int minp=prices[0];
        int maxp=0;
        for(int i=0;i<prices.length;i++){
            minp=Math.min(minp,prices[i]);
            int p=prices[i]-minp;
            if(p>maxp){
                maxp=p;
            }
            // if(maxp<0){
            //     maxp=0;
            // }
        }
        return maxp;
    }
}