class Solution {
    public boolean checkInclusion(String s1, String s2) {
        // ab
        // eibaooo
        int windowSize=s1.length();
        int left=0;
        HashMap<Character,Integer>hash1=new HashMap<>();
        for(char x: s1.toCharArray()){
            hash1.put(x,hash1.getOrDefault(x,0)+1);
        }
        HashMap<Character,Integer>hash2=new HashMap<>();
        for(int right=0;right<s2.length();right++){
            hash2.put(s2.charAt(right),hash2.getOrDefault(s2.charAt(right),0)+1);
            
            if(right-left+1==windowSize){
                    if(hash1.equals(hash2)){
                    return true;
                }
                else{
                    hash2.put(s2.charAt(left),hash2.getOrDefault(s2.charAt(left),0)-1);
                    if(hash2.get(s2.charAt(left))<=0){
                        hash2.remove(s2.charAt(left));
                    }
                    left++;
                }
            }
            
            
            
        }
        return false;
    }
}