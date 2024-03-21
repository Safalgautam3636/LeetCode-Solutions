class MinStack {
    Stack<Integer>stack1;
    Stack<Integer>minStack;
    int min=Integer.MAX_VALUE;
    public MinStack() {
        stack1=new Stack<>();
        minStack=new Stack<>();
        minStack.push(Integer.MAX_VALUE);
    }
    
    public void push(int val) {
        
        
        min=Math.min(val,minStack.peek());
        minStack.push(min);
        stack1.push(val);
        
    }
    
    public void pop() {
        stack1.pop();
        minStack.pop();
    }
    
    public int top() {
        return stack1.peek();
    }
    
    public int getMin() {
        return minStack.peek();
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