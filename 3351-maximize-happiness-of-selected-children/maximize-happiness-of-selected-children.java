class Solution {
    public long maximumHappinessSum(int[] happiness, int k) {
        int sub=0;
        Arrays.sort(happiness);
        int i=happiness.length-1;
        long res=0;
        while(k>0 && i>=0){
            int curr=happiness[i]-sub;
            if(curr>0) res+=curr;
            else res+=0;
            sub+=1;
            i-=1;
            k-=1;
        }
        return res;
    }
}