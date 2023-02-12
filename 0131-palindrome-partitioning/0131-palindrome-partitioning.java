class Solution {
    public List<List<String>> partition(String s) {
        int index=0;
        List<String>instance=new ArrayList<>();
        List<List<String>>ans=new ArrayList<>();
        dfs(s,instance,ans,index);
        return ans;
    }
    void dfs(String s,List<String>instance,List<List<String>>ans,int index){
        
        if(index==s.length()){
            ans.add(new ArrayList(instance));
            return;
        }
        else{
            for(int i=index;i<s.length();i++){
                System.out.println(index+","+i);
                String variable=s.substring(index,i+1);
                int len=variable.length();
                if(isPalindrome(s,index,i)){
                    instance.add(variable);
                    dfs(s,instance,ans,index+len);
                    instance.remove(instance.size()-1);
                }
            }
        }
    }
    boolean isPalindrome(String s,int i,int j){
        int first=i;
        int last=j;
        while(first<=last){
            if(s.charAt(first)!=s.charAt(last)){
                return false;
            }
            first++;
            last--;
        }
        return true;
    }
}