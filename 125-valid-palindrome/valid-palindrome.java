class Solution {
    public boolean isPalindrome(String s) {
        int st=0,e=s.length()-1;
        s=s.toLowerCase();
        while(st<=e){
            char c1=s.charAt(st),c2=s.charAt(e);
            if(!Character.isLetterOrDigit(c1)){
                st++;
            } 
            else if(!Character.isLetterOrDigit(c2)){
                e--;
            }else{
                if(c1 != c2) return false;
                st++;
                e--;
            }            
        }
        return true;
    }
}