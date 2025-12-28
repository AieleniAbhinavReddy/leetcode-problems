class Solution {
    public int countNegatives(int[][] grid) {
        int c=0;
        for(int[] mat:grid){
            int l=0,r=mat.length-1,res=-1;
            while(l<=r){
                int m=l+(r-l)/2;
                if(mat[m]<0){
                    res=m;
                    r=m-1;
                }else{
                    l=m+1;
                }
            }
            c+=(mat.length-l);
        }
        return c;
    }
}