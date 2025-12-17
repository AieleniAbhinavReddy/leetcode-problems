class Solution {
    public int maxDistinct(String s) {
        int[] seen=new int[26];
        int ct=0;
        for(char c:s.toCharArray()){
            int i=c-97;
            if(seen[i] != 1){
                seen[i]=1;
                ct++;
            }
        }
        return ct;
    }
}














        // Set<Character> set=new HashSet<>();
        // for(char c:s.toCharArray()){
        //     set.add(c);
        // }
        // return set.size();