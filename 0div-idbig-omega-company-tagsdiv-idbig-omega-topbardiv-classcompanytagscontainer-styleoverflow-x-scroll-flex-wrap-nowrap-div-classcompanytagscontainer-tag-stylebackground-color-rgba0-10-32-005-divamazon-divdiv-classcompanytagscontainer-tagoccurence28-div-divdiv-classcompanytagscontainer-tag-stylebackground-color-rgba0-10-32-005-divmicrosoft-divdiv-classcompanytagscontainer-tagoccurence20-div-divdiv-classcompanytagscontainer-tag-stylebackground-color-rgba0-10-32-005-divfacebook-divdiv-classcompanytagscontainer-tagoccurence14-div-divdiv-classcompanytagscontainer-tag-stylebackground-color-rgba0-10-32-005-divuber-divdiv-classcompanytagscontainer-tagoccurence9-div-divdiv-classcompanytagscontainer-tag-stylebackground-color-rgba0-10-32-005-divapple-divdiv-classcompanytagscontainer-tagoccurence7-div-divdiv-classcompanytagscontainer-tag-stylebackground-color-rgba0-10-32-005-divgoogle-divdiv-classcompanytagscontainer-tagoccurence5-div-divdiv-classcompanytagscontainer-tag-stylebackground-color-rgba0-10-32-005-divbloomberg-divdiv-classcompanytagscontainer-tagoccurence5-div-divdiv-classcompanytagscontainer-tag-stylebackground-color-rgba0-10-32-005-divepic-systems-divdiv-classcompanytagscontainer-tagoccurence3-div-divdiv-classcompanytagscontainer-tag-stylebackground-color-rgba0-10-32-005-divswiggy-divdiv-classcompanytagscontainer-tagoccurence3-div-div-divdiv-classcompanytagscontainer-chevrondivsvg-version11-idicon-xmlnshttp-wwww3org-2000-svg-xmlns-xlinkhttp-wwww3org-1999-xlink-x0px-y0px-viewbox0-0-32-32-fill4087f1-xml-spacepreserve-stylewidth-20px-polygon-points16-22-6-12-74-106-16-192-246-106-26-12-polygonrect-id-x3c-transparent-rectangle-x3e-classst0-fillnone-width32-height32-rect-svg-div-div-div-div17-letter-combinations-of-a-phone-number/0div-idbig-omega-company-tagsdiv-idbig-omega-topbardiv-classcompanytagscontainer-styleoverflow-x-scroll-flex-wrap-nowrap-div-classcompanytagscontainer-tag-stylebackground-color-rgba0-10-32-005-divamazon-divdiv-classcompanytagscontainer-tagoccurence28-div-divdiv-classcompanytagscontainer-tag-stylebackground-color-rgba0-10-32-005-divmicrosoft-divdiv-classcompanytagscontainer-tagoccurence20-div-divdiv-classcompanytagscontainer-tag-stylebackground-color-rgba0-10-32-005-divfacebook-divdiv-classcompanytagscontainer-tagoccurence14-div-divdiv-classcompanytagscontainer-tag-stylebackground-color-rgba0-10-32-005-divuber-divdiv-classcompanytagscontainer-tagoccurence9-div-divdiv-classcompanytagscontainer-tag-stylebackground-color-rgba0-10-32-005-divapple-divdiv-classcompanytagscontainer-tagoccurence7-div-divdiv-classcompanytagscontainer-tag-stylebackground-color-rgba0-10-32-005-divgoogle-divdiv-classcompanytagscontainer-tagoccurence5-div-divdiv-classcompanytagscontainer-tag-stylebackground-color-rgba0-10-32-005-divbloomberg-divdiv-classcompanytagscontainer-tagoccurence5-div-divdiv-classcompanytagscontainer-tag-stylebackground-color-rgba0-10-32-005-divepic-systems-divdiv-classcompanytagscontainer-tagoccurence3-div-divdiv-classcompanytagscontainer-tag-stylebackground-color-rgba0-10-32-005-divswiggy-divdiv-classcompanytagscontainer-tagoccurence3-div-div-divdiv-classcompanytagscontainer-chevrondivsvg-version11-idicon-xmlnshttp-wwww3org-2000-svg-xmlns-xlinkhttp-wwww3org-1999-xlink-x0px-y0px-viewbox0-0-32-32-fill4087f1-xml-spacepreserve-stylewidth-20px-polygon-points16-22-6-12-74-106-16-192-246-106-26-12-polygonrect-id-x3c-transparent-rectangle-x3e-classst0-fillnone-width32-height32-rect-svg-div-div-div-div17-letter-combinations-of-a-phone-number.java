class Solution {
    public List<String> letterCombinations(String digits) {
        HashMap<Character, String> hash = new HashMap<>();
        if(digits.length()<1){
            return new ArrayList<>();
        }
        hash.put('2', "abc");
        hash.put('3', "def");
        hash.put('4', "ghi");
        hash.put('5', "jkl");
        hash.put('6', "mno");
        hash.put('7', "pqrs");
        hash.put('8', "tuv");
        hash.put('9', "wxyz");
        List<String> ans = new ArrayList<>();
            backtrack(digits, hash, ans, 0, "");
        
        return ans;
    }

    void backtrack(String digits, HashMap<Character, String> hash, List<String> ans, int idx, String subans) {
        if (idx == digits.length()) {
            ans.add(subans);
            return;
        }

        char currentDigit = digits.charAt(idx);
            String process = hash.get(currentDigit);
            for (int i = 0; i < process.length(); i++) {
                backtrack(digits, hash, ans, idx + 1, subans + process.charAt(i));
            
        }
    }
}
