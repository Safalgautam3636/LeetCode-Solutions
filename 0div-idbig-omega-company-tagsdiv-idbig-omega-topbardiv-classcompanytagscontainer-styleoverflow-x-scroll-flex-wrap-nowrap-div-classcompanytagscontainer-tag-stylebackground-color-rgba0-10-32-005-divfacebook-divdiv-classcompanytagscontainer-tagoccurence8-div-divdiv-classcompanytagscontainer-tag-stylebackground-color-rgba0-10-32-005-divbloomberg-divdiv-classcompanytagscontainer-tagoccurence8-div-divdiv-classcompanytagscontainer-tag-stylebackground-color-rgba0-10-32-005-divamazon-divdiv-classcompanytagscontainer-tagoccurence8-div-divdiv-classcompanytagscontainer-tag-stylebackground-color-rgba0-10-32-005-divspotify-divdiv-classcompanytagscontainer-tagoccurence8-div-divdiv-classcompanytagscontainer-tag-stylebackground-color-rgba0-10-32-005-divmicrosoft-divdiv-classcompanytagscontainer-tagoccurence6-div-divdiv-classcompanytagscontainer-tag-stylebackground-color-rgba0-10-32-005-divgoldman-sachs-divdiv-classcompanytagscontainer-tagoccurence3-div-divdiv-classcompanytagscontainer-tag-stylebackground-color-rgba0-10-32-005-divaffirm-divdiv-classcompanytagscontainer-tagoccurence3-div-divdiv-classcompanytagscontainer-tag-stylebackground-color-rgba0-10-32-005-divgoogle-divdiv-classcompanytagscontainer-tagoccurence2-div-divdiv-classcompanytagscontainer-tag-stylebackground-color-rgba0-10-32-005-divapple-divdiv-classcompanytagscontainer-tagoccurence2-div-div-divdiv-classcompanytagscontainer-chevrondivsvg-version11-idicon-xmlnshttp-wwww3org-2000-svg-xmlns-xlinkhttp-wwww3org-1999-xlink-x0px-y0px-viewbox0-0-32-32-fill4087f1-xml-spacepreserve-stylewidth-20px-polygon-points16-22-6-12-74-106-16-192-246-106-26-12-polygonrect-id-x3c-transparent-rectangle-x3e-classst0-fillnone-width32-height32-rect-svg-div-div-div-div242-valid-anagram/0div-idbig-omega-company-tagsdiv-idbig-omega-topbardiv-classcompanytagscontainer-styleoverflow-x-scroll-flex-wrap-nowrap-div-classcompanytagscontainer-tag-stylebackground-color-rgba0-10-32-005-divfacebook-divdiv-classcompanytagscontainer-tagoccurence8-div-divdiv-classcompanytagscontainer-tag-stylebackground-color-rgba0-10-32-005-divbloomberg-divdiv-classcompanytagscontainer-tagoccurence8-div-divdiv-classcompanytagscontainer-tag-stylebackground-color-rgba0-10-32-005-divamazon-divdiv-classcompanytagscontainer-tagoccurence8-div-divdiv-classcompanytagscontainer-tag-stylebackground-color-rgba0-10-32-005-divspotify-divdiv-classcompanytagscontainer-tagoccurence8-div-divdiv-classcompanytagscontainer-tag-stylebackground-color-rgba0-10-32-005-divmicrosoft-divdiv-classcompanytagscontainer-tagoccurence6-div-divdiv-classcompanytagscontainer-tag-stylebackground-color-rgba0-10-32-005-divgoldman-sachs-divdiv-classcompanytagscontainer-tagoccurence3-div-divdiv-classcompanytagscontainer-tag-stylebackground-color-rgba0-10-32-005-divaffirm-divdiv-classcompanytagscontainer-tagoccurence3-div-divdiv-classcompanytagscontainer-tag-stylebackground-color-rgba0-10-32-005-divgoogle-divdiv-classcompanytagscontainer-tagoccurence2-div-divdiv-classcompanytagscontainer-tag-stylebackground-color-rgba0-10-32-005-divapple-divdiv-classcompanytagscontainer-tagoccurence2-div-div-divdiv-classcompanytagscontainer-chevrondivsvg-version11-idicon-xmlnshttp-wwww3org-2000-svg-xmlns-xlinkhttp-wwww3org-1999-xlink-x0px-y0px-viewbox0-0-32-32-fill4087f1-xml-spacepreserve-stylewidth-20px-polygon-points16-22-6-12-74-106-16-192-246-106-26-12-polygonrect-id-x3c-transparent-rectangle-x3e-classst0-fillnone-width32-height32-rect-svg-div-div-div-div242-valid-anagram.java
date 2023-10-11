class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character,Integer>hash=new HashMap<>();
        if(s.length()!=t.length()){
            return false;
        }
        for(int i=0;i<s.length();i++){
            hash.put(s.charAt(i),hash.getOrDefault(s.charAt(i),0)+1);
        }
        for(int i=0;i<s.length();i++){
            // hash.put(s.charAt(i),hash.getOrDefault(s.charAt(i),0)+1);
            if(hash.containsKey(t.charAt(i))){
                int num=hash.get(t.charAt(i));
                hash.put(t.charAt(i),num-1);
            }
            else{
                return false;
            }
        }
        for(char x:hash.keySet()){
            if(hash.get(x)<0){
                return false;
            }
        }
        return true;
    }
}