class Solution {
    private static boolean isVowel(char c){
        
        char charArr[]={'a','e','i','o','u','A','E','I','O','U'};
        for(int i=0;i<charArr.length;i++){
            if(c==charArr[i]){
                return true;
            }
        }
        return false;
    }
    public String reverseVowels(String s) {
        StringBuilder s1=new StringBuilder(s);
        int len1=s.length();
        int i=0;
        int j=s.length()-1;
        while(i<=j){
            if(isVowel(s1.charAt(i))&&isVowel(s1.charAt(j))){
                char first=s1.charAt(i);
                char second=s1.charAt(j);
                s1.setCharAt(i,second);
                s1.setCharAt(j,first);
                i++;
                j--;
            }
            else if(isVowel(s1.charAt(i))){
                j--;
            }
            else{
                i++;
            }
        }
        return s1.toString();
    }
}
