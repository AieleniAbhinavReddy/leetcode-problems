class Solution {
    public int missingNumber(int[] nums) {
        int ans=nums.length;
        for(int i=0;i<nums.length;i++){
            ans=ans^(i^nums[i]);
            // if(ans!=0) break;
        }
        return ans;
        // int n=nums.length;
        // Arrays.sort(nums);
        // for(int i=0;i<n;i++){
        //     if(nums[i] != i) return i;
        // }
        // return nums[n-1]+1;
    }
}