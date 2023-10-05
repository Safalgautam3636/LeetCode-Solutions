class Solution {
    public String removeStars(String s) {
        int len=s.length();
        Stack<Character>stack=new Stack<>();
        for(char x:s.toCharArray()){
            if(x!='*')
                stack.push(x);
            else stack.pop();
        }
        System.out.print(stack);
        String ans="";
        int size=stack.size();
        for(int i=0;i<size;i++)
            ans+=stack.pop();
        StringBuilder str=new StringBuilder(ans);
        return str.reverse().toString();
    }
}