class Solution {
    public boolean checkInclusion(String s1, String s2) {
        char arr1[]=new char[26];
        char arr2[]=new char[26];
        if (s2.length() < s1.length()) {
        return false;
    }

        for(int i=0;i<s1.length();i++){
            arr1[s1.charAt(i)-'a']++;
        }
        for(int j=0;j<s1.length();j++){
            arr2[s2.charAt(j)-'a']++;
        }
        if(Arrays.equals(arr1,arr2)){
                return true;
        }
        int left=0;
        for(int j=1;j<=s2.length()-s1.length();j++){
            arr2[s2.charAt(j-1)-'a']--;
            arr2[s2.charAt(j+s1.length()-1)-'a']++;
            if(Arrays.equals(arr1,arr2)){
            return true;}
            
            
        }
        if(Arrays.equals(arr1,arr2)){
            return true;
        }
        return false;
        
    }
}