class Solution {
    public int maxProduct(int[] nums) {
        int n=nums.length;
        int msf=nums[0],maxeh=nums[0],mineh=nums[0];
        for(int i=1;i<=n-1;i++){
            int curr=nums[i];
            int tempmax=maxeh;
            maxeh=Math.max(curr,Math.max(curr*maxeh,curr*mineh));
            mineh=Math.min(curr,Math.min(curr*tempmax,curr*mineh));
            msf=Math.max(msf,maxeh);
        }
        return msf;
    }
}