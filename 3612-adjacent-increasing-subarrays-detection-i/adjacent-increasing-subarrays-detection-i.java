class Solution {
    private static boolean checkIncreasing(List<Integer> nums,int s,int k){
        // if(s-s+k==1) return true;
        for(int i=s;i<s+k-1;i++){
            if(i+1==nums.size()) return false;
            if(nums.get(i)>=nums.get(i+1)) return false;
        }
        return true;
    }
    public boolean hasIncreasingSubarrays(List<Integer> nums, int k) {
        int i=0,j=k;
        while(i<nums.size() && j<nums.size()){
            if(checkIncreasing(nums,i,k) && checkIncreasing(nums,j,k)){
                return true;
            }
            i++;
            j++;
        }
        return false;
    }
}