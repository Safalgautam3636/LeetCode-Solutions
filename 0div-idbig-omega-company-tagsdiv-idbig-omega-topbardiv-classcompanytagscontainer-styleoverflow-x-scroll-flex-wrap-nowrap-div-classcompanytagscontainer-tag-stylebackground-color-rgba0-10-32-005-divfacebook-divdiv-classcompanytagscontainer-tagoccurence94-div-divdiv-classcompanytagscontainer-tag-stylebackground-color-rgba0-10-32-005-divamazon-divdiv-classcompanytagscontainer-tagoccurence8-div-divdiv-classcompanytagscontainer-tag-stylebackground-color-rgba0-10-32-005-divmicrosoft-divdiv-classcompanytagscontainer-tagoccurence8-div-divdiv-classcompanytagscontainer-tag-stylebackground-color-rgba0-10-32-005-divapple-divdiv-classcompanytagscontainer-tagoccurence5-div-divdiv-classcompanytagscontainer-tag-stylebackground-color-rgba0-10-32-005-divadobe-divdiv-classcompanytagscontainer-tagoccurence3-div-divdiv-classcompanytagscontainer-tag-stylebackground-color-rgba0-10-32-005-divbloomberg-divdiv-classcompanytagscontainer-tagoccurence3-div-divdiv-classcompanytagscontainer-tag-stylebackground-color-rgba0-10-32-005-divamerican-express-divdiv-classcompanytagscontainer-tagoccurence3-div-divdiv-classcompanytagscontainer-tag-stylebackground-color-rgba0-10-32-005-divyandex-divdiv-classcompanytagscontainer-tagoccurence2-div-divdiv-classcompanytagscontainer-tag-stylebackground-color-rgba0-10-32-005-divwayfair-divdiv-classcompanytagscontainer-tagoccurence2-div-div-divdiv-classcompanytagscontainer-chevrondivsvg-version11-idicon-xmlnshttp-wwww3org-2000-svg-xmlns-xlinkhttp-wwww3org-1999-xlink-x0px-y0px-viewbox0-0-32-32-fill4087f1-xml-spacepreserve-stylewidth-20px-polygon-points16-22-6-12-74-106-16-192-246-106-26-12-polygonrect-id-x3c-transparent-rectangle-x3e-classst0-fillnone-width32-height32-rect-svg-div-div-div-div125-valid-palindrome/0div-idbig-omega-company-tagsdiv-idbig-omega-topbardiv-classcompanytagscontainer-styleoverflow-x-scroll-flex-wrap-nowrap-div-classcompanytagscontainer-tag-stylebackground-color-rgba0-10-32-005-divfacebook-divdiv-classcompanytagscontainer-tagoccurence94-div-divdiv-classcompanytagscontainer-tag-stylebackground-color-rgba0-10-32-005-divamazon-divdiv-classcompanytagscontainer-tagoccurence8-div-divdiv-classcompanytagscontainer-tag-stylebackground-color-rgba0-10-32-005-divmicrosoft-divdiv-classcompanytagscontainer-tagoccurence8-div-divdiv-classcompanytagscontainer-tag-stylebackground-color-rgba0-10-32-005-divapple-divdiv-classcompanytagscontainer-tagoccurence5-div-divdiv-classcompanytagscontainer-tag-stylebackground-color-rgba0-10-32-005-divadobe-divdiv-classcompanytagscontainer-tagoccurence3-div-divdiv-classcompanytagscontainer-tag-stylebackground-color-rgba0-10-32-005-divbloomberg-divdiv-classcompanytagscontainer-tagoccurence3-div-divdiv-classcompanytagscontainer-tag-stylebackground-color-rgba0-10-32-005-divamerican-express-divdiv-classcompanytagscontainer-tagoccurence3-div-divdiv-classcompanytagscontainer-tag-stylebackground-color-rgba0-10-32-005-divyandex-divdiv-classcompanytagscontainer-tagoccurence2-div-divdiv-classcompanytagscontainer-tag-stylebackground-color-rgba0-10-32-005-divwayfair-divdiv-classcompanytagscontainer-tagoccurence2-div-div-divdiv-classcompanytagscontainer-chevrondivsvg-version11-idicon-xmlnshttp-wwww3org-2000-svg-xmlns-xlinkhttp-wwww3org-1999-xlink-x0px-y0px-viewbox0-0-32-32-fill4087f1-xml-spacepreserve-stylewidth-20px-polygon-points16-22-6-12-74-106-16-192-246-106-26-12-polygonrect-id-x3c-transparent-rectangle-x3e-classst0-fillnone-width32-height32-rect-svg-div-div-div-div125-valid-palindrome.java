class Solution {
    public boolean isPalindrome(String s) {
        
        String str=s.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
        int left=0;
        int right=str.length()-1;
        System.out.println(str);
        
        System.out.print(str);
        while(left<=right){
            char leftChar=str.charAt(left);
            char rightChar=str.charAt(right);
            
            if(leftChar!=rightChar){
                return false;
            }
            right--;
            left++;
        }
        return true;
    }
}