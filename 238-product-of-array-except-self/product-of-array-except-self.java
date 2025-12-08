class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] lp=new int[nums.length];
        int[] rp=new int[nums.length];
        int n=nums.length;
        lp[0]=1;
        rp[n-1]=1;
        for(int i=1;i<n;i++){
            lp[i]=nums[i-1]*lp[i-1];
        }
        for(int i=n-2;i>=0;i--){
            rp[i]=nums[i+1]*rp[i+1];
        }
        int[] p=new int[n];
        for(int i=0;i<n;i++){
            p[i]=lp[i]*rp[i];
        }
        return p;
    }
}