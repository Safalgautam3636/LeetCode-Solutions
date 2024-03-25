class Solution {
    public List<String> letterCombinations(String digits) {
        if(digits.equals(""))return new ArrayList<>();
        List<String>ans=new ArrayList<>();
        HashMap<Character,String>hash=new HashMap<>();
        hash.put('2',"abc");
        hash.put('3',"def");
        hash.put('4',"ghi");
        hash.put('5',"jkl");
        hash.put('6',"mno");
        hash.put('7',"pqrs");
        hash.put('8',"tuv");
        hash.put('9',"wxyz");
        dfs(digits,hash,ans,0,"");
        return ans;
    }
    void dfs(String digits,HashMap<Character,String>hash,List<String>ans,int index,String temp){
        
        if(index==digits.length()){
            ans.add(temp);
            return;
        }    
        char chx=digits.charAt(index);
        String str=hash.get(chx);
        for(int i=0;i<str.length();i++){
            
            dfs(digits,hash,ans,index+1,temp+str.charAt(i));
        }
    }
}