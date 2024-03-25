class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>>ans=new ArrayList<>();
        dfs(s,ans,new ArrayList<>(),0);
        return ans;
    }
    void dfs(String s,List<List<String>>ans,List<String>temp,int index){
        if(index>=s.length()){
            ans.add(new ArrayList<>(temp));
            return;
        }
        for(int i=index;i<s.length();i++){
            String sub=s.substring(index,i+1);
            if(isPalindrome(sub)){
                temp.add(sub);
                dfs(s,ans,temp,i+1);
                temp.remove(temp.size()-1);
            }
        }
    }
    boolean isPalindrome(String s){
        int first=0;
        int second=s.length()-1;
        while(first<=second){
            if(s.charAt(first)!=s.charAt(second)){
                return false;
            }
            first++;
            second--;
        }
        return true;
    }
}