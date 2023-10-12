class Solution {
    public String addBinary(String a, String b) {
        int first=a.length()-1;
        int second=b.length()-1;
        int carry=0;
        StringBuilder ans=new StringBuilder();
        while(first>=0||second>=0){
            int sum=carry;
            if(first>=0){
                sum+=a.charAt(first)-'0';
                first--;
            }
            if(second>=0){
                sum+=b.charAt(second)-'0';
                second--;
            }
            carry=sum/2;
            ans.append(sum%2);
        }
        if(carry!=0){
            ans.append(1);
        }
        return ans.reverse().toString();
    }
}