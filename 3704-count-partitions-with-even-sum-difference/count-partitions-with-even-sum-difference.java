class Solution {
    public int countPartitions(int[] nums) {
        int ls=0,rs=0,res=0;
        for(int n:nums) rs+=n;
        for(int i=0;i<nums.length-1;i++){
            ls+=nums[i];
            rs-=nums[i];
            if(Math.abs(ls-rs)%2==0) res++;
        }
        return res;
    }
}