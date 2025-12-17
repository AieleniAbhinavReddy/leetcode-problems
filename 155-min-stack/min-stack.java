class MinStack {
    Stack<int[]> s;
    int min;
    public MinStack() {
        s=new Stack<>();
        min=Integer.MAX_VALUE;
    }
    
    public void push(int val) {
        if(s.isEmpty()) min=val;
        else min=Math.min(val,min);
        int[] temp={val,min};
        s.push(temp);
    }
    
    public void pop() {
        s.pop();
        if(!s.isEmpty()){
            int[] temp=s.peek();
            min=temp[1];
        }
    }
    
    public int top() {
        int[] temp=s.peek();
        return temp[0];
    }
    
    public int getMin() {
        int[] temp=s.peek();
        return temp[1];
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */