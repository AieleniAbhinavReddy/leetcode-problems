class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] nums=new int[nums1.length+nums2.length];
        int i=0,j=0,k=0;
        while(i<nums1.length){
            nums[k++]=nums1[i++];
        }
        while(j<nums2.length){
            nums[k++]=nums2[j++];
        }
        Arrays.sort(nums);
        double res=0;
        int temp=nums.length/2;
        System.out.print(temp);
        if(nums.length%2==0){
            res=(nums[temp-1]+nums[temp])/2.0;
        }else{
            res=nums[temp];
        }
        return res;
    }
}