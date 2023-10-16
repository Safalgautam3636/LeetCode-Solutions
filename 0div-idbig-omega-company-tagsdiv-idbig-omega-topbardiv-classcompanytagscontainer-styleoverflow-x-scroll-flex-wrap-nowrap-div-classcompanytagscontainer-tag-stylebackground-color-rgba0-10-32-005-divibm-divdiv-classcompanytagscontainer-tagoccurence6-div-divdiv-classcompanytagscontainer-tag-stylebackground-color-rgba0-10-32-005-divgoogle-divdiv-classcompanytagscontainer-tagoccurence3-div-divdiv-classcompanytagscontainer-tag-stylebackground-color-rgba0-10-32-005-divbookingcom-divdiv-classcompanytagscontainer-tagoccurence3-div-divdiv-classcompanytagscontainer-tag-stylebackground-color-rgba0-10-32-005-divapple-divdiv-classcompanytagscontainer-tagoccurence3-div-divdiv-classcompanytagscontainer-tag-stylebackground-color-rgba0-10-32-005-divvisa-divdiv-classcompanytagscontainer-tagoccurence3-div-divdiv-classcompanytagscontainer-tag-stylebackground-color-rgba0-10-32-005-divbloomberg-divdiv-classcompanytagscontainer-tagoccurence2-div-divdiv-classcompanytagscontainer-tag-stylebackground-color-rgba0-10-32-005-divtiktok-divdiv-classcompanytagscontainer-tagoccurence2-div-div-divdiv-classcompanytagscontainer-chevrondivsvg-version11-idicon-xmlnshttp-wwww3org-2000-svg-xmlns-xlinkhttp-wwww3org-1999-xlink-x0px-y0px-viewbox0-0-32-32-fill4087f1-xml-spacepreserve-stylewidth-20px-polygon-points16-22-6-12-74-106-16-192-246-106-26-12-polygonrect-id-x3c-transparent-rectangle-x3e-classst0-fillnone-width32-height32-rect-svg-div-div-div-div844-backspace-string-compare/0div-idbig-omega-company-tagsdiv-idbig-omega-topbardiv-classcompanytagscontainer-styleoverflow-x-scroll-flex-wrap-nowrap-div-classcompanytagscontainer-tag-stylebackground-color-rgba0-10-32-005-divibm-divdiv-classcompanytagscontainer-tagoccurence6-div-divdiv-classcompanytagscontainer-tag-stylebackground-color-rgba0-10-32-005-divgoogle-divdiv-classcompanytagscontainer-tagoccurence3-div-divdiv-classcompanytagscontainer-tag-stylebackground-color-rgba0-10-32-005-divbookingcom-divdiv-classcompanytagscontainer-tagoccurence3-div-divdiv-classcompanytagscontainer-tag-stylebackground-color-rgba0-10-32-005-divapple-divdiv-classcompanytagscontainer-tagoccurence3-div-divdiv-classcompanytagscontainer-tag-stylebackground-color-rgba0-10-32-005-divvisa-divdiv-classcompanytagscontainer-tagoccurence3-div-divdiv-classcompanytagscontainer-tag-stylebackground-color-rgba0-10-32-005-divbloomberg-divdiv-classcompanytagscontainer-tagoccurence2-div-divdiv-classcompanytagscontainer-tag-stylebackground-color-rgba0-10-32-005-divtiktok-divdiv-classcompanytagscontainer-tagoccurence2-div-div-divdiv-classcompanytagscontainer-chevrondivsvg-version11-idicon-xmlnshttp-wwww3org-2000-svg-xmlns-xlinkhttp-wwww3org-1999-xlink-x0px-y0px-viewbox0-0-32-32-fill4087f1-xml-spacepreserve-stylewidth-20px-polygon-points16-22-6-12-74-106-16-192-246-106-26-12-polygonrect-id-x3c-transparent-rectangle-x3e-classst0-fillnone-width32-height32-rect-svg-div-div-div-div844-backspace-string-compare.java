class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character>stack=new Stack<>();
        for(char x:s.toCharArray()){
            if(x!='#'){
                stack.push(x);
            }
            else{
                if(!stack.isEmpty()){
                    stack.pop();
                }
                
            }
        }
        StringBuilder str=new StringBuilder();
        while(!stack.isEmpty()){
            str.append(stack.pop());
        }
        
        stack=new Stack<>();
        for(char x:t.toCharArray()){
            if(x!='#'){
                stack.push(x);
            }
            else{
                if(!stack.isEmpty()){
                    stack.pop();
                }
                
            }
        }
        StringBuilder str1=new StringBuilder();
        while(!stack.isEmpty()){
            str1.append(stack.pop());
        }
        if(str1.toString().equals("")&&str.toString().equals("")){
            return true;
        }
        return str1.toString().equals(str.toString());
        
    }
}