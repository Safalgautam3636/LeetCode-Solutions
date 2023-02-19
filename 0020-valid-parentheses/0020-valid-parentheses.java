class Solution {
    public boolean isValid(String s) {
        if(s.length()<=1||s.charAt(0)==')'||s.charAt(0)==']'||s.charAt(0)=='}'){
            return false;
        }
        Stack<Character>stack=new Stack<>();
        for(int i=0;i<s.length();i++){
            char br=s.charAt(i);
            if(br=='('||br=='['||br=='{'){
                stack.push(br);
            }
            else if(br==']'||br=='}'||br==')'){
                if(stack.isEmpty())return false;
                char top=stack.peek();
                if(top=='['&&br==']'){
                    stack.pop();
                }
                else if(top=='('&&br==')'){
                    stack.pop();
                }
                else if(top=='{'&&br=='}'){
                    stack.pop();
                }
                else{
                    return false;
                }
            }
        }
        if(stack.isEmpty()){
            return true;
        }
        return false;
    }
}