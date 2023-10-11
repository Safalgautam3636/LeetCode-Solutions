class Solution {
    public boolean isPalindrome(String s) {
        
        String newString=s;
        if(newString==null)return false;
        int first=0;
        int second=newString.length()-1;
        while(first<second){
            while(first<second&&!Character.isLetterOrDigit(newString.charAt(first))){
                first++;
            }
            while(first<second&&!Character.isLetterOrDigit(newString.charAt(second))){
                second--;
            }
            if (Character.toLowerCase(newString.charAt(first)) != Character.toLowerCase(newString.charAt(second))) {
                return false;
            }
            first++;
            second--;
        }
        return true;
        
        
    }
}