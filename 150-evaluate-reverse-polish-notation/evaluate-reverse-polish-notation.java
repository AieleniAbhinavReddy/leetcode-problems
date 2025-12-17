class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> s=new Stack<>();
        int i=0;
        while(i<tokens.length){
            String curr=tokens[i++];
            if("+-*/".contains(curr)){
                int a=s.pop(),b=s.pop();
                if(curr.equals("+")) s.push(a+b);
                if(curr.equals("-")) s.push(b-a);
                if(curr.equals("*")) s.push(a*b);
                if(curr.equals("/")) s.push(b/a);
            }else{
                s.push(Integer.parseInt(curr));
            }
        }
        return s.pop();
        // Stack<Integer> s=new Stack<>();
        // int i=0;
        // while(i<tokens.length){
        //     String curr=tokens[i++];
        //     if(curr.equals("+")){
        //         int res=s.pop()+s.pop();
        //         s.push(res);
        //     }else if(curr.equals("-")){
        //         int a=s.pop(),b=s.pop();
        //         int res=b-a;
        //         s.push(res);
        //     }else if(curr.equals("*")){
        //         int res=s.pop()*s.pop();
        //         s.push(res);
        //     }else if(curr.equals("/")){
        //         int a=s.pop(),b=s.pop();
        //         int res=b/a;
        //         s.push(res);
        //     }else{
        //         s.push(Integer.parseInt(curr));
        //     }
        //     System.out.println(curr);
        // }
        // if(s.isEmpty()) return -1;
        // return s.pop();
    }
}