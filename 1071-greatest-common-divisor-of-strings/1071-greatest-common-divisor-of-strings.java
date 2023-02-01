class Solution {
    public String gcdOfStrings(String str1, String str2) {
        int len1=str1.length();
        int len2=str2.length();
        String iterate="";
        int min=0;
        if(len1<len2){
            iterate=""+str1;
            min=len1;
        }
        else{
            iterate=""+str2;
            min=len2;
        }
        
        for(int i=min;i>=1;i--){
            if(len1%i==0&&len2%i==0){
                int factor1=len1/i;
                int factor2=len2/i;
                String store=iterate.substring(0,i);
                String first="";
                String second="";
                for(int k=0;k<factor1;k++){
                    first+=""+store;
                }
                for(int m=0;m<factor2;m++){
                    second+=""+store;
                }
                if(first.equals(str1)&&second.equals(str2)){
                    return store;
                }
                
            }
        }
        return "";
    }
}