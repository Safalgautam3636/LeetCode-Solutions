class Solution {
    public int characterReplacement(String s, int k) {
        HashMap<Character,Integer>hash=new HashMap<>();
        int ans=0;
        int left=0;
        
        for(int right=0;right<s.length();right++){
            hash.put(s.charAt(right),hash.getOrDefault(s.charAt(right),0)+1);
            int window=right-left+1;
            int max=0;
            for(char x:hash.keySet()){
                if(hash.get(x)>max){
                    max=hash.get(x);
                }
            }
            if(window-max<=k){
                ans=Math.max(ans,window);
            }
            else{
                hash.put(s.charAt(left),hash.get(s.charAt(left))-1);
                left++;
            }
            
            
        }
        return ans;
    }
}