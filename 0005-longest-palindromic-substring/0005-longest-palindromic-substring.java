class Solution {
   
    public String longestPalindrome(String s) {
        int maxLen=0;
        String str="";
        for(int i=0;i<s.length();i++){
            // expand(s,i,i);
            // expand(s,i,i+1);
            int start=i;
            int end=i;
            while(start>=0 && end<s.length() &&s.charAt(start)==s.charAt(end)){
                if(end-start+1>maxLen){
                    maxLen=end-start+1;
                    str=s.substring(start,end+1);
                }
                start--;
                end++;
             }
            start=i;
            end=i+1;
            while(start>=0 && end<s.length() &&s.charAt(start)==s.charAt(end)){
                if(end-start+1>maxLen){
                    maxLen=end-start+1;
                    str=s.substring(start,end+1);
                }
                start--;
                end++;
            }
        }
        return str;
    }
   
}