class Solution {
    public boolean isThree(int n) {
        int c=0;
        for(int i=1;i<=(int)Math.sqrt(n);i++){
            if(n%i==0){
                if(i==n/i){
                    c++;
                }else{
                    c+=2;
                }
            }
        }
        return c==3;
    }
}