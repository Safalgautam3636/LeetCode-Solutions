class Solution {
    public String gcdOfStrings(String str1, String str2) {
        int len1=str1.length();
        int len2=str2.length();
        int min=Math.min(len1,len2);
        String temp="";
        String ans="";
        for(int i=0;i<min;i++){
            if(str1.charAt(i)==str2.charAt(i)){
                temp+=""+str1.charAt(i);
                
                int lenTemp=temp.length();
                if(lenTemp>0&&len1%lenTemp==0&&len2%lenTemp==0){
                    int factor1=len1/lenTemp;
                    int factor2=len2/lenTemp;
                    String newStr1="";
                    String newStr2="";
                    for(int itr1=0;itr1<factor1;itr1++){
                        newStr1+=""+temp;
                        
                    }
                    System.out.println(newStr1);
                    for(int itr1=0;itr1<factor2;itr1++){
                        newStr2+=""+temp;
                        
                    }
                    System.out.println(newStr2);
                    if(str1.equals(newStr1)&&str2.equals(newStr2)){
                        ans=temp;
                    }
                    
                    
                }
            }
        }
        return ans;
    }
}