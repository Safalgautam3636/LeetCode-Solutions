class Solution {
    public int evalRPN(String[] tokens) {
        int ans=0;
        Stack<String>stack=new Stack<>();
        for(String token:tokens){
            if(token.equals("+")||token.equals("-")||token.equals("*")||token.equals("/")){
                if(stack.size()>=2){
                    int first=Integer.parseInt(stack.pop());
                    int second=Integer.parseInt(stack.pop());
                    if(token.equals("+")){
                        ans=second+first;
                    }
                    else if(token.equals("-")){
                        ans=second-first;
                    }
                    else if(token.equals("*")){
                        ans=second*first;
                    }
                    else if(token.equals("/")){
                        ans=second/first;
                    }
                    stack.push(ans+"");
                    ans=0;
                }
            }
            else{
                stack.push(token);
            }
        }
        if(!stack.isEmpty()){
            return Integer.parseInt(stack.pop());
        }
        return 0;
    }
}