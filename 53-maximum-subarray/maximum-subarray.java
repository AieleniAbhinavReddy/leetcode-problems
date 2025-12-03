class Solution {
    public int maxSubArray(int[] nums) {
        int msf=Integer.MIN_VALUE,cs=0;
        for(int i=0;i<nums.length;i++){
            cs+=nums[i];
            if(cs>msf){
                msf=cs;
            }
            if(cs<0){
                cs=0;
            }
        }
        return msf;
    }
}