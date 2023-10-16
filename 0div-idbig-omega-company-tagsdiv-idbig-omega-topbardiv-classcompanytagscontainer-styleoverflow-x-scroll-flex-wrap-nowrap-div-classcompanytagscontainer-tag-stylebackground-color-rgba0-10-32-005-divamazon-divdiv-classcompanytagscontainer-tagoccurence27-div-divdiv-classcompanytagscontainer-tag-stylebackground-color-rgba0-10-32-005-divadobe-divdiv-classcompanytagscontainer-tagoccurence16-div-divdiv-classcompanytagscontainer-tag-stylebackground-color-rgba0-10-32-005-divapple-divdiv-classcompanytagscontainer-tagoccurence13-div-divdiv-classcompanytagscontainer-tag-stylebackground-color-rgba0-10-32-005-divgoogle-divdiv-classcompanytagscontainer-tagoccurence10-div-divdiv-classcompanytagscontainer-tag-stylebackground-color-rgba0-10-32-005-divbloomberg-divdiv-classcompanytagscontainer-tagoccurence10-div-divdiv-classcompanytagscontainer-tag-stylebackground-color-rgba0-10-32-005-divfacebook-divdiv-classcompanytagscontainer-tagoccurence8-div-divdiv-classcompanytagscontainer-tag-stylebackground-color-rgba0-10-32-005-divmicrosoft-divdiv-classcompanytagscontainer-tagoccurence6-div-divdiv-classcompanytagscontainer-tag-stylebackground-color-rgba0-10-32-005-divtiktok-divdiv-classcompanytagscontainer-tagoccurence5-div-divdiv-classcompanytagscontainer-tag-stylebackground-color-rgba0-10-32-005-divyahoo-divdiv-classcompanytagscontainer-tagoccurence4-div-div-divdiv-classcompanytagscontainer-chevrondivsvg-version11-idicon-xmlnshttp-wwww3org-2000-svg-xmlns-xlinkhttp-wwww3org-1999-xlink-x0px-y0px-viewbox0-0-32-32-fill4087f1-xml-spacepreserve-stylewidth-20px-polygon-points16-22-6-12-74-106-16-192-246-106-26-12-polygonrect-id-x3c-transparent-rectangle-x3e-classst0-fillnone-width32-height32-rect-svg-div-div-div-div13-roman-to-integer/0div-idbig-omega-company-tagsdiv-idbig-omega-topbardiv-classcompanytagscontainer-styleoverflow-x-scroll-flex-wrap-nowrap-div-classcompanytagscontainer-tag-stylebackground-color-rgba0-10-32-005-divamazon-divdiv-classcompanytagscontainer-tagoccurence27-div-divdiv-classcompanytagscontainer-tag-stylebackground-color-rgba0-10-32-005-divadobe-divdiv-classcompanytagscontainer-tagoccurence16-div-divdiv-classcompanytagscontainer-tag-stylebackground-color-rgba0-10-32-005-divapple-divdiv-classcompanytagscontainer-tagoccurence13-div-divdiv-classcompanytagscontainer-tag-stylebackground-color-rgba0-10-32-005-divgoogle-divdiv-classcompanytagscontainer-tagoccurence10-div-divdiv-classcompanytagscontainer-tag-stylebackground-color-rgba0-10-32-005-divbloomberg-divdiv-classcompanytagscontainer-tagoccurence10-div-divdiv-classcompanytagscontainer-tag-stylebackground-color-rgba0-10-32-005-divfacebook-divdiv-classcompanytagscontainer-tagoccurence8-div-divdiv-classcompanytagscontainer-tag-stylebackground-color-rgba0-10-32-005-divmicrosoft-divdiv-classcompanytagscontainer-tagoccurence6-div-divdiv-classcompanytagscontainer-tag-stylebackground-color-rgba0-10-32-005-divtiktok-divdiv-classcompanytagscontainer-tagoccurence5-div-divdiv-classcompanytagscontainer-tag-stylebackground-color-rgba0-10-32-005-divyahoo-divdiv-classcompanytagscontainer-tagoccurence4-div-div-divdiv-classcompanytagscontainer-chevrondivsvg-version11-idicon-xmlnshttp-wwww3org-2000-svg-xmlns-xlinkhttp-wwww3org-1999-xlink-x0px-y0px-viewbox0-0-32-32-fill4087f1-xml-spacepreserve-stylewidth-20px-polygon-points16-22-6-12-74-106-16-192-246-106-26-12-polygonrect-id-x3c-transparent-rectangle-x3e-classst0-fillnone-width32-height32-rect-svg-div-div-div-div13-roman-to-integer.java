class Solution {
    public int romanToInt(String s) {
        HashMap<Character,Integer>hash=new HashMap<>();
//         I             1
// V             5
// X             10
// L             50
// C             100
// D             500
// M             1000
        hash.put('I',1);
        hash.put('V',5);
        hash.put('X',10);
        hash.put('L',50);
        hash.put('C',100);
        hash.put('D',500);
        hash.put('M',1000);
        int len=s.length();
        int sum=0;
        int future=hash.get(s.charAt(0));
        for(int i=0;i<len-1;i++){
            int current=hash.get(s.charAt(i));
            future=hash.get(s.charAt(i+1));
            if(current<future){
                current=-1*current;
            }
            sum+=current;
        }
        return sum+future;
    }
}