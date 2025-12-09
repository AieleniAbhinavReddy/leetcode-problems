class Solution {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder sb=new StringBuilder();
        Arrays.sort(strs);
        String s=strs[0];
        String t=strs[strs.length-1];
        for(int i=0;i<Math.min(s.length(),t.length());i++){
            if(s.charAt(i)!=t.charAt(i)) break;
            sb.append(s.charAt(i));
        }
        return sb.toString();
    }
}