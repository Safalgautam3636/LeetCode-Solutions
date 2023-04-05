class Solution {
    public int longestValidParentheses(String s) {
        Stack<Integer>stack=new Stack<>();
        stack.push(-1);
        if(s==null || s==""){
            return 0;
        }
        int ans=0;
        for(int i=0;i<s.length();i++){
            char val=s.charAt(i);
            if(val=='('){
                stack.push(i);
            }
            else{
                stack.pop();
                if(stack.isEmpty()){
                    stack.push(i);
                }
                else{
                    ans=Math.max(ans,i-stack.peek());
                }
            }
        }
        return ans;
    }
}