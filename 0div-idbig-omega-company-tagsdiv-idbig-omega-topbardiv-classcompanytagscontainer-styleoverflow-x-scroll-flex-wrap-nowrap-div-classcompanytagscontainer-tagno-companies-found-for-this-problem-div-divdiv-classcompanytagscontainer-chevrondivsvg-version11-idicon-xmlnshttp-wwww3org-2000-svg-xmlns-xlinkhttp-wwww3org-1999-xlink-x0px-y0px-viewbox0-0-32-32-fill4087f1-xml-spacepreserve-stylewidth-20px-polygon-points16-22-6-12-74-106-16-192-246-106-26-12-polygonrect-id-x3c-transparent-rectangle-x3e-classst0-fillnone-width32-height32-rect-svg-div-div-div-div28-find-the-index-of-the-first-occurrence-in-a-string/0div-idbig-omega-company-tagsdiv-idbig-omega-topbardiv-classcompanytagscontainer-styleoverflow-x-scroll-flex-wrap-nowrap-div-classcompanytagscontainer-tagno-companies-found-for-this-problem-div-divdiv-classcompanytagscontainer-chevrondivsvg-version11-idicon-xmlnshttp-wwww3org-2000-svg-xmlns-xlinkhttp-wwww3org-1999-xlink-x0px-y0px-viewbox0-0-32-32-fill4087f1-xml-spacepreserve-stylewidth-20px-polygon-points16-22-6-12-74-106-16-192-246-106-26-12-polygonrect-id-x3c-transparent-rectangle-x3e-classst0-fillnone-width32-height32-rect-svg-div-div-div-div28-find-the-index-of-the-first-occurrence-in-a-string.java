class Solution {
    public int strStr(String haystack, String needle) {
        int len1=haystack.length();
        int len2=needle.length();
        int i=0;
        int j=0;
        int start=0;
        while(i<len1&&j<len2){
            System.out.println(haystack.charAt(i)+"  "+needle.charAt(j));
            if(haystack.charAt(i)==needle.charAt(j)){
               if(i-start+1==len2){
                   return start;
               }
                i++;
                j++;
            }
            else{
                j=0;
                i=start+1;
                start++;
            }
        }
        return -1;
        
    }
}