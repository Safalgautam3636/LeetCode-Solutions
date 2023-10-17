class Solution {
    public boolean checkInclusion(String s1, String s2) {
        boolean ans=false;
        char[]alpha=new char[26];
        for(int i=0;i<s1.length();i++){
            alpha[s1.charAt(i)-'a']++;
        }
        
        int left=0;
        for(int i=0;i<=s2.length()-s1.length();i++){
            int len=s1.length();
            char alpha2[]=new char[26];
            for(int j=i;j<i+len;j++){
                alpha2[s2.charAt(j)-'a']++;
            }
            System.out.println(Arrays.toString(alpha));
            System.out.println(Arrays.toString(alpha2));
            if(compare(alpha,alpha2)){
                return true;
            }
        }
        return false;
    }
    boolean compare(char a[],char b[]){
        for(int i=0;i<a.length;i++){
            if(a[i]!=b[i]){
                return false;
            }
        }
        return true;
    }
}