class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character,Integer>hash=new HashMap<>();
        HashMap<Character,Integer>hash1=new HashMap<>();
        for(char x:ransomNote.toCharArray()){
            hash.put(x,hash.getOrDefault(x,0)+1);
        }
        System.out.println(hash);
        for(char x:magazine.toCharArray()){
            hash1.put(x,hash1.getOrDefault(x,0)+1);
        }
        System.out.println(hash1);
        for(char x:hash.keySet()){
            if(hash1.containsKey(x)){
                hash.put(x,hash.get(x)-hash1.get(x));
            }
            else{
                return false;
            }
            
        }
        System.out.println(hash);
        for(char x:hash.keySet()){
            if(hash.get(x)>0){
                return false;
            }
        }
        System.out.println(hash);
        return true;
        
        
    }
}