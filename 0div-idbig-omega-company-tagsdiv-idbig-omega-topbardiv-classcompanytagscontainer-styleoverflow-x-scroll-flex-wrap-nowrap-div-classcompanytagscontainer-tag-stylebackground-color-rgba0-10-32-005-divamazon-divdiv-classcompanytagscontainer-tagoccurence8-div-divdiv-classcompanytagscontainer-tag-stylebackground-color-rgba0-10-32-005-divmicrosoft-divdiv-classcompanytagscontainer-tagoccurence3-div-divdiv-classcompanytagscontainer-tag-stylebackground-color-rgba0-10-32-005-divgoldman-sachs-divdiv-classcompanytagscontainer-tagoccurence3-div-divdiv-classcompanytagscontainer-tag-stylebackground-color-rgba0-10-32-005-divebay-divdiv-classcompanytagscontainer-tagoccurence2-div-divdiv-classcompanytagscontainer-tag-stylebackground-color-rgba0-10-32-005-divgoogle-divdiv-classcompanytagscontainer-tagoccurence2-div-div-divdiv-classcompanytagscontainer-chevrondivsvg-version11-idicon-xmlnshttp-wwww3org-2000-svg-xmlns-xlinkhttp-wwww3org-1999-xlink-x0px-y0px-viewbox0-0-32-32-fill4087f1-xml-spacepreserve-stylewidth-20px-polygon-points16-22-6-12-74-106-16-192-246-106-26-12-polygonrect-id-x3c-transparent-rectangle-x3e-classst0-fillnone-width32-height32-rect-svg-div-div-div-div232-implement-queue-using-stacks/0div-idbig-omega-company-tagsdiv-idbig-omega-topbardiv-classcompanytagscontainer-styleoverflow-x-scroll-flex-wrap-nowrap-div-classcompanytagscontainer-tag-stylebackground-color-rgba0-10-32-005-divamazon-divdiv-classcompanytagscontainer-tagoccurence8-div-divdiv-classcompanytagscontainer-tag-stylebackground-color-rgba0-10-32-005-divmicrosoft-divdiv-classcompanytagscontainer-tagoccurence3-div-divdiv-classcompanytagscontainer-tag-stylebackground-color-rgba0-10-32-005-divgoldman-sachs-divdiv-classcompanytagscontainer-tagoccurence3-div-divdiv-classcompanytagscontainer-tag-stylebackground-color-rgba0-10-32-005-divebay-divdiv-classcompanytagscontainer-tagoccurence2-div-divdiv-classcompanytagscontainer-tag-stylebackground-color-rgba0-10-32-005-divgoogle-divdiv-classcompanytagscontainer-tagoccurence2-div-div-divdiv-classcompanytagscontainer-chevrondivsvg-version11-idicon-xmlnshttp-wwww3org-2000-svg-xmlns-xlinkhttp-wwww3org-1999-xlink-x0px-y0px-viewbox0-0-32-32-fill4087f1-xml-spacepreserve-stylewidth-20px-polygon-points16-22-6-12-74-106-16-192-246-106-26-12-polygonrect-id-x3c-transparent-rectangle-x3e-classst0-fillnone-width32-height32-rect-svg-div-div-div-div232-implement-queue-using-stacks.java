class MyQueue {
    Stack<Integer>stack1;
    Stack<Integer>stack2;
    
    public MyQueue() {
        this.stack1=new Stack();
        this.stack2=new Stack();
        
    }
    
    public void push(int x) {
        stack1.push(x);
    }
    
    public int pop() {
        while(!stack1.isEmpty()){
            stack2.push(stack1.pop());
        }
        System.out.println(stack2);
        int x=stack2.pop();
        System.out.println(stack2);
        while(!stack2.isEmpty()){
            stack1.push(stack2.pop());
        }
        return x;
    }
    
    public int peek() {
        while(!stack1.isEmpty()){
            stack2.push(stack1.pop());
        }
        System.out.println(stack2);
        int x= stack2.peek();
        System.out.println(x);
         while(!stack2.isEmpty()){
            stack1.push(stack2.pop());
        }
        return x;
    }
    
    public boolean empty() {
         
        return stack1.isEmpty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */