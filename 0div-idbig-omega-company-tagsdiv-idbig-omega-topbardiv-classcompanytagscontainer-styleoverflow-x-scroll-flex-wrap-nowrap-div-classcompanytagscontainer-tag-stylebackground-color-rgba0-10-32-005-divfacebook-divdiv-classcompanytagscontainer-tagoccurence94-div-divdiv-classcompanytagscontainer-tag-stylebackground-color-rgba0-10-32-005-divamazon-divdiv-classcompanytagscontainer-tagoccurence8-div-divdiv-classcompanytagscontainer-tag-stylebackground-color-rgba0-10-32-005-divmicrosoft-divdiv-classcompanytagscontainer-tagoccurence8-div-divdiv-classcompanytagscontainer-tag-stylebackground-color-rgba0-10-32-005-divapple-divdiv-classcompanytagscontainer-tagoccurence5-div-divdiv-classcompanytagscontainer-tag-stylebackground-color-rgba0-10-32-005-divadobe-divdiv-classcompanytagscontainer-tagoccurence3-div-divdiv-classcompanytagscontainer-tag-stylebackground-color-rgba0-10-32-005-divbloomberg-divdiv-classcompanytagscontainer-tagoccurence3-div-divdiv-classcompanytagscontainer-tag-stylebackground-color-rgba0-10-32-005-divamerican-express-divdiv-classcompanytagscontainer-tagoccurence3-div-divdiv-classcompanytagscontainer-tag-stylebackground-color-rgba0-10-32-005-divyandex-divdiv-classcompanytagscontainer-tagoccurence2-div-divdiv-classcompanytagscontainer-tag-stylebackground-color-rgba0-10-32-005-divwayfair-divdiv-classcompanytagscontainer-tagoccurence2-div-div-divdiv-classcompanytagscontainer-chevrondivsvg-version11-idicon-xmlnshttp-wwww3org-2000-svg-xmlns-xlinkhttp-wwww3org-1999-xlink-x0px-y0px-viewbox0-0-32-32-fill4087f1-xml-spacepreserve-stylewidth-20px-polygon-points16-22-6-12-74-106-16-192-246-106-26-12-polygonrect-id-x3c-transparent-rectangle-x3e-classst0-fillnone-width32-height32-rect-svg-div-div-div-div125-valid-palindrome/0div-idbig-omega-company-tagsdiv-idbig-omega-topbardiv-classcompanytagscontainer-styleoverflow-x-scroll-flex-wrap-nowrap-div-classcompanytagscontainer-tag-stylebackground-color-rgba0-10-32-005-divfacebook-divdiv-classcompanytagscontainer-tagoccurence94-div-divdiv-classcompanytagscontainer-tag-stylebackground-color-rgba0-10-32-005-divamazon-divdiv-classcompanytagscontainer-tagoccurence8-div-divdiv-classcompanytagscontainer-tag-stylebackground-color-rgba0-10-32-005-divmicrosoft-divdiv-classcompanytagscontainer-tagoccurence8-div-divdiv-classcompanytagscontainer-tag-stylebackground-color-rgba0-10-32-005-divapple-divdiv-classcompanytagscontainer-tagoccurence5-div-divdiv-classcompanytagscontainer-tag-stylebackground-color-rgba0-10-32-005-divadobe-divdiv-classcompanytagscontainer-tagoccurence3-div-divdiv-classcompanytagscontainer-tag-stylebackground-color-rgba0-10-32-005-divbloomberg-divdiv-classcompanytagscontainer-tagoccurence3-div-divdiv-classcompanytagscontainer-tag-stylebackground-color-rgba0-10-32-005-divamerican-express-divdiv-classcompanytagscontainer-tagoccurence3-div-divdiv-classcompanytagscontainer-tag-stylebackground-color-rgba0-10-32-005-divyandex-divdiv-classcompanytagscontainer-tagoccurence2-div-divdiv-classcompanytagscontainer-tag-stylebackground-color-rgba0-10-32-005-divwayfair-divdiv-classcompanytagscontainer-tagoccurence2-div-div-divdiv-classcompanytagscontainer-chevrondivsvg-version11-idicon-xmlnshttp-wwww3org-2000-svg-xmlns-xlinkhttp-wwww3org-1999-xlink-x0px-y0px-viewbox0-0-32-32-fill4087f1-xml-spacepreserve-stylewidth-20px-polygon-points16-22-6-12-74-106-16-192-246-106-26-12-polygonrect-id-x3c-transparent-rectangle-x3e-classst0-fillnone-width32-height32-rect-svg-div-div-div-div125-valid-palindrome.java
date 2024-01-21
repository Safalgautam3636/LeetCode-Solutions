class Solution {
    public boolean isPalindrome(String s) {
        // String refined="";
        // for(int i=0;i<s.length();i++){
        //     if(s.charAt(i)>='A'||s.charAt(i)<='Z'||s.charAt(i)>='a'||s.charAt(i)<='z'){
        //         refined+=Character.toLowerCase(s.charAt(i));
        //     }
        // }
        // System.out.println(refined);
        // return false;
        s=s.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
        return checkIfPalindrome(s);
    }
    static boolean checkIfPalindrome(String s){
        int first=0;
        int last=s.length()-1;
        while(first<=last){
            if(s.charAt(first)!=s.charAt(last)){
                return false;
            }
            first++;
            last--;
        }
        return true;
    }
}