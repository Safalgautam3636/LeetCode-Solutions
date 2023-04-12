class Solution {
    public int lengthOfLongestSubstring(String s) {
        int max=0;
        int id=0;
        HashSet<Character>hash=new LinkedHashSet<>();
        for(int i=0;i<s.length();i++){
            while(hash.contains(s.charAt(i))){
                hash.remove(s.charAt(id++));
            }
                hash.add(s.charAt(i));
                max=Math.max(max,i-id+1);
        }
        return max;
    }
}