class Solution {
    public String reverseWords(String s) {
        String store[]=s.split(" ");
        String ans="";
        for(int i=store.length-1;i>=0;i--){
            store[i]=store[i].trim();
           
            if(i==0){
                if(store[i].equals("")){
                    ans=ans.trim()+store[i];
                    break;
                }
                ans=ans+store[i];
                break;
            }
            if(store[i].equals("")){
                    ans=ans.trim()+" "+store[i];
                
            }
            else{
                ans+=store[i]+" ";
            }
            
        }
        return ans;
    }
}