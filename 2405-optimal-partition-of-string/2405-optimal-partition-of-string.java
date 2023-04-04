class Solution {
    public int partitionString(String s) {
        HashSet<Character>hash=new HashSet<>();
        int ans=1;
        for(char x:s.toCharArray()){
            if(hash.contains(x)){
                hash=new HashSet<>();
                hash.add(x);
                ans++;
            }
            else{
                hash.add(x);
            }
        }
        return ans;
    }
}