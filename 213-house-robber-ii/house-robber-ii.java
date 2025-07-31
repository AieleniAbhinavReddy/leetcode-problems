class Solution {
    public int robl(int[] nums) {
        if(nums.length==0) return 0;
        if(nums.length<2) return nums[0];
        int n=nums.length;
        int[] dp=new int[n];
        dp[0]=nums[0];
        dp[1]=Math.max(nums[0],nums[1]);
        for(int i=2;i<n;i++){
            dp[i]=Math.max(dp[i-2]+nums[i],dp[i-1]);
        }
        return dp[n-1];
    }
    public int rob(int[] nums) {
        int n=nums.length;
        if(n==1) return nums[0];
        int[] l1=Arrays.copyOfRange(nums,0,n-1);
        int[] l2=Arrays.copyOfRange(nums,1,n);
        System.out.println(Arrays.toString(l1));
        System.out.println(Arrays.toString(l2));
        int maxProfit=Math.max(robl(l1),robl(l2));
        return maxProfit;
    }
}