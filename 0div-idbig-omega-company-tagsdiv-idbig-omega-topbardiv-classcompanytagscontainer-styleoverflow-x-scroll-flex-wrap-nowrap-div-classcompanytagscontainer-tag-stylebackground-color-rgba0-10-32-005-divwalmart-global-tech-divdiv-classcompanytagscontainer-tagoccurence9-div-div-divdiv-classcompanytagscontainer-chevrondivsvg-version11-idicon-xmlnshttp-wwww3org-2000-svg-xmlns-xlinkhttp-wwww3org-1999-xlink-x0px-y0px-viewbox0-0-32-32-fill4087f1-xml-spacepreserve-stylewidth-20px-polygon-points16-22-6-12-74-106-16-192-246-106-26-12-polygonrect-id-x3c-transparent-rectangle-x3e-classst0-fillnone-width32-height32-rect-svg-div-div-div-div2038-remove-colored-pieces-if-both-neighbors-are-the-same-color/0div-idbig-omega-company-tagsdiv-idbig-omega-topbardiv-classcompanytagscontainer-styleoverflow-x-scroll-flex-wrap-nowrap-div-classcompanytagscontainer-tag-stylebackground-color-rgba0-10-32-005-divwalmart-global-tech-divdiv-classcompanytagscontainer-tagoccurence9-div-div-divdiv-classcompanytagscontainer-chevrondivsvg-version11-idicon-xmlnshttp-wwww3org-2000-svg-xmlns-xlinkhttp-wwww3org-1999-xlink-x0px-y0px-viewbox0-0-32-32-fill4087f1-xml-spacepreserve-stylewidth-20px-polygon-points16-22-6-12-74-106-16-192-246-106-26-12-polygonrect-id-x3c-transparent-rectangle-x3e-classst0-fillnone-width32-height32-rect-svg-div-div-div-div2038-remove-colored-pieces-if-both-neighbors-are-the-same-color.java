class Solution {
    public boolean winnerOfGame(String colors) {
        int alice=0;
        int bob=0;
        StringBuilder clrs=new StringBuilder(colors);
        for(int i=1;i<clrs.length()-1;i++){
            if(clrs.charAt(i-1)==clrs.charAt(i+1)&&clrs.charAt(i)==clrs.charAt(i-1)){
                if(clrs.charAt(i)=='A'){
                    alice++;
                }
                else{
                    bob++;
                }
            }
        }
        return alice-bob>0;
        
    }
    //"AAAABBBB"
    //AAABBBB
    //
    static boolean helper(StringBuilder clrs,char turn){
        // true - B ko oripari B xaina
        // false - A ko oripari A xaina
        if(clrs.length()<=2)return false;
        
        for(int i=1;i<clrs.length()-1;i++){
            // A- A A A
            // B- B B B
            if(clrs.charAt(i-1)==turn&&clrs.charAt(i+1)==turn){
                clrs.deleteCharAt(i);
                // AAABABB
                // AABABB
                
                if(turn=='A'){
                    return helper(clrs,'B');
                }
                else{
                    return helper(clrs,'A');
                }
            }
            else{
                // A - B A B 
                if(turn=='A'&&turn!=clrs.charAt(i-1)){
                    return false;
                }
                if(turn=='A'&&turn!=clrs.charAt(i+1)){
                    return false;
                }
                // B - A B A
                //
                if(turn=='B'&&turn!=clrs.charAt(i-1)){
                    return true;
                }
                if(turn=='B'&&turn!=clrs.charAt(i+1)){
                    return true;
                }
                
            }
            
        }
        return turn=='A'?false:true;
    }
}