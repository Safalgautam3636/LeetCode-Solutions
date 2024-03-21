class Solution {
    //hash1 for s  hash2 for t so t is small
    private boolean check(HashMap<Character,Integer>hash1,HashMap<Character,Integer>hash2){
        for(char x:hash2.keySet()){
            if(hash1.containsKey(x)){
                if(hash1.get(x)>=hash2.get(x)){
                    continue;
                }
                else{
                    return false;
                }
            }
            else{
                return false;
            }
        }
        return true;
    }
    public String minWindow(String s, String t) {
        HashMap<Character,Integer>hash1=new HashMap<>();
        HashMap<Character,Integer>hash2=new HashMap<>();
        for(char x:t.toCharArray()){
            hash2.put(x,hash2.getOrDefault(x,0)+1);
        }
        int left=0;
        String ans="";
        int minValue=Integer.MAX_VALUE;
        for(int right=0;right<s.length();right++){
            hash1.put(s.charAt(right),hash1.getOrDefault(s.charAt(right),0)+1);
            boolean contains=check(hash1,hash2);
            if(contains){
                while(contains){
                    String substring=s.substring(left,right+1);
                if(substring.length()<minValue){
                    ans=new String(substring);
                    minValue=ans.length();
                }
                hash1.put(s.charAt(left),hash1.get(s.charAt(left))-1);
                

                if(hash1.get(s.charAt(left))<=0){
                    hash1.remove(s.charAt(left));
                }
                left++;
                    contains=check(hash1,hash2);
                }
                
            }
                
            
        }
        return ans;
    }
} 