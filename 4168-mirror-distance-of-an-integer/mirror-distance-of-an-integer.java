class Solution {
    public int mirrorDistance(int n) {
        int rev=0;
        int o=n;
        while(o>0){
            int rem=o%10;
            rev=rev*10+rem;
            o/=10;
        }
        return Math.abs(n-rev);
    }
}