class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>>ans=new ArrayList<>();
        backtrack(s,ans,0,new ArrayList<>());
        return ans;
    }
    boolean isPalindrome(String str){
        int first=0;
        int second=str.length()-1;
        while(first<=second){
            if(str.charAt(first)!=str.charAt(second)){
                return false;
            }
            first++;
            second--;
        }
        return true;
    }
    void backtrack(String s,List<List<String>>ans, int index,List<String>temp){
        if(index==s.length()){
            ans.add(new ArrayList<>(temp));
        }
        for(int i=index;i<s.length();i++){
            String sub=s.substring(index,i+1);
            if(isPalindrome(sub)){
                temp.add(sub);
                backtrack(s,ans,i+1,temp);
                temp.remove(temp.size()-1);
            }
        }
    }
}