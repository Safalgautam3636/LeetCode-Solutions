class Solution {
    public String removeStars(String s) {
        Stack<Character>stack=new Stack();
        for(char val:s.toCharArray()){
            if(val!='*'){
                stack.push(val);
            }
            else{
                stack.pop();
            }
        }
       String ans="";
        if(stack.isEmpty()){
            return ans;
        }
        for(char x:stack){
            ans+=x;
        }
        return ans;
    }
}