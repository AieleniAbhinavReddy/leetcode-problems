class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack=new Stack<>();
        int i=0;
        List<String> opr=new ArrayList<>();
        opr.add("+");
        opr.add("-");
        opr.add("*");
        opr.add("/");
        while(i<tokens.length){
            if(opr.contains(tokens[i])){
                if(stack.isEmpty()) return -1;
                int a=stack.pop();
                int b=stack.pop();
                int res;
                if(tokens[i].equals("+")){
                    res=b+a;
                    stack.push(res);
                }else if(tokens[i].equals("-")){
                    res=b-a;
                    stack.push(res);
                }else if(tokens[i].equals("*")){
                    res=b*a;
                    stack.push(res);
                }else if(tokens[i].equals("/")){
                    res=b/a;
                    stack.push(res);
                }
            }else{
                int t=Integer.parseInt(tokens[i]);
                stack.push(t);
            }
            i++;
        }
        if(stack.isEmpty()) return -1;
        return stack.pop();
    }
}