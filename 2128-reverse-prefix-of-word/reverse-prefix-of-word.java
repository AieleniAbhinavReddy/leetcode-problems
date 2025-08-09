class Solution {
    public String reversePrefix(String word, char ch) {
        Stack<Character> stack=new Stack<>();
        int i=0;
        for(i=0;i<word.length();i++){
            stack.push(word.charAt(i));
            if(word.charAt(i)==ch) break;
        }
        StringBuilder str=new StringBuilder();
        if(i<word.length()){
            while(!stack.isEmpty()){
                str.append(stack.pop());
            }
            str.append(word.substring(i+1));
            return str.toString();
        }
        return word;
    }
}