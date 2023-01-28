class Solution {
    public List<String> findAllConcatenatedWordsInADict(String[] words) {
        HashSet<String>hash=new HashSet<>();
        for(String word:words){
            hash.add(word);
        }
        List<String>ans=new ArrayList<>();
        for(String word:words){
            if(dfs(word,hash)){
                ans.add(word);
            }
        }
        return ans;
    }

    boolean dfs(String word,HashSet<String>hash){

        for(int i=1;i<word.length();i++){
            String prefix=word.substring(0,i);
            String suffix=word.substring(i);
            if(hash.contains(prefix)&&hash.contains(suffix)){
                return true;
            }
            if(hash.contains(prefix)&&dfs(suffix,hash)){
                return true;
            }
        }
        return false;
    }
}