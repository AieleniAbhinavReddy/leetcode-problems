class Solution {
    public String addBinary(String a, String b) {
        int i=a.length()-1;
        int j=b.length()-1;
        int carry=0;
        StringBuilder res=new StringBuilder();
        while(i>=0 && j>=0){
            int t1=Character.getNumericValue(a.charAt(i--));
            int t2=Character.getNumericValue(b.charAt(j--));
            if(t1+t2+carry>1){
                if(t1+t2+carry==3){
                    carry=1;
                    res.append(1);
                }else{
                    carry=1;
                res.append(0);
                }
            }else{
                res.append(t1+t2+carry);
                carry=0;
            }
        }
        while(i>=0){
            int t=Character.getNumericValue(a.charAt(i--));
            if(t+carry>1){
                carry=1;
                res.append(0);
            }else{
                res.append(t+carry);
                carry=0;
            }
        }
        while(j>=0){
            int t=Character.getNumericValue(b.charAt(j--));
            if(t+carry>1){
                carry=1;
                res.append(0);
            }else{
                res.append(t+carry);
                carry=0;
            }
        } 
        if(carry==1) res.append(1);
        return res.reverse().toString();
    }
}