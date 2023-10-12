class Solution {
    public int longestPalindrome(String s) {
        HashMap<Character,Integer>hash=new HashMap<>();
        for(char x:s.toCharArray()){
            hash.put(x,hash.getOrDefault(x,0)+1);
        }
        int length=0;
        int oddLength=0;
        for(Character x:hash.keySet()){
            if(hash.get(x)==1){
                oddLength=1;
            }
            if(hash.get(x)%2==0){
                length+=hash.get(x);
            }
            else{
                int temp=hash.get(x)-1;
                oddLength++;
                if(temp%2==0){
                    length+=temp;
                }
            }
        }
        if(oddLength>1){
            oddLength=1;
        }
        return length+oddLength;
    }
}