class Solution {
    public boolean isPalindrome(String s) {
        
        String newString=s.replaceAll("[^A-Za-z0-9]","").toLowerCase();
        if(newString==null)return false;
        int first=0;
        int second=newString.length()-1;
        while(first<second){
            if(newString.charAt(first)!=newString.charAt(second)){
                return false;
            }
            first++;
            second--;
        }
        return true;
        
        
    }
}