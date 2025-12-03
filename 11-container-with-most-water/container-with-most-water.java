class Solution {
    public int maxArea(int[] height) {
        int maxW=0,lh=0,rh=0,i=0,j=height.length-1;
        while(i<j){
            lh=height[i];
            rh=height[j];
            int w=Math.min(lh,rh)*(j-i);
            maxW=Math.max(maxW,w);
            if(lh<rh) i++;
            else j--;
        }
        return maxW;
    }
}