class Solution {
    private static final String[] digitToLetters={"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    private static void backtrack(String digits,int i,StringBuilder sb,List<String> res) {
        if(i == digits.length()) {
            res.add(sb.toString());
            return;
        }
        for(final char c : digitToLetters[digits.charAt(i)-'0'].toCharArray()) {
            sb.append(c);
            backtrack(digits,i+1,sb,res);
            sb.deleteCharAt(sb.length()-1);
        }
    }
    public List<String> letterCombinations(String digits) {
        if(digits.length()==0) return new ArrayList<String>();
        List<String> ans=new ArrayList<>();
        backtrack(digits,0,new StringBuilder(),ans);
        return ans;
    }
}