class Solution {
    //neetcode
    public int characterReplacement(String s, int k) {
        HashMap<Character,Integer>hash=new HashMap<>();
        int left=0;
        int length=0;
        for(int right=0;right<s.length();right++){
            hash.put(s.charAt(right),hash.getOrDefault(s.charAt(right),0)+1);
            int windowLength=right-left+1;
            int greaterCount=0;
            for(char x:hash.keySet()){
                greaterCount=Math.max(greaterCount,hash.get(x));
            }
            if(windowLength-greaterCount<=k){
                length=Math.max(length,windowLength);
            }
            else{
                hash.put(s.charAt(left),hash.get(s.charAt(left))-1);
                left++;
                
            }
        }
        return length;
    }
}